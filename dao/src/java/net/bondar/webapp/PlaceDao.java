package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Place;

import java.util.Set;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface PlaceDao extends AbstractDao<Place> {
    void addPlaceToContact(Contact contact, Place place);
}
