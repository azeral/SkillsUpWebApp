package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PlaceDto;
import net.bondar.webapp.dao.PlaceDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class PlaceDaoImpl implements PlaceDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPlaceToContact(ContactDto contact, PlaceDto placeDto) {

    }

    @Override
    public long create(PlaceDto placeDto) {
        return 0;
    }

    @Override
    public Collection<PlaceDto> getAll() {
        return null;
    }
}
