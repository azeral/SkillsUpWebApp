package net.bondar.webapp.impl;

import net.bondar.webapp.MessageDao;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.MessageDto;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class MessageDaoImpl implements MessageDao {

    @Override
    public void storeMessage(MessageDto message) {

    }

    @Override
    public List<MessageDto> getConversation(ContactDto firstContact, ContactDto secondContact) {
        return null;
    }
}
