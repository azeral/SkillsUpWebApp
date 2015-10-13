package net.bondar.webapp.impl;

import net.bondar.webapp.HobbyDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Hobby;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {
    Map<Long, Hobby> hobbyMap=new HashMap<>();


    @Override
    public void create(Hobby hobby) {
        hobbyMap.put(hobby.getHobby_id(), hobby);
    }


    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {
        Set<Hobby> hobbies = contact.getHobbies();
        if(hobbies.size()==0){
            Set<Hobby> newHobbySet = new HashSet<>();
            newHobbySet.add(hobby);
            contact.setHobbies(newHobbySet);
        }else {
            hobbies.add(hobby);
            contact.setHobbies(hobbies);
        }
    }

    @Override
    public Collection<Hobby> getAll() {
        return hobbyMap.values();
    }
}
