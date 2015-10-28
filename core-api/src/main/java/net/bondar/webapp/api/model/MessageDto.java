package net.bondar.webapp.api.model;

import java.time.LocalDateTime;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class MessageDto {
    private long id;
    private LocalDateTime date;
    private String content;
    private ContactDto from;
    private ContactDto to;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ContactDto getFrom() {
        return from;
    }

    public void setFrom(ContactDto from) {
        this.from = from;
    }

    public ContactDto getTo() {
        return to;
    }

    public void setTo(ContactDto to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageDto messageDto = (MessageDto) o;

        if (id != messageDto.id) return false;
        if (date != null ? !date.equals(messageDto.date) : messageDto.date != null) return false;
        if (content != null ? !content.equals(messageDto.content) : messageDto.content != null) return false;
        if (from != null ? !from.equals(messageDto.from) : messageDto.from != null) return false;
        return !(to != null ? !to.equals(messageDto.to) : messageDto.to != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id=" + id +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
