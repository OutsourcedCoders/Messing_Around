package RPGMonsterFighter.Lands;

public class River extends DefaultLand{
    public River(String dfWeather, int dfLootCnc, boolean dfFindCreature){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public static void main(String[] args) {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou see a RIVER next to you.");
        System.out.println("Water rushes past.");
        System.out.println("What do you do?");
        RPGMonsterFighter.Encounters.ActSystem.main(args);
    }
}
