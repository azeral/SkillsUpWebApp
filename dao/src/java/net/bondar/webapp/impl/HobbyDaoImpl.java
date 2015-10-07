package net.bondar.webapp.impl;

import net.bondar.webapp.HobbyDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class HobbyDaoImpl implements HobbyDao {
    Map<Long, Hobby> hobbyMap=new HashMap<>();


    @Override
    public void add(Hobby hobby) {
        hobbyMap.put(hobby.getHobby_id(), hobby);
    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {
        Map<Long, Contact> contactMap=new ContactDaoImpl().contactMap;
        Set<Contact> contactSet = new HashSet<>();
        for(Map.Entry<Long, Contact> mapEntry:contactMap.entrySet()){
            Contact contact=mapEntry.getValue();
            for(Hobby contactHobby:contact.getHobbies()){
                if(contactHobby.equals(hobby)){
                    contactSet.add(contact);
                }
            }
        }
        return contactSet;
    }
}
