
package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Zombie extends RPG_Game{
    public static void main(String[] args) {
        if (justEncountered){
            System.out.println("\nYou see a horrifying ZOMBIE.");
            DefaultCreature Zombie = new DefaultCreature(100, 0, 0);
            Zombie.setHealth(100 + NumGen.nextInt(25));
        }
        if (attacking){
            int damageDone = NumGen.nextInt(damageRandom);
            damageDone = damageDone * weaponClass;
            //Zombie.loseHealth(damageDone);
            System.out.println("You did " + damageDone + " damage.");
        }else if (!attacking){
            int damageTaken = NumGen.nextInt(damageRandom);
            damageTaken = damageTaken - plrDef;
            Player.loseHealth(damageTaken);
            System.out.println("Oh no!");
            System.out.println("You took " + damageTaken + " damage!");   
        }if (plrHp == 0){
            alive = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
