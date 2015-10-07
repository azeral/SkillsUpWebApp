package net.bondar.webapp.impl;

import net.bondar.webapp.ContactDao;
import net.bondar.webapp.api.model.Contact;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class ContactDaoImpl implements ContactDao {
    Map<Long, Contact> contactMap = new HashMap<>();

    @Override
    public void add(Contact contact) {
        contactMap.put(contact.getContact_id(), contact);
    }
    @Override
    public void deleteContact(Contact contact) {
        Iterator<Map.Entry<Long, Contact>> iterator = contactMap.entrySet().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getKey().equals(contact.getContact_id())){
                iterator.remove();
            }
        }
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {
        firstContact.getFriendship().add(secondContact);
    }

    @Override
    public void removeFriendship(Contact firstContact, Contact secondContact) {
        for(int i=0;i<firstContact.getFriendship().size(); i++){
            if(firstContact.getFriendship().get(i).getContact_id()==secondContact.getContact_id()){
                firstContact.getFriendship().remove(i);
            }
        }
    }
}
