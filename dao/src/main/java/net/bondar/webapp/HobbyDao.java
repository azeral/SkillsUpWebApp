package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface HobbyDao extends AbstractDao<Hobby> {
    void addHobbyToContact(Contact contact, Hobby hobby);
}
