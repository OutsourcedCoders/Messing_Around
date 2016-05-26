package RPGMonsterFighter.Encounters;

import MessingAround.UserInputs;

public class World extends UserInputs{
    public static void LandGen(){
        while (!inBattle  && isAlive){
            int generatedLandRand = NumGen.nextInt(landRandom);
            switch(generatedLandRand){
                case 0:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.FullLands.descPlains();//                 Plains Encounter
                    break;
                case 1:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.FullLands.descForest();//                 Forest Encounter
                    break;
                case 2:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.FullLands.descRiver();//                  River Encounter
                    break;
                case 3:
                    userAnswered = false;
                    RPGMonsterFighter.Lands.FullLands.descDesert();//                 Desert Encounter
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
    }
}
