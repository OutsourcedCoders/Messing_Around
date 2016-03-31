package RPGMonsterFighter.Encounters;

import MessingAround.UserInputs;

public class World extends UserInputs{
    public static void main(String[] args) {
        while (!inBattle  && alive){
            int generatedLandRand = NumGen.nextInt(landRandom);
            switch(generatedLandRand){
                case 0:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.Plains.main(args);//                 Plains Encounter
                    break;
                case 1:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.Forest.main(args);//                 Forest Encounter
                    break;
                case 2:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.River.main(args);//                  River Encounter
                    break;
                case 3:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.Desert.main(args);//                 Desert Encounter
                    break;
                case 4:
                    userAnswered = false;
                    break;
                case 5:
                    userAnswered = false;
                    break;
                case 6:
                    userAnswered = false;
                    break;
                case 7:
                    userAnswered = false;
                    break;
                case 8:
                    userAnswered = false;
                    break;
                case 9:
                    userAnswered = false;
                    break;
                default:
                    userAnswered = false;
                    System.out.println("WHAT THE EFF DID YOU DO!");//            If this shows, you broke it...
                    System.out.println("YOU BROKE IT MAN!");//                   WHY'D YOU DO IT!!!
                    break;
            }
        }
        if(inBattle == true){
            RPGMonsterFighter.Encounters.MonsterChoice.main(args);
        }else if(!alive){
            System.out.println("A great hero has FALLEN.");
            System.out.print("His untimely demise was caused by ");
            switch(monsterChoice){
                case 0:
                    System.out.println("a deadly ZOMBIE.");
                    break;
                case 1:
                    System.out.println("a poisonous SPIDER.");
                    break;
                case 2:
                    System.out.println("a sticky SLIME MONSTER.");
                    break;
                case 3:
                    System.out.println("an old MAGE.");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                default:
                    System.out.println("a glitch :P");
                    break;
            }
        }
    }
}
