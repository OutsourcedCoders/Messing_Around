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
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou find yourself surrounded by a FOREST.");
        System.out.println("You hear birds singing.");
        System.out.println("What do you do?");
        RPGMonsterFighter.Encounters.ActSystem.main(args);
    }
}
