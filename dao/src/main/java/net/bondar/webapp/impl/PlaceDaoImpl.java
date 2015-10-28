package net.bondar.webapp.impl;

import net.bondar.webapp.PlaceDao;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PlaceDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao{

    @Override
    public void addPlaceToContact(ContactDto contact, PlaceDto placeDto) {

    }

    @Override
    public void create(PlaceDto placeDto) {

    }

    @Override
    public Collection<PlaceDto> getAll() {
        return null;
    }
}
