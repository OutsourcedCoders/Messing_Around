package RPGMonsterFighter.Lands;

import RPGMonsterFighter.RPG_Game;

public class FullLands extends RPG_Game{
    public static void descDesert(){
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou can feel the hot air from the DESERT.");
        System.out.println("Sand blows around the dunes.");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descPlains() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou encounter a beautiful PLAINS.");
        System.out.println("Wind rustles the tall grass around.");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descForest() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou find yourself surrounded by a FOREST.");
        System.out.println("You hear birds singing.");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descRiver() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou see a RIVER next to you.");
        System.out.println("Water rushes past.");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descTundra() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou see the frozen wasteland known as TUNDRA.");
        System.out.println("Snow falls in a calming pattern.");
        System.out.println("What do you do?");
        landChosen = true;

    }
    public static void descVillage() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou notice a beautiful VILLAGE.");
        System.out.println("The citizens are walking around, noticing the");
        System.out.println("GREAT HERO named " + userName + ".");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descMountain() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou stand at the peak of a frigid MOUNTAIN.");
        System.out.println("Great puffy clouds surround you.");
        System.out.println("What do you do?");
        landChosen = true;
    }
    public static void descGlitch() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nY0u sse3");
        landChosen = true;
    }
}
