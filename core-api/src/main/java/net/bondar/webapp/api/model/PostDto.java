package net.bondar.webapp.api.model;

import java.time.LocalDateTime;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class PostDto extends ModelDto{

    private long contact_id;
    private String content;
    private LocalDateTime date;

    public PostDto(){
        super();
    }

    public PostDto(long id){
        super(id);
    }

    public long getContact_id() {
        return contact_id;
    }

    public void setContact_id(long contact_id) {
        this.contact_id = contact_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostDto postDto = (PostDto) o;

        if (contact_id != postDto.contact_id) return false;
        if (content != null ? !content.equals(postDto.content) : postDto.content != null) return false;
        return !(date != null ? !date.equals(postDto.date) : postDto.date != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (contact_id ^ (contact_id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "contact_id=" + contact_id +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
