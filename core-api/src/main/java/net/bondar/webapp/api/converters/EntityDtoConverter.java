package net.bondar.webapp.api.converters;

import net.bondar.webapp.api.model.*;
import net.bondar.webapp.dao.entity.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Azeral on 28.10.2015.
 */
public final class EntityDtoConverter {
    private EntityDtoConverter() {}

    public static Contact convert(ContactDto contactDto) {
        if (contactDto == null) {
            return null;
        }
        Contact contact = new Contact();
        contact.setId(contactDto.getId());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setBirthDate(contactDto.getBirthDate());

        Set<Hobby> hobbies = new HashSet<>();
        for(HobbyDto hobby:contactDto.getHobbies()){
            hobbies.add(convert(hobby));
        }
        contact.setHobbies(hobbies);

        Set<Place> places = new HashSet<>();
        for(PlaceDto place:contactDto.getPlaces()){
            places.add(convert(place));
        }
        contact.setPlaces(places);

        Set<Contact> contacts = new HashSet<>();
        for(ContactDto c:contactDto.getFriendList()){
            contacts.add(convert(c));
        }
        contact.setFriendList(contacts);

        Set<Chat> conversation = new HashSet<>();
        for(ChatDto chat:contactDto.getConversation()){
            conversation.add(convert(chat));
        }
        contact.setConversation(conversation);

        Set<Post> posts = new HashSet<>();
        for(PostDto post:contactDto.getPosts()){
            posts.add(convert(post));
        }
        contact.setPosts(posts);
        return contact;
    }

    public static ContactDto convert(Contact contact) {
        if (contact == null) {
            return null;
        }
        ContactDto contactDto = new ContactDto();
        contactDto.setId(contact.getId());
        contactDto.setFirstName(contact.getFirstName());
        contactDto.setLastName(contact.getLastName());
        contactDto.setBirthDate(contact.getBirthDate());

        Set<HobbyDto> hobbies = new HashSet<>();
        for(Hobby hobby:contact.getHobbies()){
            hobbies.add(convert(hobby));
        }
        contactDto.setHobbies(hobbies);

        Set<PlaceDto> places = new HashSet<>();
        for(Place place:contact.getPlaces()){
            places.add(convert(place));
        }
        contactDto.setPlaces(places);

        Set<ContactDto> contacts = new HashSet<>();
        for(Contact c:contact.getFriendList()){
            contacts.add(convert(c));
        }
        contactDto.setFriendList(contacts);

        Set<ChatDto> conversation = new HashSet<>();
        for(Chat chat:contact.getConversation()){
            conversation.add(convert(chat));
        }
        contactDto.setConversation(conversation);

        Set<PostDto> posts = new HashSet<>();
        for(Post post:contact.getPosts()){
            posts.add(convert(post));
        }
        contactDto.setPosts(posts);
        return contactDto;
    }

    public static Chat convert(ChatDto chatDto) {
        if (chatDto == null) {
            return null;
        }
        Chat chat = new Chat();
        chat.setId(chatDto.getId());
        chat.setUserFrom(convert(chatDto.getUserFrom()));
        chat.setUserTo(convert(chatDto.getUserTo()));

        List<Message> messages = new ArrayList<>();
        for(MessageDto message:chatDto.getChatMessages()){
            messages.add(convert(message));
        }
        chat.setChatMessages(messages);
        return chat;
    }

    public static ChatDto convert(Chat chat) {
        if (chat == null) {
            return null;
        }
        ChatDto chatDto = new ChatDto();
        chatDto.setId(chat.getId());
        chatDto.setUserFrom(convert(chat.getUserFrom()));
        chatDto.setUserTo(convert(chat.getUserTo()));

        List<MessageDto> messages = new ArrayList<>();
        for(Message message:chat.getChatMessages()){
            messages.add(convert(message));
        }
        chatDto.setChatMessages(messages);
        return chatDto;
    }

    public static Hobby convert(HobbyDto hobbyDto) {
        if (hobbyDto == null) {
            return null;
        }
        Hobby hobby = new Hobby();
        hobby.setId(hobbyDto.getId());
        hobby.setTitle(hobbyDto.getTitle());
        hobby.setDescription(hobbyDto.getDescription());
        return hobby;
    }

    public static HobbyDto convert(Hobby hobby) {
        if (hobby == null) {
            return null;
        }
        HobbyDto hobbyDto = new HobbyDto();
        hobbyDto.setId(hobby.getId());
        hobbyDto.setTitle(hobby.getTitle());
        hobbyDto.setDescription(hobby.getDescription());
        return hobbyDto;
    }

    public static Message convert(MessageDto messageDto) {
        if (messageDto == null) {
            return null;
        }
        Message message = new Message();
        message.setId(messageDto.getId());
        message.setDate(messageDto.getDate());
        message.setContent(messageDto.getContent());
        message.setFrom(convert(messageDto.getFrom()));
        message.setTo(convert(messageDto.getTo()));
        return message;
    }

    public static MessageDto convert(Message message) {
        if (message == null) {
            return null;
        }
        MessageDto messageDto = new MessageDto();
        messageDto.setId(message.getId());
        messageDto.setDate(message.getDate());
        messageDto.setContent(message.getContent());
        messageDto.setFrom(convert(message.getFrom()));
        messageDto.setTo(convert(message.getTo()));
        return messageDto;
    }

    public static Place convert(PlaceDto placeDto) {
        if (placeDto == null) {
            return null;
        }
        Place place = new Place();
        place.setId(placeDto.getId());
        place.setTitle(placeDto.getTitle());
        place.setDescription(placeDto.getDescription());
        place.setLatitude(placeDto.getLatitude());
        place.setLongitude(placeDto.getLongitude());
        return place;
    }

    public static PlaceDto convert(Place place) {
        if (place == null) {
            return null;
        }
        PlaceDto placeDto = new PlaceDto();
        placeDto.setId(place.getId());
        placeDto.setTitle(place.getTitle());
        placeDto.setDescription(place.getDescription());
        placeDto.setLatitude(place.getLatitude());
        placeDto.setLongitude(place.getLongitude());
        return placeDto;
    }

    public static Post convert(PostDto postDto) {
        if (postDto == null) {
            return null;
        }
        Post post = new Post();
        post.setId(postDto.getId());
        post.setContact_id(postDto.getContact_id());
        post.setContent(postDto.getContent());
        post.setDate(postDto.getDate());
        return post;
    }

    public static PostDto convert(Post post) {
        if (post == null) {
            return null;
        }
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setContact_id(post.getContact_id());
        postDto.setContent(post.getContent());
        postDto.setDate(post.getDate());
        return postDto;
    }
}
