package net.bondar.webapp;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.MessageDto;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface MessageDao {
    void storeMessage(MessageDto message);
    List<MessageDto> getConversation(ContactDto firstContact, ContactDto secondContact);

}
