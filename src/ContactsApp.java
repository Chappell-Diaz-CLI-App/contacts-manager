import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactsApp{


    public static void main(String[] args){
        Util util = new Util();

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
        do {
        //while(running){
            System.out.println("Welcome to ContactsApp! \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name." +
                    "\n4.Delete and existing contact.\n5. Exit.\nEnter an option(1,2,3,4, or 5.)");
            int option = util.getInt();
            System.out.println("You selected: " + option);

            switch(option){
                case 1:
                    System.out.println("Enter a name: ");
                    util.getString();

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
                    System.out.println("Switch fallthrough has occured for option");
            };

        }while(util.yesNo("Would you like to continue?"));
        System.out.println("Goodbye!");
    }



}