package RPGMonsterFighter.Encounters;

public class MonsterChoice extends World{
    public static void main(String[] args) {
        int creatureRandomVal = NumGen.nextInt(creatureRandom);
        switch(creatureRandomVal){
            case 0:
                monsterChoice = 0;
                System.out.println("Oh no!"
                        + "");
                break;
            case 1:
                monsterChoice = 1;
                break;
            case 2:
                monsterChoice = 2;
                break;
            case 3:
                monsterChoice = 3;
                break;
            case 4:
                monsterChoice = 4;
                break;
            case 5:
                monsterChoice = 5;
                break;
            case 6:
                monsterChoice = 6;
                break;
            case 7:
                monsterChoice = 7;
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
