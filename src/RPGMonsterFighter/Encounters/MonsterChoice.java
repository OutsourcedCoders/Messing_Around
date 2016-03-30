package RPGMonsterFighter.Encounters;

public class MonsterChoice extends World{
    public static void main(String[] args) {
        int creatureRandomVal = NumGen.nextInt(creatureRandom);
        switch(creatureRandomVal){
            case 0:
                
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
                System.out.println("Uh oh! You run across a M1S21NGN0");//       YOU BROKE IT
                System.out.println("But nobody came.");//                        WHY?!?!?!?!
                inBattle = false;
                break;
        }
    }
}
