import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public String getString() {
        System.out.println("Please enter something.");
        String userResponse = sc2.nextLine();
       // System.out.printf("You have entered: %s", userResponse);
        return userResponse;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userResponse = sc2.nextLine();
        //System.out.printf("You have entered: %s", userResponse);
        return userResponse;
    }


    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String inputString = sc.next();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }
    public int getInt(){
        return sc.nextInt();
    }
}
