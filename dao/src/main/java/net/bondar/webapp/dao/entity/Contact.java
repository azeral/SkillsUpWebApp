package net.bondar.webapp.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


/**
 * Created by Azeral on 28.10.2015.
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends AbstractEntity{

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTACT_HOBBY",
            joinColumns = @JoinColumn(name = "CONTACT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "HOBBY_ID", referencedColumnName = "ID")
    )
    private Set<Hobby> hobbies;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTACT_PLACE",
            joinColumns = @JoinColumn(name = "CONTACT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PLACE_ID", referencedColumnName = "ID")
    )
    private Set<Place> places;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FRIEND_ID", referencedColumnName = "ID")
    private Set<Contact> friendList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHAT_ID", referencedColumnName = "ID")
    private Set<Chat> conversation;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID", referencedColumnName = "ID")
    private Set<Post> posts;

    public Contact(){
        super();
    }

    public  Contact(long id){
        super(id);
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

    public Set<Contact> getFriendList() {
        return friendList;
    }

    public void setFriendList(Set<Contact> friendList) {
        this.friendList = friendList;
    }

    public Set<Chat> getConversation() {
        return conversation;
    }

    public void setConversation(Set<Chat> conversation) {
        this.conversation = conversation;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(contact.birthDate) : contact.birthDate != null) return false;
        if (hobbies != null ? !hobbies.equals(contact.hobbies) : contact.hobbies != null) return false;
        if (places != null ? !places.equals(contact.places) : contact.places != null) return false;
        if (friendList != null ? !friendList.equals(contact.friendList) : contact.friendList != null) return false;
        if (conversation != null ? !conversation.equals(contact.conversation) : contact.conversation != null)
            return false;
        return !(posts != null ? !posts.equals(contact.posts) : contact.posts != null);

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (friendList != null ? friendList.hashCode() : 0);
        result = 31 * result + (conversation != null ? conversation.hashCode() : 0);
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        return result;
    }
}
