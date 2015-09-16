import java.time.LocalDate;
import java.util.Set;

/**
 * Created by AzeraL on 16.09.2015.
 */
public class Contact {
    private long contact_id;
    private  String firstName;
    private  String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> places;
}
