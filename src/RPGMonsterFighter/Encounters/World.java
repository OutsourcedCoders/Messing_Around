package RPGMonsterFighter.Encounters;

import MessingAround.UserInputs;

public class World extends UserInputs{
    public static void main(String[] args) {
        while (!inBattle  && alive){
            
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
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("WHAT THE EFF DID YOU DO!");
                    System.out.println("YOU BROKE IT MAN!");
                    
            }
        }
        if(inBattle == true){
            RPGMonsterFighter.Encounters.Battle.main(args);
        }else if(!alive){
            System.out.println("A great hero has FALLEN.");
        }
    }
}
