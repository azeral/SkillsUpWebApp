package net.bondar.webapp.api.model;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class ContactDto extends ModelDto{

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<HobbyDto> hobbies;
    private Set<PlaceDto> places;
    private Set<ContactDto> friendList;
    private Set<ChatDto> conversation;
    private Set<PostDto> posts;

    public ContactDto(){
       super();
    }

    public ContactDto(long id){
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

    public Set<HobbyDto> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<HobbyDto> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<PlaceDto> getPlaces() {
        return places;
    }

    public void setPlaces(Set<PlaceDto> places) {
        this.places = places;
    }

    public Set<ContactDto> getFriendList() {
        return friendList;
    }

    public void setFriendList(Set<ContactDto> friendList) {
        this.friendList = friendList;
    }

    public Set<ChatDto> getConversation() {
        return conversation;
    }

    public void setConversation(Set<ChatDto> conversation) {
        this.conversation = conversation;
    }

    public Set<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(Set<PostDto> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDto that = (ContactDto) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (hobbies != null ? !hobbies.equals(that.hobbies) : that.hobbies != null) return false;
        if (places != null ? !places.equals(that.places) : that.places != null) return false;
        if (friendList != null ? !friendList.equals(that.friendList) : that.friendList != null) return false;
        if (conversation != null ? !conversation.equals(that.conversation) : that.conversation != null) return false;
        return !(posts != null ? !posts.equals(that.posts) : that.posts != null);

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

    @Override
    public String toString() {
        return "ContactDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", places=" + places +
                ", friendList=" + friendList +
                ", conversation=" + conversation +
                ", posts=" + posts +
                '}';
    }
}
