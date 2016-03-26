package RPGMonsterFighter.Encounters;

import static MessingAround.UserInputs.inBattle;
import static MessingAround.UserInputs.inWorld;
import static MessingAround.UserInputs.landRandom;
import static MessingAround.UserInputs.rpcNumGen;

public class World {
    public static void main(String[] args) {
        while (!inBattle  && inWorld){
            
            switch(rpcNumGen.nextInt(landRandom)){
                case 0:
                    RPGMonsterFighter.Lands.Plains.main(args);
                    break;
                case 1:
                    System.out.print("You find yourself surrounded by a ");
                    System.out.println("FOREST.");
                    System.out.println("You hear birds singing.");
                    break;
                case 2:
                    System.out.println("You see a RIVER next to you.");
                    System.out.println("Water rushes past you.");
                    break;
            }
        }
        if(inBattle == true){
            RPGMonsterFighter.Encounters.Battle.main(args);
        }
    }
}
