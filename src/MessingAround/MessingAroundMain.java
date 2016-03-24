package MessingAround;
import java.util.Scanner;

public class MessingAroundMain{
    public static Scanner sc = new Scanner(System.in);
    public static String userInput = "User";
    public static boolean userAnswered = false;
    public static void main(String[] args) {
        while(userAnswered == false) {
        System.out.print("Hey, how are yah?: ");
        userInput = sc.next();
        
        switch (userInput.toUpperCase()) {
            case "GOOD":                                                        //ANDY'S WORK TESTING
                System.out.println("That's good to hear");
                userAnswered = true;
                break;
            case "BAD":
                System.out.println("That's just too bad");
                userAnswered = true;
                break;
            case "SO SO":
                System.out.println("That's okay");
                userAnswered = true;
                break;
            default: 
                System.out.println("Please input a valid response");
                userInput = sc.next();
                break;
            }
        }
        userAnswered = false;
        while(userAnswered == false) {
            System.out.print("What kinda game would you like to play?");
            userInput = sc.next();
            switch (userInput.toUpperCase()) {
                case "*INSERT GAME NAME HERE*":
                    System.out.println("Alright.");
                    userAnswered = true;
                    break;
                default:
                    System.out.println("Please input a valid game");
                    break;
                
            }
        }
    }
}
