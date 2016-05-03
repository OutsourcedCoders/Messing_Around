package RPGMonsterFighter.Encounters;

import MessingAround.MessingAroundMain;

public class ActSystem extends MessingAroundMain{
    public static void actSystem(String[] args) {
        userAnswered = false;
        while(!userAnswered){
            System.out.flush();
            System.out.println("-----------------");
            System.out.println("| Search | Move |");
            System.out.println("-----------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "MOVE":
                    System.out.println("Are you sure you want to move?\n: ");
                    while(!userAnswered){
                        userInput = sc.nextLine();
                        switch(userInput.toUpperCase()){
                            case "YES":
                                RPGMonsterFighter.Encounters.World.LandGen();
                                break;
                            case "NO":
                                userAnswered = true;
                                break;
                            default:
                                System.out.println("Please input a valid response. \n: ");
                                break;
                        }
                    }
                    break;
                case "SEARCH":
                    creatureRandom = NumGen.nextInt(100);
                    if(creatureRandom <= 60){
                        inBattle = true;
                        userAnswered = false;
                        MonsterChoice.MonsterGen(args);
                    }//                                                          stuff
                    if(creaturesDead >= 2){
                        System.out.println("But nobody came.");
                        System.out.println("You are a terrible person.");
                    }
                    if(lootRandom >= 3){
                        userAnswered = false;
                        ItemSearch.Search();
                    }
                    System.out.println("You find nothing here.");
                    break;
                default:
                    System.out.println("Please input a valid response.");
                    break;
            }
        }
    }
}
