package net.bondar.webapp.dao;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface HobbyDao extends AbstractDao<HobbyDto> {
    void addHobbyToContact(ContactDto contact, HobbyDto hobbyDto);
}
