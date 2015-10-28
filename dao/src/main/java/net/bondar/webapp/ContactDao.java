package net.bondar.webapp;

import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;

import java.util.Set;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface ContactDao extends AbstractDao<ContactDto> {
    void deleteContact(ContactDto contact);
    ContactDto getContactByName(String firstName, String lastName);
    Set<ContactDto> getAllContactsWithHobby(HobbyDto hobbyDto);
    Set<ContactDto> getAllContactsForPlace(PlaceDto placeDto);
    ChatDto getConversation(ContactDto who, ContactDto with);


}
