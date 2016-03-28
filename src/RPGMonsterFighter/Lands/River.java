package RPGMonsterFighter.Lands;

public class River extends DefaultLand{
    public River(String dfWeather, int dfLootCnc, boolean dfFindCreature){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public static void main(String[] args) {
        creatureHere = rpcNumGen.nextBoolean();
        System.out.println("You see a RIVER next to you.");
        System.out.println("Water rushes past.");
        System.out.println("What do you do?");
        while(!userAnswered){
            System.out.println("-----------------");
            System.out.println("| Search | Move |");
            System.out.println("-----------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "ITEM"://                                                   item code goes here
                    break;
                case "SEARCH":
                    if(creatureHere = true){
                        inBattle = true;
                        RPGMonsterFighter.Encounters.World.main(args);
                    }//                                                          stuff
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
                    break;
            }
        }
    }
}
