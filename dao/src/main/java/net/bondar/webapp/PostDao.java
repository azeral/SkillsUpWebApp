package net.bondar.webapp;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.api.model.PostDto;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface PostDao extends AbstractDao<PostDto>{
    List<PostDto> getPost(ContactDto firstContact, ContactDto secondContact);

}
