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
                            RPGMonsterFighter.Creatures.Spider.main(args);
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
                    System.out.println("I haven't finished this yet D: ");//     TODO: actually make items.
                    break;
                case "RUN":
                    switch(monsterChoice){
                        case 0:
                            System.out.println("Obviously, you're too fast.");
                            System.out.println("You outrun the ZOMBIE.");
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
                            System.out.println("You can't outrun the flames.");//Dragon encounter
                            break;
                        case 7:
                            break;
                        default:
                            System.out.print("HOW THE F*** DID YOU BREAK ");
                            System.out.println("IT THIS TIME?!?!?");
                            break;
                    }
            }
        }
    }
}
