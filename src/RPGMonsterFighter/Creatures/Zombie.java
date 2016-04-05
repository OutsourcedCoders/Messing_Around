package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Zombie extends RPG_Game{
    public static DefaultCreature Zombie = new DefaultCreature(50, 0, 0);
    public static void main(String[] args) {
        if (justEncountered){
            System.out.println("\nYou see a horrifying ZOMBIE.");
            Zombie.setHealth(50 + NumGen.nextInt(25));//                         Default health
            Zombie.setDefense(0);
            Zombie.setMana(0);
            justEncountered = false;
        }
        if (attacking){
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            damageDone = damageDone * weaponClass;//                             Currently unused
            damageDone = damageDone + 1;//                                       Adds 1 to damage done to do at least 1 damage
            Zombie.loseHealth(damageDone);//                                     Script for doing damage
            System.out.println("You did " + damageDone + " damage.");//          Tells people how much damage they did
        }else if (!attacking){
            damageTaken = NumGen.nextInt(damageRandom);
            damageTaken = damageTaken - plrDef;
            damageTaken = damageTaken + 1;//                                     Adds 1 to damage taken to take at least 1 damage
            Player.loseHealth(damageTaken);//                                    Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");//        Tells people how much damage they took
        }if (plrHp == 0){
            alive = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
