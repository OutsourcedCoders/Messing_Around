package RPGMonsterFighter;
import MessingAround.MessingAroundMain;

public class RPG_Game extends MessingAroundMain{
    
    public static void main(String[] args) {
        System.out.println("Hello, and welcome to Jasonface900's RPG Fighter");
        System.out.println("This game was made as a test.");
        System.out.print("Ready to start the game? :");
        while (!userAnswered){
            userInput = sc.nextLine();
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
        while (!inBattle  && inWorld){
            switch(rpcNumGen.nextInt(landRandom)){
                case 0:
                    
                    //Plains.setWindStr(0);
                    System.out.println("You encounter a beautiful PLAINS.");
                    System.out.println("Wind rustles the tall grass around.");
                    System.out.println("What do you do? :");
                    
                    break;
                case 1:
                    System.out.print("You find yourself surrounded by a ");
                    System.out.println("FOREST.");
                    System.out.println("You hear birds singing.");
                    break;
                case 2:
                    System.out.println("You see a RIVER next to you.");
                    System.out.println("Water rushes past you.");
                    break;
            }
        }
    }
}
