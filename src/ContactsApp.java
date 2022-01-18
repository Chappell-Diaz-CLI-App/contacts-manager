import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContactsApp{
    private static Util util = new Util();
    private static final String FILE_PATH_STRING = "src/contactList/contacts.txt";
    private static final Path FILE_PATH = Paths.get(FILE_PATH_STRING);
    static List<Contact> myContacts = new ArrayList<>();

    public static void main(String[] args){



        /**---------------------------------------------*/
        String contactFilePath = "src/contactList";
        Path directoryPath = Paths.get(contactFilePath);
        if(Files.notExists(directoryPath)){

        }else {
            System.out.println("has already been created");
        }

        Path txt = Paths.get(contactFilePath, "contacts.txt");
        try{
            if(Files.notExists(txt)){
                Files.createFile(txt);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        String fullName;
        String phoneNumber;
        Contact c;
        /**----------------------------*/

 
        Boolean goOn;

        do {
            //while(running){
            System.out.println("Welcome to ContactsApp! \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name." +
                    "\n4. Delete an existing contact.\n5. Exit.\nEnter an option(1,2,3,4, or 5.)");
            int option = util.getInt();
            System.out.println("You selected: " + option);
            /**---------------------------------------- */
            if(option <= 0 || option > 6){
                System.out.println("Invalid selection!");
            }
            /**-----------------------------------------*/
            //reading from text turns strings creating a new arraylist and add to contacts
            switch(option){
                case 1:

                    System.out.println("Enter a name: ");
                    util.getString();
                    util.sc.nextLine();
                    break;
                case 2:
                    break;
                case 3:
                    findContact();
                    break;
                case 4:
                    searchContacts();
                    break;
                case 5:

                    break;
                default:
                    System.out.println("Switch fallthrough has occurred for option");
            };

        }while(util.yesNo("Would you like to continue?"));
        try {
            writeContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    }

    private static void findContact() {
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
        String newName = util.getString("Enter in the New Contact's Name:");
        String newNumber = util.getString("Enter the number for "+newName+":");
        Contact newContact = new Contact(newName, newNumber);
        myContacts.add(newContact);
        System.out.printf("%s has been added to contacts with Phone Number: %s",newContact.getFullName(), newContact.getPhoneNumber());
    }
    public static void writeContacts() throws IOException {
        List<String> stringedContacts= new ArrayList<>();
        for(Contact contact : myContacts){
            stringedContacts.add(contact.toFileString());
        }
        Files.write(FILE_PATH, stringedContacts);
    }
 

//search and delete
    public static void searchContacts(){
        util.getString("Search for contacts by name.");
        util.getString();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try{
            Personlist = Files.readAllLines(ContactsPath);
            for(String person : Personlist){
                if(person.toLowerCase().contains(searchedLastName.toLowerCase())){
                    System.out.println("Contact:\n" + person);
                }
            }
        }catch  (IOException e){
            e.printStackTrace();

        }
        System.out.println("________________________");
        System.out.println("redirect to main");
    }
 

}