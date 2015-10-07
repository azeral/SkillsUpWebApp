package net.bondar.webapp.impl;

import net.bondar.webapp.PostDao;
import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AzeraL on 07.10.2015.
 */
public class PostDaoImpl implements PostDao {
    Map<Long, Post> postMap=new HashMap<>();

    @Override
    public void add(Post post) {
        postMap.put(post.getPost_id(), post);
    }

    @Override
    public List<Post> getPost(Contact firstContact, Contact secondContact) {
        List<Post> postList = new ArrayList<>();
        for(Map.Entry<Contact, List<Post>> mapEntry:firstContact.getPost().entrySet()){
            if(mapEntry.getKey().equals(secondContact)){
                postList=mapEntry.getValue();
            }
        }
        return postList;
    }
}
