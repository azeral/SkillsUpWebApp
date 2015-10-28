package net.bondar.webapp.dao.impl;

import net.bondar.webapp.dao.HobbyDao;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {

    @Override
    public void addHobbyToContact(ContactDto contact, HobbyDto hobbyDto) {

    }

    @Override
    public void create(HobbyDto hobbyDto) {

    }

    @Override
    public Collection<HobbyDto> getAll() {
        return null;
    }
}
