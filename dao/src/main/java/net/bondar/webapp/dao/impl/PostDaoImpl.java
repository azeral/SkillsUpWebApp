package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PostDto;
import net.bondar.webapp.dao.PostDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class PostDaoImpl implements PostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<PostDto> getPost(ContactDto firstContact, ContactDto secondContact) {
        return null;
    }

    @Override
    public long create(PostDto postDto) {
        return 0;
    }

    @Override
    public Collection<PostDto> getAll() {
        return null;
    }
}
