package net.bondar.webapp.core;

/**
 * Created by AzeraL on 06.10.2015.
 */

//public class App {
//    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//        JavaContactService service = context.getBean(JavaContactService.class);
//        //Create contacts
//        service.createContact("Ivan", "First", LocalDate.of(1990, Month.APRIL, 12));
//        service.createContact("Alex", "Second", LocalDate.of(1990, Month.SEPTEMBER, 18));
//        service.createContact("Max", "Third", LocalDate.of(1990, Month.AUGUST, 14));
//        //Create places and hobbies
//        PlaceDto home=new PlaceDto("Home", "My Home", 88.2, 22.1);
//        PlaceDto work = new PlaceDto("Work", "My Work", 14, 88);
//        HobbyDto sport = new HobbyDto("Sport", "Sprint");
//        HobbyDto gamer = new HobbyDto("Gamer", "Play PC games");
//        //Show contacts
//        System.out.println("getAllContacts");
//        System.out.println(service.getAllContacts());
//        System.out.println();
//        //Add places and hobbies to contacts
//        ContactDto alex = service.getContactByName("Alex", "Second");
//        service.addHobbyToContact(alex, sport);
//        service.addPlaceToContact(alex, home);
//        service.addPlaceToContact(alex, work);
//
//        ContactDto ivan = service.getContactByName("Ivan", "First");
//        service.addHobbyToContact(ivan, gamer);
//        service.addPlaceToContact(ivan, work);
//
//        ContactDto max = service.getContactByName("Max", "Third");
//        service.addHobbyToContact(max, sport);
//        service.addPlaceToContact(max, home);
//        //Show hobbies and places
//        System.out.println("Print Alex");
//        System.out.println(alex.getHobbies());
//        System.out.println(alex.getPlaces());
//        System.out.println();
//        //Add friendship
//        service.addFriendship(alex, ivan);
//        service.addFriendship(alex, max);
//        //Show friendship
//        System.out.println("Show friendship");
//        System.out.println(alex.getFriendList());
//        System.out.println(max.getFriendList());
//        System.out.println();
//        //Remove friendship
//        service.removeFriendship(alex, max);
//        System.out.println("Remove friendship");
//        System.out.println(alex.getFriendList());
//        System.out.println(max.getFriendList());
//        System.out.println();
//        //Show contacts for place
//        System.out.println("Get contacts For place");
//        System.out.println("PlaceDto = "+home);
//        System.out.println(service.getAllContactsForPlace(home));
//        System.out.println();
//        //Show contacts with hobby
//        System.out.println("Get contacts With hobby");
//        System.out.println("HobbyDto = "+gamer);
//        System.out.println(service.getAllContactsWithHobby(gamer));
//        System.out.println();
//        //Delete contact
//        System.out.println("Delete contact");
//        service.deleteContact(ivan);
//        System.out.println(service.getAllContacts());
//        System.out.println(alex.getFriendList());
//
//
//
//    }
//}
