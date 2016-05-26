/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPGMonsterFighter.Lands;
import RPGMonsterFighter.RPG_Game;
/**
 *
 * @author jorge_flore141
 */
public class FullLands extends RPG_Game{
    public static void descDesert(){
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou can feel the hot air from the DESERT.");
        System.out.println("Sand blows around the dunes.");
        System.out.println("What do you do?");
    }
    public static void descPlains() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou encounter a beautiful PLAINS.");
        System.out.println("Wind rustles the tall grass around.");
        System.out.println("What do you do?");
    }
    public static void descForest() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou find yourself surrounded by a FOREST.");
        System.out.println("You hear birds singing.");
        System.out.println("What do you do?");
    }
    public static void descRiver() {
        creatureHere = NumGen.nextBoolean();
        System.out.println("\nYou see a RIVER next to you.");
        System.out.println("Water rushes past.");
        System.out.println("What do you do?");
    }
}
