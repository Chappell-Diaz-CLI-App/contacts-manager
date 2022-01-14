import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactMethods {
    private static final String FILE_PATH_STRING = "src/contactList/contacts.txt";
    private static final Path FILE_PATH = Paths.get(FILE_PATH_STRING);

    private HashMap<String, Contact> contacts = new HashMap<>();

    public ContactMethods(){
        List<String> listOfContacts = new ArrayList<>();
        try {
            listOfContacts = Files.readAllLines(FILE_PATH);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        for(String contactString : listOfContacts){
            Contact contact = new Contact(contactString);
            contacts.putIfAbsent(contact.getPhoneNumber(), contact);
        }
    }
//save, add, remove, find
public void saveContacts(){

}
public void addContacts(Contact c){

}
public void contactList(){

}
public Contact findContact(){

}
}
