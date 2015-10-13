package net.bondar.webapp.impl;

import net.bondar.webapp.ContactDao;
import net.bondar.webapp.PlaceDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Place;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao{
    Map<Long, Place> placeMap=new HashMap<>();

    @Override
    public void create(Place place) {
        placeMap.put(place.getPlace_id(), place);
    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {
        Set<Place> places = contact.getPlaces();
        if(places.size()==0){
            Set<Place> newPlaceSet = new HashSet<>();
            newPlaceSet.add(place);
            contact.setPlaces(newPlaceSet);
        }else {
            places.add(place);
            contact.setPlaces(places);
        }
    }

    @Override
    public Collection<Place> getAll() {
        return placeMap.values();
    }
}
