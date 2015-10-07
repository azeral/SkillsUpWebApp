package net.bondar.webapp.api.model;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Hobby {
    private long hobby_id;
    private String title;
    private String description;

    public long getHobby_id() {
        return hobby_id;
    }

    public void setHobby_id(long hobby_id) {
        this.hobby_id = hobby_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hobby hobby = (Hobby) o;

        if (hobby_id != hobby.hobby_id) return false;
        if (title != null ? !title.equals(hobby.title) : hobby.title != null) return false;
        return !(description != null ? !description.equals(hobby.description) : hobby.description != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (hobby_id ^ (hobby_id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobby_id=" + hobby_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
