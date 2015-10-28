package net.bondar.webapp.api.model;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class ContactDto {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<HobbyDto> hobbies;
    private Set<PlaceDto> placeDtos;
    private Set<ContactDto> friendList;
    private Set<ChatDto> conversation;
    private Map<ContactDto, List<PostDto>> post;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Set<PlaceDto> getPlaceDtos() {
        return placeDtos;
    }

    public void setPlaceDtos(Set<PlaceDto> placeDtos) {
        this.placeDtos = placeDtos;
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

    public Map<ContactDto, List<PostDto>> getPost() {
        return post;
    }

    public void setPost(Map<ContactDto, List<PostDto>> post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDto that = (ContactDto) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (hobbies != null ? !hobbies.equals(that.hobbies) : that.hobbies != null) return false;
        if (placeDtos != null ? !placeDtos.equals(that.placeDtos) : that.placeDtos != null) return false;
        if (friendList != null ? !friendList.equals(that.friendList) : that.friendList != null) return false;
        if (conversation != null ? !conversation.equals(that.conversation) : that.conversation != null) return false;
        return !(post != null ? !post.equals(that.post) : that.post != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (placeDtos != null ? placeDtos.hashCode() : 0);
        result = 31 * result + (friendList != null ? friendList.hashCode() : 0);
        result = 31 * result + (conversation != null ? conversation.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", placeDtos=" + placeDtos +
                ", friendList=" + friendList +
                ", conversation=" + conversation +
                ", post=" + post +
                '}';
    }
}
