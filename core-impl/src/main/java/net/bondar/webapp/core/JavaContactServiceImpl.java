package net.bondar.webapp.core;

import net.bondar.webapp.api.JavaContactService;
import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;
import net.bondar.webapp.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;


/**
 * Created by AzeraL on 16.09.2015.
 */
@Service
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
    public void createContact(String firstName, String lastName, LocalDate birthDate) {

    }

    @Override
    public ContactDto getContactByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public void createHobby(String title, String description) {

    }

    @Override
    public void addHobbyToContact(ContactDto contact, HobbyDto hobbyDto) {

    }

    @Override
    public void createPlace(String title, String description, double latitude, double longitude) {

    }

    @Override
    public void addPlaceToContact(ContactDto contact, PlaceDto placeDto) {

    }

    @Override
    public void addFriendship(ContactDto who, ContactDto with) {

    }

    @Override
    public void createChat(ContactDto userFrom, ContactDto userTo) {

    }

    @Override
    public Set<ContactDto> getFriendList(ContactDto contact) {
        return null;
    }

    @Override
    public ChatDto getConversation(ContactDto who, ContactDto with) {
        return null;
    }

    @Override
    public void deleteContact(ContactDto contact) throws Exception {

    }

    @Override
    public void removeFriendship(ContactDto firstContact, ContactDto secondContact) throws Exception {

    }

    @Override
    public Collection<ContactDto> getAllContacts() {
        return null;
    }

    @Override
    public Collection<ContactDto> getAllContactsWithHobby(HobbyDto hobbyDto) {
        return null;
    }

    @Override
    public Collection<ContactDto> getAllContactsForPlace(PlaceDto placeDto) {
        return null;
    }
}
