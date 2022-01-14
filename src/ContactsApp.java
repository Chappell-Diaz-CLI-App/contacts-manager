import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class ContactsApp{


    public static void main(String[] args){
        Util util = new Util();
        HashMap<String, Contact> myContacts = new HashMap<>();
        Boolean goOn;
        do {
            System.out.println("Welcome to ContactsApp! \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name." +
                    "\n4.Delete and existing contact.\n5. Exit.\nEnter an option(1,2,3,4, or 5.)");
            int option = util.getInt();
            System.out.println("You selected: " + option);
            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Switch fallthrough has occurred for option");
            };

        }while(util.yesNo("Would you like to continue?"));
        System.out.println("Goodbye!");
    }
    public static void viewContacts(){
        Path contactsPath = Paths.get("contactList", "contacts.txt");
        List<String> contactList = null;
        try {
            contactList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < contactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }
    }
    public static void addContact(){

    }


}