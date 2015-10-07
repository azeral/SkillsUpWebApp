package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Message;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface MessageDao {
    void storeMessage(Message message);
    List<Message> getConversation(Contact firstContact, Contact secondContact);

}
