 package RPGMonsterFighter.Encounters;

public class MonsterChoice extends World{
    public static void main(String[] args) {
        int creatureRandomVal = NumGen.nextInt(creatureRandom);
        if (isDeveloper){
            while(!userAnswered){
                System.out.println("Choose your monster.");
                switch(userInput.toUpperCase()){
                    case "ZOMBIE":
                        monsterChoice = 0;
                        break;
                    case "SPIDER":
                        monsterChoice = 1;
                        break;
                    case "SLIME":
                        monsterChoice = 2;
                        break;
                    case "WIZARD":
                        monsterChoice = 3;
                        break;
                    case "ARCHER":
                        monsterChoice = 4;
                        break;
                    case "GIANT":
                        monsterChoice = 5;
                        break;
                    case "DRAGON":
                        monsterChoice = 6;
                        break;
                    case "DWARF":
                        monsterChoice = 7;
                        break;
                    case "GLITCH":
                        monsterChoice = 8;
                        break;
            }
        }
        switch(creatureRandomVal){
            case 0:
                monsterChoice = 0;
                System.out.println("Oh no!");
                System.out.println("The smell of ROTTEN FLESH hits you.");
                RPGMonsterFighter.Creatures.Zombie.main(args);
                break;
            case 1:
                monsterChoice = 1;
                System.out.println("This is bad!");
                System.out.println("Your feet get entangled in sticky WEBS.");
                RPGMonsterFighter.Creatures.Spider.main(args);
                break;
            case 2:
                monsterChoice = 2;
                System.out.println("Oh dang!");
                System.out.println("You smell the sickly scent of SLIME.");
                //RPGMonsterFighter.Creatures.Slime.main(args);
                break;
            case 3:
                monsterChoice = 3;
                System.out.println("Oh dear god!");
                System.out.println("SPARKS crackle around you!");
                //RPGMonsterFighter.Creatures.Wizard.main(args);
                break;
            case 4:
                monsterChoice = 4;
                System.out.println("Watch out!");
                System.out.println("An ARROW whizzes past!");
                //RPGMonsterFighter.Creatures.Archer.main(args);
                break;
            case 5:
                monsterChoice = 5;
                System.out.println("What is that?");
                System.out.println("The ground TREMBLES around you.");
                //RPGMonsterFighter.Creatures.Giant.main(args);
                break;
            case 6:
                monsterChoice = 6;
                System.out.println("DRAGONS!");
                System.out.println("You think you don't have to say anything.");
                //RPGMonsterFighter.Creatures.EffingDragon.main(args);
                break;
            case 7:
                monsterChoice = 7;
                System.out.println("What's that?");
                System.out.println("The smell of ALE hits you.");
                //RPGMonsterFighter.Creatures.Dwarf.main(args);
                break;
            default:
                monsterChoice = 8;
                System.out.println("DAMNIT YOU BROKE IT.");
                System.out.println("HERE COMES A GLITCH MONSTER.");
                //RPGMonsterFighter.Creatures.Glitch.main(args);
                break;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
