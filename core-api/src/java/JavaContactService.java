import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public interface JavaContactService {
    void createContact(String firstName, String lastName, LocalDate birthDate);
    void addHobby(String title, String description);
    void addPlace(String title, String description, double latitude, double longitude);
    void addFriendship(Contact who, Contact with);
    Set<Contact> getFriendList(Contact contact);
    List<Message> getConversation(Contact who, Contact with);
}
