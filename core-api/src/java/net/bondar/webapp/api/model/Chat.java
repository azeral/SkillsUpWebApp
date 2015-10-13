package net.bondar.webapp.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AzeraL on 09.10.2015.
 */
public class Chat {
    private static long ID=1;
    private long chat_id;
    private Contact userFrom;
    private Contact userTo;
    private List<Message> chatMessages;

    public Chat(){}
    public Chat(Contact userFrom, Contact userTo) {
        this.chat_id=ID++;
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.chatMessages = new ArrayList<>();
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public Contact getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(Contact userFrom) {
        this.userFrom = userFrom;
    }

    public Contact getUserTo() {
        return userTo;
    }

    public void setUserTo(Contact userTo) {
        this.userTo = userTo;
    }

    public List<Message> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<Message> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (chat_id != chat.chat_id) return false;
        if (userFrom != null ? !userFrom.equals(chat.userFrom) : chat.userFrom != null) return false;
        if (userTo != null ? !userTo.equals(chat.userTo) : chat.userTo != null) return false;
        return !(chatMessages != null ? !chatMessages.equals(chat.chatMessages) : chat.chatMessages != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (chat_id ^ (chat_id >>> 32));
        result = 31 * result + (userFrom != null ? userFrom.hashCode() : 0);
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (chatMessages != null ? chatMessages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chat_id=" + chat_id +
                ", userFrom=" + userFrom +
                ", userTo=" + userTo +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
