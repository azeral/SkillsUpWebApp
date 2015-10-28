package net.bondar.webapp;

import net.bondar.webapp.api.JavaContactService;
import net.bondar.webapp.api.exception.*;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;
import net.bondar.webapp.core.JavaContactServiceImpl;
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
//    private String contact1FirstName = "Ivan";
//    private String contact1LastName = "First";
//    private String contact2FirstName = "Max";
//    private String contact2LastName = "Second";
//
//    @Mock
//    private ChatDao chatDao;
//    @Mock
//    private ContactDao contactDao;
//    @Mock
//    private HobbyDao hobbyDao;
//    @Mock
//    private PlaceDao placeDao;
//    @Mock
//    private PostDao postDao;
//
//    @InjectMocks
//    private JavaContactService service = new JavaContactServiceImpl();
//
//    @Before
//    public void initMocks(){
//    ContactDto ivan = new ContactDto(contact1FirstName, contact1LastName, LocalDate.of(1990, Month.SEPTEMBER, 12));
//        doReturn(ivan).when(contactDao).getContactByName(contact1FirstName, contact1LastName);
//    ContactDto max = new ContactDto(contact2FirstName, contact2LastName, LocalDate.of(1990, Month.AUGUST, 13));
//        doReturn(max).when(contactDao).getContactByName(contact2FirstName, contact2LastName);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateContact_NullFirstName(){
//        ContactDto contactWithNullFirstName = new ContactDto(null, contact1LastName, LocalDate.of(1990, Month.SEPTEMBER, 12));
//        service.createContact(contactWithNullFirstName.getFirstName(), contactWithNullFirstName.getLastName(), contactWithNullFirstName.getBirthDate());
//        assertNotNull(contactWithNullFirstName.getFirstName() == null);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateContact_IncorrectFirstName(){
//        ContactDto contactWithFirstNameContainsDigit = new ContactDto("qwerty12", contact1LastName, LocalDate.of(1990, Month.SEPTEMBER, 12));
//        service.createContact(contactWithFirstNameContainsDigit.getFirstName(), contactWithFirstNameContainsDigit.getLastName(), contactWithFirstNameContainsDigit.getBirthDate());
//        assertFalse(!contactWithFirstNameContainsDigit.getFirstName().matches("^\\D*$"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateContact_NullLastName(){
//        ContactDto contactWithNullLastName = new ContactDto(contact1FirstName, null, LocalDate.of(1990, Month.SEPTEMBER, 12));
//        service.createContact(contactWithNullLastName.getFirstName(), contactWithNullLastName.getLastName(), contactWithNullLastName.getBirthDate());
//        assertNotNull(contactWithNullLastName.getLastName() == null);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateContact_IncorrectLastName(){
//        ContactDto contactWithLastNameContainsDigit = new ContactDto(contact1FirstName, "qwerty12", LocalDate.of(1990, Month.SEPTEMBER, 12));
//        service.createContact(contactWithLastNameContainsDigit.getFirstName(), contactWithLastNameContainsDigit.getLastName(), contactWithLastNameContainsDigit.getBirthDate());
//        assertFalse(!contactWithLastNameContainsDigit.getLastName().matches("^\\D*$"));
//    }
//
//    @Test(expected = EmptyContactCollectionException.class)
//    public void testDeleteContact_EmptyContactCollection() throws Exception {
//        ContactDto contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        Collection<ContactDto> contacts = new HashSet<>();
//        doReturn(contacts).when(contactDao).getAll();
//        service.deleteContact(contact);
//        assertTrue(!contacts.isEmpty());
//
//    }
//
//    @Test (expected = NoSuchContactException.class)
//    public void testDeleteContact_NoSuchContact() throws Exception {
//        ContactDto contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        ContactDto deletingContact = contactDao.getContactByName(contact2FirstName, contact2LastName);
//        Collection<ContactDto> contacts = new HashSet<>();
//        contacts.add(contact);
//        doReturn(contacts).when(contactDao).getAll();
//        service.deleteContact(deletingContact);
//    }
//
//    @Test(expected = NoSuchContactException.class)
//    public void testGetContactByName_NoSuchContact(){
//        ContactDto gettingContact = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        doReturn(null).when(contactDao).getContactByName(gettingContact.getFirstName(), gettingContact.getLastName());
//        assertNotNull(service.getContactByName(gettingContact.getFirstName(), gettingContact.getLastName()));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateHobby_NullTitle(){
//        HobbyDto hobbyDtoWithNullTitle = new HobbyDto(null, "sport");
//        service.createHobby(hobbyDtoWithNullTitle.getTitle(), hobbyDtoWithNullTitle.getDescription());
//        assertNotNull(hobbyDtoWithNullTitle.getTitle() == null);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreateHobby_NullDescription(){
//        HobbyDto hobbyDtoWithNullDescription = new HobbyDto("Sport", null);
//        service.createHobby(hobbyDtoWithNullDescription.getTitle(), hobbyDtoWithNullDescription.getDescription());
//        assertNotNull(hobbyDtoWithNullDescription.getDescription() == null);
//    }
//
//    @Test (expected = ExistingHobbyException.class)
//    public void testAddHobbyToContact_ExistingHobby(){
//        ContactDto contact = new ContactDto("ivan", "ivanov", LocalDate.of(1900, Month.SEPTEMBER, 4));
//        HobbyDto hobbyDto =new HobbyDto("Sport", "Play football");
//        contact.getHobbies().add(hobbyDto);
//        service.addHobbyToContact(contact, hobbyDto);
//        assertFalse(contact.getHobbies().contains(hobbyDto));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//     public void testCreatePlace_NullTitle(){
//        PlaceDto placeDtoWithNullTitle = new PlaceDto(null, "My home", 21, 12);
//        service.createPlace(placeDtoWithNullTitle.getTitle(), placeDtoWithNullTitle.getDescription(), placeDtoWithNullTitle.getLatitude(), placeDtoWithNullTitle.getLongitude());
//        assertNotNull(placeDtoWithNullTitle.getTitle() == null);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreatePlace_NullDescription(){
//        PlaceDto placeDtoWithNullDescription = new PlaceDto("Home", null, 21, 12);
//        service.createPlace(placeDtoWithNullDescription.getTitle(), placeDtoWithNullDescription.getDescription(), placeDtoWithNullDescription.getLatitude(), placeDtoWithNullDescription.getLongitude());
//        assertNotNull(placeDtoWithNullDescription.getDescription() == null);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreatePlace_IncorrectLatitude(){
//        PlaceDto placeDtoWithNegativeLatitude = new PlaceDto("Home", "My home", -120, 12);
//        service.createPlace(placeDtoWithNegativeLatitude.getTitle(), placeDtoWithNegativeLatitude.getDescription(), placeDtoWithNegativeLatitude.getLatitude(), placeDtoWithNegativeLatitude.getLongitude());
//        assertTrue(placeDtoWithNegativeLatitude.getLatitude() >= -90 && placeDtoWithNegativeLatitude.getLatitude() <= 90);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testCreatePlace_IncorrectLongitude(){
//        PlaceDto placeDtoWithNegativeLongitude = new PlaceDto("Home", "My home", 12, -190);
//        service.createPlace(placeDtoWithNegativeLongitude.getTitle(), placeDtoWithNegativeLongitude.getDescription(), placeDtoWithNegativeLongitude.getLatitude(), placeDtoWithNegativeLongitude.getLongitude());
//        assertTrue(placeDtoWithNegativeLongitude.getLongitude() >= -180 && placeDtoWithNegativeLongitude.getLongitude()<=180);
//    }
//
//    @Test (expected = ExistingPlaceException.class)
//    public void testAddPlaceToContact_ExistingPlace(){
//        ContactDto contact = new ContactDto("Ivan", "Ivanov", LocalDate.of(1899, Month.DECEMBER, 25));
//        PlaceDto placeDto = new PlaceDto("Home", "My Home", 12, 14);
//        contact.getPlaces().add(placeDto);
//        service.addPlaceToContact(contact, placeDto);
//        assertFalse(contact.getPlaces().contains(placeDto));
//    }
//
//    @Test(expected = ExistingFriendException.class)
//    public void testAddFriendship_ExistingFriend(){
//        ContactDto contact = contactDao.getContactByName("Ivan", "First");
//        ContactDto friend = contactDao.getContactByName("Max", "Second");
//        contact.getFriendList().add(friend);
//        service.addFriendship(contact, friend);
//        assertFalse(contact.getFriendList().contains(friend));
//        service.addFriendship(friend, contact);
//        assertFalse(friend.getFriendList().contains(contact));
//    }
//
//    @Test(expected = NoSuchFriendException.class)
//    public void testRemoveFriendship_NoSuchFriend() throws Exception {
//        ContactDto contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        ContactDto friend = contactDao.getContactByName(contact2FirstName, contact2LastName);
//        service.removeFriendship(contact, friend);
//        assertTrue(contact.getFriendList().contains(friend));
//    }
////    @Ignore("bad implenetation")
////    @Test(expected = ExistingChatException.class)
////    public  void testCreateChat_ExistingChat(){
////        Contact userFrom = contactDao.getContactByName(contact1FirstName, contact1LastName);
////        Contact userTo = contactDao.getContactByName(contact2FirstName, contact2LastName);
////        ChatDto chat = new ChatDto(userFrom, userTo);
////        userFrom.getConversation().add(chat);
////        userTo.getConversation().add(chat);
////        service.createChat(userFrom, userTo);
////        assertTrue(!userFrom.getConversation().contains(chat));
////    }
//
//    @Test(expected = NoSuchConversationException.class)
//    public void testGetConversation_NoSuchConversation(){
//        ContactDto who = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        ContactDto with = contactDao.getContactByName(contact2FirstName, contact2LastName);
//        doReturn(null).when(contactDao).getConversation(who, with);
//        assertNotNull(service.getConversation(who, with));
//    }
//
//    @Test(expected = EmptyFriendListException.class)
//    public void testGetFriendList_EmptyFriendList(){
//        ContactDto contact = contactDao.getContactByName(contact1FirstName, contact1LastName);
//        service.getFriendList(contact);
//        assertTrue(!contact.getFriendList().isEmpty());
//    }
//
//    @Test(expected = EmptyContactCollectionException.class)
//    public void testGetAllContacts_EmptyContactsBase(){
//        Collection<ContactDto> contacts = new HashSet<>();
//        doReturn(contacts).when(contactDao).getAll();
//        assertTrue(!service.getAllContacts().isEmpty());
//    }
//
//    @Test(expected = ContactsNotFoundException.class)
//    public void testGetAllContactsWithHobby_NotFound(){
//        Collection<ContactDto> contacts = new HashSet<>();
//        HobbyDto hobbyDto = new HobbyDto("Sport", "Play football");
//        doReturn(contacts).when(contactDao).getAllContactsWithHobby(hobbyDto);
//        assertTrue(!service.getAllContactsWithHobby(hobbyDto).isEmpty());
//    }
//
//    @Test(expected = ContactsNotFoundException.class)
//    public void testGetAllContactsForPlace_NotFound(){
//        Collection<ContactDto> contacts = new HashSet<>();
//        PlaceDto placeDto = new PlaceDto("Home", "My home", 12, 21);
//        doReturn(contacts).when(contactDao).getAllContactsForPlace(placeDto);
//        assertTrue(!service.getAllContactsForPlace(placeDto).isEmpty());
//    }

}
