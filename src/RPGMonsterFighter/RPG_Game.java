package RPGMonsterFighter;
import MessingAround.MessingAroundMain;
import RPGMonsterFighter.Creatures.DefaultCreature;
//                                                                               Welcome to Jasonface900's game,
//                                                                               Text RPG Simulator!
//                                                                               Note: This is just the launcher.

public class RPG_Game extends MessingAroundMain{
    public static DefaultCreature Player = new DefaultCreature(userName, plrHp, plrMana, plrDef);
    public static void main(String[] args) {
        userAnswered = false;
        System.out.println("Hello, and welcome to Jasonface900's RPG Fighter");
        System.out.print("Ready to start the game? :");
        while (!userAnswered){
            userInput = sc.nextLine();//                                         Waits for input
            switch(userInput.toUpperCase()){
                case "YES":
                    System.out.println("As " + userName + " begins their adventure,");
                    System.out.println("they hear a roaring sound in the distance,");
                    System.out.println("calling them.");
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
        Player.setHealth(100);
        Player.setMana(0);
        Player.setDefense(0);
        
    }
}
