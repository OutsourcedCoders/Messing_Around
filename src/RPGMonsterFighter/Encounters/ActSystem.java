package RPGMonsterFighter.Encounters;

import MessingAround.MessingAroundMain;

public class ActSystem extends MessingAroundMain{
    public static void main(String[] args) {
        userAnswered = false;
        while(!userAnswered){
            System.out.println("-----------------");
            System.out.println("| Search | Move |");
            System.out.println("-----------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "MOVE"://                                                   item code goes here
                    System.out.println("Are you sure you want to move?\n: ");
                    while(!userAnswered){
                        userInput = sc.nextLine();
                        switch(userInput.toUpperCase()){
                            case "YES":
                                RPGMonsterFighter.Encounters.World.main(args);
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
                    if(creatureHere = true){
                        inBattle = true;
                        userAnswered = false;
                        RPGMonsterFighter.Encounters.MonsterChoice.main(args);
                    }//                                                          stuff
                    if(lootRandom >= 3){
                        userAnswered = false;
                        RPGMonsterFighter.Encounters.ItemSearch.main(args);
                    }
                    break;
                default:
                    System.out.println("Please input a valid response.");
                    break;
            }
        }
    }
}
