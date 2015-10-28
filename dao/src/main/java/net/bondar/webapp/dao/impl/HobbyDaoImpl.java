package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.HobbyDto;
import net.bondar.webapp.dao.HobbyDao;
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
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addHobbyToContact(ContactDto contact, HobbyDto hobbyDto) {

    }

    @Override
    public long create(HobbyDto hobbyDto) {
        return 0;
    }

    @Override
    public Collection<HobbyDto> getAll() {
        return null;
    }
}
