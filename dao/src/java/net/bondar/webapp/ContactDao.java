package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface ContactDao extends AbstractDao<Contact> {
    void deleteContact(Contact contact);
    void addFriendship(Contact firstContact, Contact secondContact);
    void removeFriendship(Contact firstContact, Contact secondContact);

}
