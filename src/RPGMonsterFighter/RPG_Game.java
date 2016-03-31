package RPGMonsterFighter;
import MessingAround.MessingAroundMain;
import RPGMonsterFighter.Creatures.DefaultCreature;
//                                                                               Welcome to Jasonface900's game,
//                                                                               Text RPG Simulator!
//                                                                               Note: This is just the launcher.

public class RPG_Game extends MessingAroundMain{
    
    public static void main(String[] args) {
        System.out.println("Hello, and welcome to Jasonface900's RPG Fighter");
        System.out.print("Ready to start the game? :");
        while (!userAnswered){
            userInput = sc.nextLine();//                                         Waits for input
            switch(userInput.toUpperCase()){
                case "YES":
                    System.out.println("Let's get started then!");
                    userAnswered = true;
                    break;
                case "NO":
                    System.out.println("That's a shame.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please respond correctly.");
                    break;
            }
        }
        int plrHp   = dePlrHp;
        int plrMana = dePlrMana;
        int plrDef  = dePlrMana;
        DefaultCreature Player = new DefaultCreature(plrHp, plrMana, plrDef);
        RPGMonsterFighter.Encounters.World.main(args);//                         Starts game
    }
}
