package net.bondar.webapp.impl;

import net.bondar.webapp.ContactDao;
import net.bondar.webapp.api.exception.NoSuchContactException;
import net.bondar.webapp.api.model.Chat;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import net.bondar.webapp.api.model.Place;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class ContactDaoImpl implements ContactDao {
    Map<Long, Contact> contactMap = new HashMap<>();

    @Override
    public void create(Contact contact) {
        contactMap.put(contact.getContact_id(), contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactMap.remove(contact.getContact_id());
    }

    @Override
    public Contact getContactByName(String firstName, String lastName) {
        Contact resultContact=null;
        Collection<Contact> contacts = getAll();
        for(Contact contact:contacts){
            if(contact.getFirstName().equals(firstName)&& contact.getLastName().equals(lastName)){
                resultContact=contact;
            }
        }
        return resultContact;
    }

    @Override
    public Collection<Contact> getAll() {
        return contactMap.values();
    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {
        Set<Contact> resultSet = new HashSet<>();
        Collection<Contact> contacts = getAll();
        for(Contact contact:contacts){
            if(contact.getHobbies().contains(hobby)){
                resultSet.add(contact);
            }
        }
        return resultSet;
    }

    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        Set<Contact> resultSet = new HashSet<>();
        Collection<Contact> contacts = getAll();
        for(Contact contact:contacts){
            if(contact.getPlaces().contains(place)){
                resultSet.add(contact);
            }
        }
        return resultSet;
    }

    @Override
    public Chat getConversation(Contact who, Contact with) {
        Chat result=null;
        for(Chat chat:who.getConversation()){
            if(chat.getUserTo().equals(with)){
                result=chat;
            }
        }
        return result;
    }
}
