import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class JavaContactServiceImpl implements JavaContactService {
    @Override
    public void createContact(String firstName, String lastName, LocalDate birthDate) {

    }

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void addPlace(String title, String description, double latitude, double longitude) {

    }

    @Override
    public void addFriendship(Contact who, Contact with) {

    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact who, Contact with) {
        return null;
    }
}
