package net.bondar.webapp.impl;

import net.bondar.webapp.PlaceDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Place;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class PlaceDaoImpl implements PlaceDao{
    Map<Long, Place> placeMap=new HashMap<>();

    @Override
    public void add(Place place) {
        placeMap.put(place.getPlace_id(), place);
    }

    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        Map<Long, Contact> contactMap=new ContactDaoImpl().contactMap;
        Set<Contact> contactSet = new HashSet<>();
        for(Map.Entry<Long, Contact>mapEntry:contactMap.entrySet()){
            Contact contact=mapEntry.getValue();
            for (Place contactPlace:contact.getPlaces()){
                if(contactPlace.equals(place)){
                    contactSet.add(contact);
                }
            }
        }
        return contactSet;
    }
}
