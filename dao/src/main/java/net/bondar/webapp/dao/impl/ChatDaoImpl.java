package net.bondar.webapp.dao.impl;

import net.bondar.webapp.api.model.ChatDto;
import net.bondar.webapp.dao.ChatDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by AzeraL on 09.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class ChatDaoImpl implements ChatDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public long create(ChatDto chatDto) {
        return 0;
    }

    @Override
    public Collection<ChatDto> getAll() {
        return null;
    }
}
