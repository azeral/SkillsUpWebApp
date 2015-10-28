package net.bondar.webapp.impl;

import net.bondar.webapp.PostDao;
import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PostDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
public class PostDaoImpl implements PostDao {

    @Override
    public List<PostDto> getPost(ContactDto firstContact, ContactDto secondContact) {
        return null;
    }

    @Override
    public void create(PostDto postDto) {

    }

    @Override
    public Collection<PostDto> getAll() {
        return null;
    }
}
