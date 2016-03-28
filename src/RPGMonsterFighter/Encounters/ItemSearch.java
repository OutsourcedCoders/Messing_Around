package RPGMonsterFighter.Encounters;

public class ItemSearch extends World{
    public static void main(String[] args) {
        System.out.println("You find a " + lootRandom + ".");
        System.out.println("Keep item?");
        userInput = sc.nextLine();
        switch(userInput.toUpperCase()){
            case "YES":
                System.out.println("You put the " + lootRandom + " into BAG.");
                break;
            case "NO":
                System.out.println("You throw " + lootRandom + " away.");
                break;
            default:
                System.out.println("Please input a valid response.");
                break;
        }
        RPGMonsterFighter.Encounters.World.main(args);
    }
}
