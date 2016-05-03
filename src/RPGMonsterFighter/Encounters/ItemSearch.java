package RPGMonsterFighter.Encounters;

public class ItemSearch extends World{
    public static void main(String[] args) {
        lootRandomVal = NumGen.nextInt(lootRandom);
        System.out.println("You find a " + lootRandomVal + ".");
        System.out.println("Keep item?");
        userInput = sc.nextLine();
        switch(userInput.toUpperCase()){
            case "YES":
                System.out.println("You put the " + lootRandomVal + " into BAG.");
                break;
            case "NO":
                System.out.println("You throw " + lootRandomVal + " away.");
                break;
            default:
                System.out.println("Please input a valid response.");
                break;
        }
        RPGMonsterFighter.Encounters.World.MonsterGen(args);
    }
}
