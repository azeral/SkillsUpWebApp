package net.bondar.webapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Azeral on 28.10.2015.
 */
@Entity
@Table(name = "MESSAGE")
public class Message extends AbstractEntity{

    @Column(name = "DATE")
    private LocalDateTime date;
    @Column(name = "CONTEXT")
    private String content;
    @Column(name = "FROM")
    private Contact from;
    @Column(name = "TO")
    private Contact to;

    public Message(){
        super();
    }

    public Message(long id){
        super(id);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        return !(to != null ? !to.equals(message.to) : message.to != null);

    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }
}
