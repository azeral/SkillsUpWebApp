package net.bondar.webapp.impl;

import net.bondar.webapp.MessageDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class MessageDaoImpl implements MessageDao {
    Map<Long, Message> messageMap = new HashMap<>();

    @Override
    public void storeMessage(Message message) {
        messageMap.put(message.getMessage_id(), message);
    }

    @Override
    public List<Message> getConversation(Contact firstContact, Contact secondContact) {
        List<Message> messageList=new ArrayList<>();
        for(Map.Entry<Contact, List<Message>>mapEntry:firstContact.getConversation().entrySet()){
            if(mapEntry.getKey().equals(secondContact)){
                messageList=mapEntry.getValue();
            }
        }
        return messageList;
    }
}
