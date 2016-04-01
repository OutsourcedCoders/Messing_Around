 package RPGMonsterFighter.Encounters;

public class MonsterChoice extends World{
    public static void main(String[] args) {
        int creatureRandomVal = NumGen.nextInt(creatureRandom);
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
                break;
            case 3:
                monsterChoice = 3;
                System.out.println("Oh dear god!");
                System.out.println("SPARKS crackle around you!");
                break;
            case 4:
                monsterChoice = 4;
                System.out.println("Watch out!");
                System.out.println("An ARROW whizzes past!");
                break;
            case 5:
                monsterChoice = 5;
                System.out.println("What is that?");
                System.out.println("The ground TREMBLES around you.");
                break;
            case 6:
                monsterChoice = 6;
                System.out.println("DRAGONS!");
                System.out.println("You think you don't have to say anything.");
                break;
            case 7:
                monsterChoice = 7;
                System.out.println("What's that?");
                System.out.println("The smell of ALE hits you.");
                break;
            default:
                monsterChoice = 8;
                System.out.println("DAMNIT YOU BROKE IT.");
                System.out.println("HERE COMES A GLITCH MONSTER.");
                break;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
