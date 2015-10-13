package net.bondar.webapp.impl;

import net.bondar.webapp.ChatDao;
import net.bondar.webapp.api.model.Chat;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AzeraL on 09.10.2015.
 */
@Repository
public class ChatDaoImpl implements ChatDao{
    Map<Long, Chat> chatMap = new HashMap<>();

    @Override
    public void create(Chat chat) {
        chatMap.put(chat.getChat_id(), chat);
    }

    @Override
    public Collection<Chat> getAll() {
        return chatMap.values();
    }
}
