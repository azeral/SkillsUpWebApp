package net.bondar.webapp.api.model;

/**
 * Created by Azeral on 28.10.2015.
 */

public abstract class ModelDto {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ModelDto(){}

    public ModelDto(long id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "ModelDto{" +
                "id=" + id +
                '}';
    }
}
