package net.bondar.webapp.api.model;

import java.util.List;

/**
 * Created by AzeraL on 09.10.2015.
 */
public class ChatDto extends ModelDto{
    private ContactDto userFrom;
    private ContactDto userTo;
    private List<MessageDto> chatMessages;

    public ChatDto(){
        super();
    }
    public ChatDto(long id){
        super(id);
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

    public List<MessageDto> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<MessageDto> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatDto chatDto = (ChatDto) o;

        if (userFrom != null ? !userFrom.equals(chatDto.userFrom) : chatDto.userFrom != null) return false;
        if (userTo != null ? !userTo.equals(chatDto.userTo) : chatDto.userTo != null) return false;
        return !(chatMessages != null ? !chatMessages.equals(chatDto.chatMessages) : chatDto.chatMessages != null);

    }

    @Override
    public int hashCode() {
        int result = userFrom != null ? userFrom.hashCode() : 0;
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (chatMessages != null ? chatMessages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChatDto{" +
                "userFrom=" + userFrom +
                ", userTo=" + userTo +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
