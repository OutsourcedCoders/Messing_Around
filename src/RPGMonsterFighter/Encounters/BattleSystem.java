package RPGMonsterFighter.Encounters;

public class BattleSystem extends MonsterChoice{
    public static void main(String[] args) {
        while(inBattle = true){
            System.out.println("----------------------");
            System.out.println("| Fight | Item | Run |");
            System.out.println("----------------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "FIGHT":
                    switch(monsterChoice){
                        case 0:
                            RPGMonsterFighter.Creatures.Zombie.main(args);
                            break;
                        case 1:
                            break;
                        case 2:
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
                        default:
                            System.out.println("Uh oh! You run across a");//     YOU BROKE IT
                            System.out.println("But nobody came.");//            WHY?!?!?!?!
                            break;
                    }
                    break;
                case "ITEM":
                    break;
                case "RUN":
                    if(monsterChoice == 6){
                        System.out.println("You can't outrun the flames.");
                        
                    }
                    if(NumGen.nextInt(100) <= 60){
                        
                    }
                    System.out.println("BOOK IT MAN!");
                    inBattle = false;
                    RPGMonsterFighter.Encounters.World.main(args);
                    break;
            }
        }
    }
}
