import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ContactsApp{

    // Declares Utilized Imported classes and file-paths for in-class use
    private static Util util = new Util();
    private static final String FILE_PATH_STRING = "src/contactList/contacts.txt";
    private static final Path FILE_PATH = Paths.get(FILE_PATH_STRING);
    // Leave this here to simplify internal methods not included in main
    static List<Contact> myContacts = new ArrayList<>();


    /*-------------------MAIN APP METHOD----------------*/
    public static void main(String[] args){



        /*----------------------Creating the Directory and .txt if none exists-----------------------*/
        String contactFilePath = "src/contactList";

        if(Files.notExists(FILE_PATH)){
            try{
                Files.createFile(FILE_PATH);
            }catch(IOException ioe){
                   ioe.printStackTrace();
            }
        }else {
            System.out.println("has already been created");
        }

        String fullName;
        String phoneNumber;
        Contact c;
        /*----------------------------*/

        getContacts();

        Boolean running = true;
        /* ---------------- PRIMARY CONTROL STRUCTURE FOR THE APP  ---------------*/
        /* ------ while loop with a switch inside for user input options ------*/
        System.out.println("Welcome to ContactsApp!");
        while(running){

            // OPTION Printout with input for the switch
            System.out.println("-----Menu----- \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name." +
                    "\n4. Delete an existing contact.\n5. Exit.\nEnter an option(1,2,3,4, or 5.)");
            int option = util.getInt();
            // System.out.println("You selected: " + option);
            switch(option){
                case 1:
                    displayContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Switch fallthrough has occurred for option");
            };

            /* ---------Loop Exit --------*/


        }

        /* --------- Call to write contacts to the .txt output --------*/
        try {
            writeContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    }
    /* */
    public static void getContacts(){
        List<String> contactStrings;
        try {
            contactStrings = Files.readAllLines(FILE_PATH);
            for(String contact : contactStrings){
                Contact addMe = new Contact(contact);
                myContacts.add(addMe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    // Displays the table of contacts based on the current ArrayList mycontacts
    public static void displayContacts(){
        System.out.println("Name               |\tPhone Number\n-------------------------------------");
        for(Contact contact : myContacts){
            System.out.println(String.format("%-18s %s",contact.getFullName(),"|\t"+contact.getPhoneNumber()));

        }
    }
    // Called when add new contact option is selected
    // 1- receives input for the given fields, 2- creates a new Contact, 3-adds the Contact to the ArrayList
    public static void addContact(){
        String newName = util.getString("Enter in the New Contact's Name:");
        String newNumber = util.getString("Enter the number for "+newName+":");
        Contact newContact = new Contact(newName, newNumber);
        myContacts.add(newContact);
        System.out.printf("%s has been added to contacts with Phone Number: %s\n",newContact.getFullName(), newContact.getPhoneNumber());
    }
    // Called on exit to Stringify the Array of Contacts and write each to a line in the given file
    public static void writeContacts() throws IOException {
        List<String> stringedContacts = new ArrayList<>();
        for(Contact contact : myContacts){
            stringedContacts.add(contact.toFileString());
        }
        Files.write(FILE_PATH, stringedContacts);
    }
    //search and delete
    public static void searchContacts () {
        util.getString("Search for contacts by name.");
        util.getString();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try {
            Personlist = Files.readAllLines(ContactsPath);
            for (String person : Personlist) {
                if (person.toLowerCase().contains(searchedLastName.toLowerCase())) {
                    System.out.println("Contact:\n" + person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("________________________");
        System.out.println("redirect to main");
    }

    public static void deleteContact () {
        System.out.println("4. Delete contact by name and/or phone number. ");
        System.out.println(" Name Or Phone: ");

        String searchedName = util.getString();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try {
            Personlist = Files.readAllLines(ContactsPath);
            List<String> newList = new ArrayList<>();
            for (String person : Personlist) {
                if (person.toLowerCase().contains(searchedName)) {
                    continue;
                }
                newList.add(person);
            }
            for (String name : newList) { //or personList?
                System.out.println(name);
            }
            Files.write(Paths.get("data", "contacts.txt"), newList);//overwrites old array
        } catch (IOException e) {
            e.printStackTrace();
        }

}