package RPGMonsterFighter.Lands;

public class Forest extends DefaultLand{
    public int amtOfTrees;
    public Forest(String dfWeather, int dfLootCnc, boolean dfFindCreature, int dfAmtOfTrees){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public void setAmtOfTrees(int newAmtOfTrees){
        amtOfTrees = newAmtOfTrees;
    }
    public static void main(String[] args) {
        creatureHere = rpcNumGen.nextBoolean();
        System.out.println("\nYou find yourself surrounded by a FOREST.");
        System.out.println("You hear birds singing.");
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
                    if(lootRandom == 3){
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
                    }
                    break;
                default:
                    System.out.println("Please input a valid response.");
                    break;
            }
        }
    }
}
