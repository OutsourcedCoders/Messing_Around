package RPGMonsterFighter;
import MessingAround.MessingAroundMain;
import RPGMonsterFighter.Creatures.DefaultCreature;
//                                                                               Welcome to Jasonface900's game,
//                                                                               Text RPG Simulator!
//                                                                               Note: This is just the launcher.

public class RPG_Game extends MessingAroundMain {

    public static DefaultCreature Player = new DefaultCreature(userName, plrHp, plrMana, plrDef);

    public static void main(String[] args) {
        userAnswered = false;
        System.out.println("Hello, and welcome to Jasonface900's RPG Fighter");
        System.out.print("Ready to start the game? :");
        while (!userAnswered) {
            userInput = sc.nextLine();//                                         Waits for input
            switch (userInput.toUpperCase()) {
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
        RPGMonsterFighter.Encounters.World.LandGen();
        while(isAlive){
            userAnswered = false;
            while(inBattle){
                RPGMonsterFighter.Encounters.MonsterChoice.MonsterGen();
            }
            
            RPGMonsterFighter.Encounters.ActSystem.actSystem();
        }
        
        System.out.println();
        System.out.println("The great hero known as " + userName + "has FALLEN.");
        System.out.print("Their untimely demise was caused by ");
        switch(monsterChoice){
            case 0:
                System.out.println("a deadly ZOMBIE.");
                break;
            case 1:
                System.out.println("a poisonous SPIDER.");
                break;
            case 2:
                System.out.println("a sticky SLIME MONSTER.");
                break;
            case 3:
                System.out.println("an old MAGE.");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                break;
            case 7:
                System.out.println("");
                break;
            default:
                System.out.println("a glitch :P");
                break;

        }
    }
}
