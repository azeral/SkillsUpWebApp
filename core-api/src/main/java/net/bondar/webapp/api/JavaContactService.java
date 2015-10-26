package net.bondar.webapp.api;

import net.bondar.webapp.api.model.Chat;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import net.bondar.webapp.api.model.Place;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public interface JavaContactService {
    void createContact(String firstName, String lastName, LocalDate birthDate);
    Contact getContactByName(String firstName, String lastName);
    void createHobby(String title, String description);
    void addHobbyToContact(Contact contact, Hobby hobby);
    void createPlace(String title, String description, double latitude, double longitude);
    void addPlaceToContact(Contact contact, Place place);
    void addFriendship(Contact who, Contact with);
    void createChat(Contact userFrom, Contact userTo);
    Set<Contact> getFriendList(Contact contact);
    Chat getConversation(Contact who, Contact with);
    void deleteContact(Contact contact) throws Exception;
    void removeFriendship(Contact firstContact, Contact secondContact) throws Exception;
    Collection<Contact> getAllContacts();
    Collection<Contact> getAllContactsWithHobby(Hobby hobby);
    Collection<Contact> getAllContactsForPlace(Place place);
}
