
package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Zombie extends RPG_Game{
    public static void main(String[] args) {
        int zombHp = 100 + NumGen.nextInt(25);
        System.out.println("\nYou see a horrifying ZOMBIE.");
        DefaultCreature Zombie = new DefaultCreature(zombHp, 0, 0);
        
        if (attacking){
            int damageDone = NumGen.nextInt(damageRandom);
            damageDone = damageDone * weaponClass;
            Zombie.setHealth(zombHp - damageDone);
        }else if (!attacking){
            //damageTaken = NumGen.nextInt(damageRandom);
            //damageTaken = damageTaken - plrDef;
        }
    }
}
