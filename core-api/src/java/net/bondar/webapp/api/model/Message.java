package net.bondar.webapp.api.model;

import java.time.LocalDateTime;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Message {
    private long message_id;
    private LocalDateTime date;
    private  String content;
    private Contact from;
    private Contact to;

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
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

        if (message_id != message.message_id) return false;
        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        return !(to != null ? !to.equals(message.to) : message.to != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (message_id ^ (message_id >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
