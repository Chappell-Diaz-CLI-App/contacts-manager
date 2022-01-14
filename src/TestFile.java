import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFile {
    public static void main(String[] args) {
        String contactFilePath = "src/contactList";
        Path directoryPath = Paths.get(contactFilePath);
        try{
            if(Files.notExists(directoryPath)){
                Files.createDirectory(directoryPath);
            }else {
                System.out.println("has already been created");
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        Path txt = Paths.get(contactFilePath, "contacts.txt");
        try{
        if(Files.notExists(txt)){
            Files.createFile(txt);
        }
        }catch(IOException ioe){
        ioe.printStackTrace();
        }
  }
}
