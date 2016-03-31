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
    //                                                                           ----------------------------------------
    //                                                                           Jorge's Simple Input Scanner
    public static Scanner sc = new Scanner(System.in);
    public static String userInput = "User";
    public static String userGame  = "None Selected";
    public static boolean userAnswered = false;
    //                                                                           ----------------------------------------
    //                                                                           Jorge's 
    public static int landRandom = 10;
    public static int healthRandom = 5;
    public static int damageRandom = 5;
    public static int lootRandom = 0;
    public static int creatureRandom = 8;
    public static int windRandom = 5;
    public static int lootRandomVal = 5;
    public static boolean creatureHere = false;
    public static boolean gotHit = false;
    public static boolean inBattle = false;
    public static boolean alive = true;
    //public DefaultPlains Plains = new DefaultPlains(); 
    
    //                                                                           ----------------------------------------
    //                                                                           Andy's Rock Paper Scissors Stuff
    public static int bestOf         = 0; 
    public static int userWins       = 0;
    public static int computerWins   = 0;
    public static int dumbRandomizer = 3;
    public static boolean gameOn = true;
    public static String userChoice     = "Default";
    public static String computerChoice = "Default";
    public static Random NumGen = new Random();
    
    //                                                                           Nation Stuff
    public static int houseBuild           = 0;
    public static int houseCost            = 100;
    public static int houseCount           = 50;
    public static int houseTech            = 10;
    public static int nationNumGen         = 0;
    public static int nationEventNum       = 0;
    public static int nationPopulation     = 100;
    public static int nationWealth         = 1000;
    public static int nationWealthInc      = 10;
    public static int populationLimit      = 500;
    public static int turnCount            = 0;
    public static double individualStrength = 0.1;
    public static double nationGrowthRate   = 1.1;
    public static double nationStrength = 10;
    public static boolean turnActive = true;
    public static boolean turnSubActive = true;
    public static String nationName  = "Default";
    public static String nationEvent = "Default";
    //                                                                          ------------------------------------------
    //                                                                           Ben's Game Stuff (Hopefully)
    
}
