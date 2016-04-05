package MessingAround;
//                                                                               ----------------------------------------
//                                                                               This is made for use of all our games :)
//                                                                               ----------------------------------------
//                                                                               Brought to you by:
//                                                                               Jasonface900
//                                                                               YourAverageRandy
//                                                                               Sci1017
//                                                                               ----------------------------------------
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class UserInputs {
    //                                                                           ----------------------------------------
    //                                                                           Jorge's Simple Input Scanner
    public static Scanner sc = new Scanner(System.in);
    public static String userInput = "User";
    public static String userGame  = "None Selected";
    public static boolean userAnswered = false;
    public static boolean isDeveloper  = false;
    //                                                                           ----------------------------------------
    //                                                                           Jorge's 
    public static int monsterDef     = 10;
    public static int weaponClass    = 1;
    public static int monsterChoice  = 8;
    public static int landRandom     = 10;
    public static int healthRandom   = 5;
    public static int damageRandom   = 5;
    public static int lootRandom     = 0;
    public static int creatureRandom = 8;
    public static int windRandom     = 5;
    public static int lootRandomVal  = 5;
    public static int damageTaken = 0;
    public static int damageDone  = 0;
    public static int plrHp   = 100;
    public static int plrDef  = 0;
    public static int plrMana = 0;
    public static boolean hasChecked     = false;
    public static boolean creatureHere = false;
    public static boolean gotHit       = false;
    public static boolean inBattle     = false;
    public static boolean alive        = true;
    public static boolean attacking    = false;
    public static boolean justEncountered = false;
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
    public static int debtCount            = 0;
    public static int enemyBribe           = 0;
    public static int enemyPopulation      = 0;
    public static int enemyWeapons         = 0;
    public static int enemyWealth          = 0;
    public static int houseBuild           = 0;
    public static int houseCost            = 100;
    public static int houseCount           = 50;
    public static int houseTech            = 10;
    public static int nationNumGen         = 0;
    public static int nationEventNum       = 0;
    public static int nationPopulation     = 100;
    public static int nationWealth         = 2000;
    public static int nationWealthInc      = 100;
    public static int populationLimit      = 500;
    public static int roadBuild            = 0;
    public static int roadCost             = 50;
    public static int roadCount            = 10;
    public static int roadTech             = 10;
    public static int sentToWar            = 0;
    public static int turnCount            = 0;
    public static int weaponBuild          = 0;
    public static int weaponCost           = 10;
    public static int weaponCount          = 100;
    public static double enemyStrength         = 0;
    public static double eventWealthEffect     = 0;
    public static double eventPopulationEffect = 0;
    public static double eventStrengthEffect   = 0;
    public static double individualStrength    = 0.1;
    public static double nationGrowthRate      = 1;
    public static double weaponTech            = 0.001;
    public static float nationStrength        = 10;
    public static boolean turnActive    = true;
    public static boolean turnSubActive = true;
    public static boolean warOn         = false;
    public static String nationName     = "Default";
    public static String nationEvent    = "Default";
    public static String userAction     = "Default";
    public static String userSubAction  = "Default";
    public static String wealthFormatS  = "##########";
    public static DecimalFormat wealthFormat = new DecimalFormat(wealthFormatS);
    //                                                                          ------------------------------------------
    //                                                                           Ben's Game Stuff (Hopefully)
    
}
