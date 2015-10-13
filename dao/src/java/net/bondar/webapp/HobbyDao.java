package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;

import java.util.Collection;
import java.util.Set;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface HobbyDao extends AbstractDao<Hobby> {
    void addHobbyToContact(Contact contact, Hobby hobby);
}
