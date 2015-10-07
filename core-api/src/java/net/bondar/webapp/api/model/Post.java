package net.bondar.webapp.api.model;

import java.time.LocalDateTime;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Post {
    private long post_id;
    private long contact_id;
    private String content;
    private LocalDateTime date;

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
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

        if (post_id != post.post_id) return false;
        if (contact_id != post.contact_id) return false;
        if (content != null ? !content.equals(post.content) : post.content != null) return false;
        return !(date != null ? !date.equals(post.date) : post.date != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (post_id ^ (post_id >>> 32));
        result = 31 * result + (int) (contact_id ^ (contact_id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", contact_id=" + contact_id +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
