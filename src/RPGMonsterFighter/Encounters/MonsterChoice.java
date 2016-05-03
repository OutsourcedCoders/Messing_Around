 package RPGMonsterFighter.Encounters;

 import RPGMonsterFighter.RPG_Game;
public class MonsterChoice extends RPG_Game{
    public static void main(String[] args) {
        monsterChoice = NumGen.nextInt(7);
        if (isDeveloper){
            System.out.println("So, you're a developer.");
            while(!userAnswered){
                System.out.print("Choose your monster.\n: ");
                userInput = sc.nextLine();
                switch(userInput.toUpperCase()){
                    case "ZOMBIE":
                        monsterChoice = 0;
                        userAnswered = true;
                        break;
                    case "SPIDER":
                        monsterChoice = 1;
                        userAnswered = true;
                        break;
                    case "SLIME":
                        monsterChoice = 2;
                        userAnswered = true;
                        break;
                    case "WIZARD":
                        monsterChoice = 3;
                        userAnswered = true;
                        break;
                    case "ARCHER":
                        monsterChoice = 4;
                        userAnswered = true;
                        break;
                    case "GIANT":
                        monsterChoice = 5;
                        userAnswered = true;
                        break;
                    case "DRAGON":
                        monsterChoice = 6;
                        userAnswered = true;
                        break;
                    case "DWARF":
                        monsterChoice = 7;
                        userAnswered = true;
                        break;
                    case "GLITCH":
                        monsterChoice = 8;
                        userAnswered = true;
                        break;
                    default:
                        userAnswered = false;
                        System.out.println("Please choose a correct monster.");
                        System.out.println("\t-Zombie");
                        System.out.println("\t-Spider");
                        System.out.println("\t-Slime");
                        System.out.println("\t-Wizard");
                        System.out.println("\t-Archer");
                        System.out.println("\t-Giant");
                        System.out.println("\t-Dragon");
                        System.out.println("\t-Dwarf");
                        System.out.println("\t-??????");
                        break;
                }
            }
        }
        System.out.println("");
        switch(monsterChoice){
            case 0:
                monsterChoice = 0;
                System.out.println("Oh no!");
                System.out.println("The smell of ROTTEN FLESH hits you.");
                justEncountered = true;
                Ecounters.BattleSystem.
                break;
            case 1:
                monsterChoice = 1;
                System.out.println("This is bad!");
                System.out.println("Your feet get entangled in sticky WEBS.");
                justEncountered = true;
                break;
            case 2:
                monsterChoice = 2;
                System.out.println("Oh dang!");
                System.out.println("You smell the sickly scent of SLIME.");
                justEncountered = true;
                break;
            case 3:
                monsterChoice = 3;
                System.out.println("Oh dear god!");
                System.out.println("SPARKS crackle around you!");
                justEncountered = true;
                break;
            case 4:
                monsterChoice = 4;
                System.out.println("Watch out!");
                System.out.println("An ARROW whizzes past!");
                justEncountered = true;
                break;
            case 5:
                monsterChoice = 5;
                System.out.println("What is that?");
                System.out.println("The ground TREMBLES around you.");
                justEncountered = true;
                break;
            case 6:
                monsterChoice = 6;
                System.out.println("DRAGONS!");
                System.out.println("You think you don't have to say anything.");
                justEncountered = true;
                break;
            case 7:
                monsterChoice = 7;
                System.out.println("What's that?");
                System.out.println("The smell of ALE hits you.");
                justEncountered = true;
                break;
            default:
                monsterChoice = 8;
                System.out.println("DAMNIT YOU BROKE IT.");
                System.out.println("HERE COMES A GLITCH MONSTER.");
                justEncountered = true;
                //RPGMonsterFighter.Creatures.Glitch.main(args);
                break;
        }
    }
}
