package net.bondar.webapp.dao.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Azeral on 28.10.2015.
 */
@Entity
@Table(name = "CHAT")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "FROM")
    private Contact userFrom;
    @Column(name = "TO")
    private Contact userTo;

    private List<Message> chatMessages;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

        if (id != chat.id) return false;
        if (userFrom != null ? !userFrom.equals(chat.userFrom) : chat.userFrom != null) return false;
        if (userTo != null ? !userTo.equals(chat.userTo) : chat.userTo != null) return false;
        return !(chatMessages != null ? !chatMessages.equals(chat.chatMessages) : chat.chatMessages != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userFrom != null ? userFrom.hashCode() : 0);
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (chatMessages != null ? chatMessages.hashCode() : 0);
        return result;
    }
}
