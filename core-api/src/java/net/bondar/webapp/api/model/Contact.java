package net.bondar.webapp.api.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Contact {
    private long contact_id;
    private  String firstName;
    private  String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> places;
    private List<Contact> friendship;
    private Map<Contact, List<Message>> conversation;
    private Map<Contact, List<Post>> post;

    public long getContact_id() {
        return contact_id;
    }

    public void setContact_id(long contact_id) {
        this.contact_id = contact_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public List<Contact> getFriendship() {
        return friendship;
    }

    public void setFriendship(List<Contact> friendship) {
        this.friendship = friendship;
    }

    public Map<Contact, List<Message>> getConversation() {
        return conversation;
    }

    public void setConversation(Map<Contact, List<Message>> conversation) {
        this.conversation = conversation;
    }

    public Map<Contact, List<Post>> getPost() {
        return post;
    }

    public void setPost(Map<Contact, List<Post>> post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (contact_id != contact.contact_id) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(contact.birthDate) : contact.birthDate != null) return false;
        if (hobbies != null ? !hobbies.equals(contact.hobbies) : contact.hobbies != null) return false;
        return !(places != null ? !places.equals(contact.places) : contact.places != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (contact_id ^ (contact_id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contact_id=" + contact_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", places=" + places +
                '}';
    }
}
