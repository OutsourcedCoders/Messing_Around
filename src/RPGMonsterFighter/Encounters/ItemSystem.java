package RPGMonsterFighter.Encounters;

public class ItemSystem extends World{
    public static void Search() {
        lootRandomVal = NumGen.nextInt(4);
        Weapons();
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
    }
    public static void Weapons(){
        switch(lootRandomVal){
            case 0:
                weaponName = "STICK";
                System.out.println("You find a " + weaponName + "!");
                System.out.println("Well, at least it's not a ST-");
                System.out.println("Oh wait. Heh.");
                break;
            case 1:
                weaponName = "ROCK";
                System.out.println("You find a " + weaponName + "!");
                System.out.println("At least it's not a STICK.");
                break;
            case 2:
                weaponName = "WOODEN SWORD";
                System.out.println("You find a " + weaponName + "!");
                System.out.println("Looks light.");
                break;
            case 3:
                break;
        }
    }
}
