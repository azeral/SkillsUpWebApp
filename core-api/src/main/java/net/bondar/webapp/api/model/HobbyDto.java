package net.bondar.webapp.api.model;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class HobbyDto extends ModelDto{

    private String title;
    private String description;

    public HobbyDto(){
        super();
    }

    public HobbyDto(long id){
        super(id);
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

        HobbyDto hobbyDto = (HobbyDto) o;

        if (title != null ? !title.equals(hobbyDto.title) : hobbyDto.title != null) return false;
        return !(description != null ? !description.equals(hobbyDto.description) : hobbyDto.description != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HobbyDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
