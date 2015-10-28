package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.MessageDto;
import net.bondar.webapp.dao.MessageDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void storeMessage(MessageDto message) {

    }

    @Override
    public List<MessageDto> getConversation(ContactDto firstContact, ContactDto secondContact) {
        return null;
    }
}
