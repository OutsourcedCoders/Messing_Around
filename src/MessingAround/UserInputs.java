package MessingAround;
//                                                                               ----------------------------------------
//                                                                               This is made for use of all our games :)
//                                                                               ----------------------------------------
//                                                                               Brought to you by:
//                                                                               Jasonface900
//                                                                               YourAverageRandy
//                                                                               Sci1017
//                                                                               ----------------------------------------
import java.util.Random;
import java.util.Scanner;

public class UserInputs {
    //                                                                          -----------------------------------------
    //                                                                           Jorge's Simple Input Scanner
    public static Scanner sc = new Scanner(System.in);
    public static String userInput = "User";
    public static String userGame  = "None Selected";
    public static boolean userAnswered = false;
    
    public static boolean gotHit = false;
    public static boolean inBattle = false;
    
    //                                                                          -----------------------------------------
    //                                                                           Andy's Rock Paper Scissors Stuff
    public static int bestOf         = 0; 
    public static int userWins       = 0;
    public static int computerWins   = 0;
    public static int dumbRandomizer = 3;
    public static String userChoice     = "Default";
    public static String computerChoice = "Default";
    public static Random rpcNumGen = new Random();
    public static boolean gameOn = true;
    //                                                                          ------------------------------------------
    //                                                                           Ben's Game Stuff (Hopefully)
    
}