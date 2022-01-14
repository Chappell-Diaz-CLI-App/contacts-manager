import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String inputString = sc.next();
        return  (inputString.equalsIgnoreCase("y") || inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("yes"));
    }
    public int getInt(){
        int inputInt = sc.nextInt();
        return inputInt;
    }
}
