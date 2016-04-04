
package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Zombie extends RPG_Game{
    public static void main(String[] args) {
        if (justEncountered){
            System.out.println("\nYou see a horrifying ZOMBIE.");
            DefaultCreature Zombie = new DefaultCreature(100, 0, 0);
            Zombie.setHealth(100 + NumGen.nextInt(25));//                        Default health 
        }
        if (attacking){
            int damageDone = NumGen.nextInt(damageRandom);//                     Randomizes damage from a val of 0-5
            damageDone = damageDone * weaponClass;//                             Currently unused
            damageDone = damageDone + 1;//                                       Adds 1 to damage done to do at least 1 damage
            //Zombie.loseHealth(damageDone);                         //          Script for doing damage
            System.out.println("You did " + damageDone + " damage.");
        }else if (!attacking){
            int damageTaken = NumGen.nextInt(damageRandom);
            damageTaken = damageTaken - plrDef;
            damageTaken = damageTaken + 1;//                                     Adds 1 to damage taken to take at least 1 damage
            Player.loseHealth(damageTaken);//                                    Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");
        }if (plrHp == 0){
            alive = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
