package net.bondar.webapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Azeral on 28.10.2015.
 */
@Entity
@Table(name = "POST")
public class Post extends AbstractEntity{

    @Column(name = "CONTACT_ID")
    private long contact_id;
    @Column(name = "CONTEXT")
    private String content;
    @Column(name = "DATE")
    private LocalDateTime date;

    public Post(){
        super();
    }

    public Post(long id){
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

        Post post = (Post) o;

        if (contact_id != post.contact_id) return false;
        if (content != null ? !content.equals(post.content) : post.content != null) return false;
        return !(date != null ? !date.equals(post.date) : post.date != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (contact_id ^ (contact_id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
