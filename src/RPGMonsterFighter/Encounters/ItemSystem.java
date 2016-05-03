/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPGMonsterFighter.Encounters;

/**
 *
 * @author jorge_flore141
 */
public class ItemSystem extends World{
    public static void Search() {
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
    }
}
