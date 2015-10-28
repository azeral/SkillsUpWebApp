package net.bondar.webapp.impl;

import net.bondar.webapp.ChatDao;
import net.bondar.webapp.api.model.ChatDto;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by AzeraL on 09.10.2015.
 */
@Repository
public class ChatDaoImpl implements ChatDao{

    @Override
    public void create(ChatDto chatDto) {

    }

    @Override
    public Collection<ChatDto> getAll() {
        return null;
    }
}
