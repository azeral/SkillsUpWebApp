package net.bondar.webapp.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Azeral on 28.10.2015.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AbstractEntity(){}

    public AbstractEntity(long id){
        this.id=id;
    }
}
