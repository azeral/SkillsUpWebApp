package net.bondar.webapp;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PlaceDto;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface PlaceDao extends AbstractDao<PlaceDto> {
    void addPlaceToContact(ContactDto contact, PlaceDto placeDto);
}
