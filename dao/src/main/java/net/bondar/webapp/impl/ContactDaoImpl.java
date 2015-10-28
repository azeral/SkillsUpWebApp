package net.bondar.webapp.impl;

import net.bondar.webapp.ContactDao;
import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    @Override
    public void deleteContact(ContactDto contact) {

    }

    @Override
    public ContactDto getContactByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Set<ContactDto> getAllContactsWithHobby(HobbyDto hobbyDto) {
        return null;
    }

    @Override
    public Set<ContactDto> getAllContactsForPlace(PlaceDto placeDto) {
        return null;
    }

    @Override
    public ChatDto getConversation(ContactDto who, ContactDto with) {
        return null;
    }

    @Override
    public void create(ContactDto contactDto) {

    }

    @Override
    public Collection<ContactDto> getAll() {
        return null;
    }
}
