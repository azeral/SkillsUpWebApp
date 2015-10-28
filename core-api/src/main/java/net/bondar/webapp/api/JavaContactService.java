package net.bondar.webapp.api;

import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public interface JavaContactService {
    void createContact(String firstName, String lastName, LocalDate birthDate);
    ContactDto getContactByName(String firstName, String lastName);
    void createHobby(String title, String description);
    void addHobbyToContact(ContactDto contact, HobbyDto hobbyDto);
    void createPlace(String title, String description, double latitude, double longitude);
    void addPlaceToContact(ContactDto contact, PlaceDto placeDto);
    void addFriendship(ContactDto who, ContactDto with);
    void createChat(ContactDto userFrom, ContactDto userTo);
    Set<ContactDto> getFriendList(ContactDto contact);
    ChatDto getConversation(ContactDto who, ContactDto with);
    void deleteContact(ContactDto contact) throws Exception;
    void removeFriendship(ContactDto firstContact, ContactDto secondContact) throws Exception;
    Collection<ContactDto> getAllContacts();
    Collection<ContactDto> getAllContactsWithHobby(HobbyDto hobbyDto);
    Collection<ContactDto> getAllContactsForPlace(PlaceDto placeDto);
}
