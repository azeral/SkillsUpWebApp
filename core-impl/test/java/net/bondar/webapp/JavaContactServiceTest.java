package net.bondar.webapp;

import net.bondar.webapp.api.JavaContactService;
import net.bondar.webapp.api.exception.*;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import net.bondar.webapp.api.model.Place;
import net.bondar.webapp.core.JavaContactServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

/**
 * Created by AzeraL on 12.10.2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class JavaContactServiceTest {
    private String contact1FirstName = "Ivan";
    private String contact1LastName = "First";
    private String contact2FirstName = "Max";
    private String contact2LastName = "Second";

    @Mock
    private ChatDao chatDao;
    @Mock
    private ContactDao contactDao;
    @Mock
    private HobbyDao hobbyDao;
    @Mock
    private PlaceDao placeDao;
    @Mock
    private PostDao postDao;

    @InjectMocks
    private JavaContactService service = new JavaContactServiceImpl();

    @Before
    public void initMocks(){
    Contact ivan = new Contact(contact1FirstName, contact1LastName, LocalDate.of(1990, Month.SEPTEMBER, 12));
        doReturn(ivan).when(contactDao).getContactByName(contact1FirstName, contact1LastName);
    Contact max = new Contact(contact2FirstName, contact2LastName, LocalDate.of(1990, Month.AUGUST, 13));
        doReturn(max).when(contactDao).getContactByName(contact2FirstName, contact2LastName);
    }

    @Test(expected = NullContactFirstNameException.class)
    public void testCreateContact_NullFirstName(){
        Contact contactWithNullFirstName = contactDao.getContactByName(contact1FirstName, contact1LastName);
        contactWithNullFirstName.setFirstName(null);
        service.createContact(contactWithNullFirstName.getFirstName(), contactWithNullFirstName.getLastName(), contactWithNullFirstName.getBirthDate());
        assertNotNull(contactWithNullFirstName.getFirstName() == null);
    }

    @Test(expected = IncorrectContactFirstNameException.class)
    public void testCreateContact_IncorrectFirstName(){
        Contact contactWithFirstNameContainsDigit = contactDao.getContactByName(contact1FirstName, contact1LastName);
        contactWithFirstNameContainsDigit.setFirstName("qwerty12");
        service.createContact(contactWithFirstNameContainsDigit.getFirstName(), contactWithFirstNameContainsDigit.getLastName(), contactWithFirstNameContainsDigit.getBirthDate());
        assertFalse(!contactWithFirstNameContainsDigit.getFirstName().matches("^\\D*$"));
    }

    @Test(expected = NullContactLastNameException.class)
    public void testCreateContact_NullLastName(){
        Contact contactWithNullLastName = contactDao.getContactByName(contact1FirstName, contact1LastName);
        contactWithNullLastName.setLastName(null);
        service.createContact(contactWithNullLastName.getFirstName(), contactWithNullLastName.getLastName(), contactWithNullLastName.getBirthDate());
        assertNotNull(contactWithNullLastName.getLastName() == null);
    }
    @Test(expected = IncorrectContactLastNameException.class)
    public void testCreateContact_IncorrectLastName(){
        Contact contactWithLastNameContainsDigit = contactDao.getContactByName(contact1FirstName, contact1LastName);
        contactWithLastNameContainsDigit.setLastName("qwerty12");
        service.createContact(contactWithLastNameContainsDigit.getFirstName(), contactWithLastNameContainsDigit.getLastName(), contactWithLastNameContainsDigit.getBirthDate());
        assertFalse(!contactWithLastNameContainsDigit.getLastName().matches("^\\D*$"));
    }

    @Test(expected = EmptyContactCollectionException.class)
    public void testDeleteContact_EmptyContactCollection() throws Exception {
        Contact contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
        Collection<Contact> contacts = new HashSet<>();
        doReturn(contacts).when(contactDao).getAll();
        service.deleteContact(contact);
        assertTrue(!contacts.isEmpty());

    }

    @Test (expected = NoSuchContactException.class)
    public void testDeleteContact_NoSuchContact() throws Exception {
        Contact contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
        Contact deletingContact = contactDao.getContactByName(contact2FirstName, contact2LastName);
        Collection<Contact> contacts = new HashSet<>();
        contacts.add(contact);
        doReturn(contacts).when(contactDao).getAll();
        service.deleteContact(deletingContact);
        assertTrue(contacts.contains(deletingContact));
    }

    @Test(expected = NoSuchContactException.class)
    public void testGetContactByName_NoSuchContact(){
        Contact gettingContact = contactDao.getContactByName(contact1FirstName, contact1LastName);
        doReturn(null).when(contactDao).getContactByName(gettingContact.getFirstName(), gettingContact.getLastName());
        assertNotNull(service.getContactByName(gettingContact.getFirstName(), gettingContact.getLastName()));
    }

    @Test(expected = NullHobbyTitleException.class)
    public void testCreateHobby_NullTitle(){
        Hobby hobbyWithNullTitle = new Hobby(null, "sport");
        service.createHobby(hobbyWithNullTitle.getTitle(), hobbyWithNullTitle.getDescription());
        assertNotNull(hobbyWithNullTitle.getTitle() == null);
    }

    @Test(expected = NullHobbyDescriptionException.class)
    public void testCreateHobby_NullDescription(){
        Hobby hobbyWithNullDescription = new Hobby("Sport", null);
        service.createHobby(hobbyWithNullDescription.getTitle(), hobbyWithNullDescription.getDescription());
        assertNotNull(hobbyWithNullDescription.getDescription() == null);
    }

    @Test (expected = ExistingHobbyException.class)
    public void testAddHobbyToContact_ExistingHobby(){
        Contact contact = new Contact("ivan", "ivanov", LocalDate.of(1900, Month.SEPTEMBER, 4));
        Hobby hobby=new Hobby("Sport", "Play football");
        contact.getHobbies().add(hobby);
        service.addHobbyToContact(contact, hobby);
        assertFalse(contact.getHobbies().contains(hobby));
    }

    @Test(expected = NullPlaceTitleException.class)
     public void testCreatePlace_NullTitle(){
        Place placeWithNullTitle = new Place(null, "My home", 21, 12);
        service.createPlace(placeWithNullTitle.getTitle(), placeWithNullTitle.getDescription(), placeWithNullTitle.getLatitude(), placeWithNullTitle.getLongitude());
        assertNotNull(placeWithNullTitle.getTitle() == null);
    }

    @Test(expected = NullPlaceDescriptionException.class)
    public void testCreatePlace_NullDescription(){
        Place placeWithNullDescription = new Place("Home", null, 21, 12);
        service.createPlace(placeWithNullDescription.getTitle(), placeWithNullDescription.getDescription(), placeWithNullDescription.getLatitude(), placeWithNullDescription.getLongitude());
        assertNotNull(placeWithNullDescription.getDescription() == null);
    }

    @Test(expected = IncorrectPlaceLatitudeException.class)
    public void testCreatePlace_IncorrectLatitude(){
        Place placeWithNegativeLatitude = new Place("Home", "My home", -120, 12);
        service.createPlace(placeWithNegativeLatitude.getTitle(), placeWithNegativeLatitude.getDescription(), placeWithNegativeLatitude.getLatitude(), placeWithNegativeLatitude.getLongitude());
        assertTrue(placeWithNegativeLatitude.getLatitude() >= -90 && placeWithNegativeLatitude.getLatitude() <= 90);
    }

    @Test(expected = IncorrectPlaceLongitudeException.class)
    public void testCreatePlace_IncorrectLongitude(){
        Place placeWithNegativeLongitude = new Place("Home", "My home", 12, -190);
        service.createPlace(placeWithNegativeLongitude.getTitle(), placeWithNegativeLongitude.getDescription(), placeWithNegativeLongitude.getLatitude(), placeWithNegativeLongitude.getLongitude());
        assertTrue(placeWithNegativeLongitude.getLongitude() >= -180 && placeWithNegativeLongitude.getLongitude()<=180);
    }

    @Test (expected = ExistingPlaceException.class)
    public void testAddPlaceToContact_ExistingPlace(){
        Contact contact = new Contact("Ivan", "Ivanov", LocalDate.of(1899, Month.DECEMBER, 25));
        Place place = new Place("Home", "My Home", 12, 14);
        contact.getPlaces().add(place);
        service.addPlaceToContact(contact, place);
        assertFalse(contact.getPlaces().contains(place));
    }

    @Test(expected = ExistingFriendException.class)
    public void testAddFriendship_ExistingFriend(){
        Contact contact = contactDao.getContactByName("Ivan", "First");
        Contact friend = contactDao.getContactByName("Max", "Second");
        contact.getFriendList().add(friend);
        service.addFriendship(contact, friend);
        assertFalse(contact.getFriendList().contains(friend));
        service.addFriendship(friend, contact);
        assertFalse(friend.getFriendList().contains(contact));
    }

    @Test(expected = NoSuchFriendException.class)
    public void testRemoveFriendship_NoSuchFriend() throws Exception {
        Contact contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
        Contact friend = contactDao.getContactByName(contact2FirstName, contact2LastName);
        service.removeFriendship(contact, friend);
        assertTrue(contact.getFriendList().contains(friend));
    }
//    @Ignore("bad implenetation")
//    @Test(expected = ExistingChatException.class)
//    public  void testCreateChat_ExistingChat(){
//        Contact userFrom = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        Contact userTo = contactDao.getContactByName(contact2FirstName, contact2LastName);
//        Chat chat = new Chat(userFrom, userTo);
//        userFrom.getConversation().add(chat);
//        userTo.getConversation().add(chat);
//        service.createChat(userFrom, userTo);
//        assertTrue(!userFrom.getConversation().contains(chat));
//    }

    @Test(expected = NoSuchConversationException.class)
    public void testGetConversation_NoSuchConversation(){
        Contact who = contactDao.getContactByName(contact1FirstName, contact1LastName);
        Contact with = contactDao.getContactByName(contact2FirstName, contact2LastName);
        doReturn(null).when(contactDao).getConversation(who, with);
        assertNotNull(service.getConversation(who, with));
    }

    @Test(expected = EmptyFriendListException.class)
    public void testGetFriendList_EmptyFriendList(){
        Contact contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
        service.getFriendList(contact);
        assertTrue(!contact.getFriendList().isEmpty());
    }

    @Test(expected = EmptyContactCollectionException.class)
    public void testGetAllContacts_EmptyContactsBase(){
        Collection<Contact> contacts = new HashSet<>();
        doReturn(contacts).when(contactDao).getAll();
        assertTrue(!service.getAllContacts().isEmpty());
    }

    @Test(expected = ContactsNotFoundException.class)
    public void testGetAllContactsWithHobby_NotFound(){
        Collection<Contact> contacts = new HashSet<>();
        Hobby hobby = new Hobby("Sport", "Play football");
        doReturn(contacts).when(contactDao).getAllContactsWithHobby(hobby);
        assertTrue(!service.getAllContactsWithHobby(hobby).isEmpty());
    }

    @Test(expected = ContactsNotFoundException.class)
    public void testGetAllContactsForPlace_NotFound(){
        Collection<Contact> contacts = new HashSet<>();
        Place place = new Place("Home", "My home", 12, 21);
        doReturn(contacts).when(contactDao).getAllContactsForPlace(place);
        assertTrue(!service.getAllContactsForPlace(place).isEmpty());
    }

}
