package net.bondar.webapp;

import net.bondar.webapp.api.model.Chat;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import net.bondar.webapp.api.model.Place;

import java.util.Collection;
import java.util.Set;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface ContactDao extends AbstractDao<Contact> {
    void deleteContact(Contact contact);
    Contact getContactByName(String firstName, String lastName);
    Set<Contact> getAllContactsWithHobby(Hobby hobby);
    Set<Contact> getAllContactsForPlace(Place place);
    Chat getConversation(Contact who, Contact with);


}
