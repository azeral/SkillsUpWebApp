package net.bondar.webapp.api.model;

import java.util.List;

/**
 * Created by AzeraL on 09.10.2015.
 */
public class ChatDto {
    private long id;
    private ContactDto userFrom;
    private ContactDto userTo;
    private List<MessageDto> chatMessageDtos;

    public long getId() {
        return id;
    }

    public void setId(long chat_id) {
        this.id = chat_id;
    }

    public ContactDto getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(ContactDto userFrom) {
        this.userFrom = userFrom;
    }

    public ContactDto getUserTo() {
        return userTo;
    }

    public void setUserTo(ContactDto userTo) {
        this.userTo = userTo;
    }

    public List<MessageDto> getChatMessageDtos() {
        return chatMessageDtos;
    }

    public void setChatMessageDtos(List<MessageDto> chatMessageDtos) {
        this.chatMessageDtos = chatMessageDtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatDto chatDto = (ChatDto) o;

        if (id != chatDto.id) return false;
        if (userFrom != null ? !userFrom.equals(chatDto.userFrom) : chatDto.userFrom != null) return false;
        if (userTo != null ? !userTo.equals(chatDto.userTo) : chatDto.userTo != null) return false;
        return !(chatMessageDtos != null ? !chatMessageDtos.equals(chatDto.chatMessageDtos) : chatDto.chatMessageDtos != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userFrom != null ? userFrom.hashCode() : 0);
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (chatMessageDtos != null ? chatMessageDtos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChatDto{" +
                "id=" + id +
                ", userFrom=" + userFrom +
                ", userTo=" + userTo +
                ", chatMessageDtos=" + chatMessageDtos +
                '}';
    }
}
