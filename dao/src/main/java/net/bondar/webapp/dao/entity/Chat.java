package net.bondar.webapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Azeral on 28.10.2015.
 */
@Entity
@Table(name = "CHAT")
public class Chat extends AbstractEntity{

    @Column(name = "FROM")
    private Contact userFrom;
    @Column(name = "TO")
    private Contact userTo;

    private List<Message> chatMessages;

    public Chat(){
        super();
    }

    public Chat(long id){
        super(id);
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

        if (userFrom != null ? !userFrom.equals(chat.userFrom) : chat.userFrom != null) return false;
        if (userTo != null ? !userTo.equals(chat.userTo) : chat.userTo != null) return false;
        return !(chatMessages != null ? !chatMessages.equals(chat.chatMessages) : chat.chatMessages != null);

    }

    @Override
    public int hashCode() {
        int result = userFrom != null ? userFrom.hashCode() : 0;
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (chatMessages != null ? chatMessages.hashCode() : 0);
        return result;
    }
}
