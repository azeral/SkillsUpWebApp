package net.bondar.webapp;

import net.bondar.webapp.api.model.Contact;
import net.bondar.webapp.api.model.Post;

import java.util.List;

/**
 * Created by AzeraL on 07.10.2015.
 */
public interface PostDao extends AbstractDao<Post>{
    List<Post> getPost(Contact firstContact, Contact secondContact);

}
