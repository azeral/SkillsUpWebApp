package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.api.model.PlaceDto;
import net.bondar.webapp.dao.ContactDao;
import net.bondar.webapp.dao.entity.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Set;

import static net.bondar.webapp.api.converters.EntityDtoConverter.convert;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

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
    @Transactional(readOnly = false)
    public long create(ContactDto contactDto) {
        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().save(contact);
        return contact.getId();

    }

    @Override
    public Collection<ContactDto> getAll() {
        return null;
    }
}
