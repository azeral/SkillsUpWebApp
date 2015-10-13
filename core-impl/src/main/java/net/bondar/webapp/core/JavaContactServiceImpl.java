package net.bondar.webapp.core;

import net.bondar.webapp.*;
import net.bondar.webapp.api.JavaContactService;
import net.bondar.webapp.api.exception.*;
import net.bondar.webapp.api.model.Chat;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import net.bondar.webapp.api.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.util.*;


/**
 * Created by AzeraL on 16.09.2015.
 */
@Service
@ContextConfiguration("classpath:applicationcontext.xml")
public class JavaContactServiceImpl implements JavaContactService {
    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private ChatDao chatDao;
    @Autowired
    private PlaceDao placeDao;
    @Autowired
    private PostDao postDao;

    @Override
    public void createContact(String firstName, String lastName, LocalDate birthDate){
        if(firstName==null)throw new NullContactFirstNameException();
        else if(lastName==null) throw new NullContactLastNameException();
        else if(!firstName.matches("^\\D*$")) throw new IncorrectContactFirstNameException();
        else if(!lastName.matches("^\\D*$")) throw new IncorrectContactLastNameException();
        Contact contact = new Contact(firstName, lastName, birthDate);
        contactDao.create(contact);
    }

    @Override
    public void deleteContact(Contact contact) throws Exception {
        Collection<Contact> contacts = getAllContacts();
        if(contacts.isEmpty()) throw new EmptyContactCollectionException();
        else if(!contacts.contains(contact)) throw new NoSuchContactException();
        for(Contact user:contacts){
            if(user.getFriendList().contains(contact)){
                removeFriendship(user, contact);
            }
        }
        contactDao.deleteContact(contact);
    }

    @Override
    public Contact getContactByName(String firstName, String lastName) {
        Contact result = contactDao.getContactByName(firstName, lastName);
        if(result==null) throw new NoSuchContactException();
        return result;
    }

    @Override
    public void createHobby(String title, String description) {
        if(title==null) throw new NullHobbyTitleException();
        else if(description==null) throw new NullHobbyDescriptionException();
        Hobby hobby=new Hobby(title, description);
        hobbyDao.create(hobby);
    }

    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {
        if(contact.getHobbies().contains(hobby)) throw new ExistingHobbyException();
        hobbyDao.addHobbyToContact(contact, hobby);
    }

    @Override
    public void createPlace(String title, String description, double latitude, double longitude) {
        if(title==null) throw new NullPlaceTitleException();
        else if(description==null) throw new NullPlaceDescriptionException();
        else if(latitude<-90||latitude>90) throw new IncorrectPlaceLatitudeException();
        else if(longitude<-180||longitude>180) throw new IncorrectPlaceLongitudeException();
        Place place = new Place(title, description, latitude, longitude);
        placeDao.create(place);
    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {
        if(contact.getPlaces().contains(place)) throw new ExistingPlaceException();
        placeDao.addPlaceToContact(contact, place);
    }

    @Override
    public void addFriendship(Contact contact, Contact friend) {
        if(contact.getFriendList().contains(friend)||friend.getFriendList().contains(contact)) throw new ExistingFriendException();
        addFriend(contact, friend);
        addFriend(friend, contact);
    }

    private void addFriend (Contact contact, Contact friend){
        if(contact.getFriendList().size()==0){
            Set<Contact> newFriendList = new HashSet<>();
            newFriendList.add(friend);
            contact.setFriendList(newFriendList);
        }else{
            contact.getFriendList().add(friend);
        }
    }

    @Override
    public void removeFriendship(Contact contact, Contact friend) throws Exception {
        if(contact.getFriendList().isEmpty()||!contact.getFriendList().contains(friend)) throw new NoSuchFriendException();
        removeFriend(contact, friend);
        removeFriend(friend, contact);

    }

    private void removeFriend(Contact contact, Contact friend) throws Exception {
        if(contact.getFriendList().contains(friend)){
            contact.getFriendList().remove(friend);
        }else{
            throw new Exception("This contact is not a friend!");
        }
    }

    @Override
    public void createChat(Contact userFrom, Contact userTo) {
        Chat chat = new Chat(userFrom, userTo);
        if(userFrom.getConversation().contains(chat)) throw new ExistingChatException();
        chatDao.create(chat);
    }

    @Override
    public Chat getConversation(Contact who, Contact with) {
        Chat result = contactDao.getConversation(who, with);
        if(result==null) throw new NoSuchConversationException();
        else return result;
    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        Set<Contact> result = contact.getFriendList();
        if(result.isEmpty()) throw new EmptyFriendListException();
        else return result;
    }

    @Override
    public Collection<Contact> getAllContacts() {
        Collection<Contact> result = contactDao.getAll();
        if(result.isEmpty()) throw new EmptyContactCollectionException();
        else return result;
    }

    @Override
    public Collection<Contact> getAllContactsWithHobby(Hobby hobby) {
        Collection<Contact> result = contactDao.getAllContactsWithHobby(hobby);
        if(result.isEmpty()) throw new ContactsNotFoundException();
        else return result;
    }

    @Override
    public Collection<Contact> getAllContactsForPlace(Place place) {
        Collection<Contact> result = contactDao.getAllContactsForPlace(place);
        if(result.isEmpty()) throw new ContactsNotFoundException();
        else return result;
    }
}
