package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Slime extends RPG_Game{
    public static DefaultCreature Slime = new DefaultCreature(15, 0, 1);
    public static void main(String[] args) {
        if (justEncountered){
            System.out.println("\nYou see a horrifying ZOMBIE.");
            Slime.setHealth(15 + NumGen.nextInt(10));//                          Default health
            justEncountered = false;
        }
        if (attacking){
            int damageDone = NumGen.nextInt(damageRandom);//                     Randomizes damage from a val of 0-5
            damageDone = damageDone * weaponClass;//                             Currently unused
            damageDone = damageDone + 1;//                                       Adds 1 to damage done to do at least 1 damage
            Slime.loseHealth(damageDone);//                                      Script for doing damage
            if(Slime.defense != 0 && NumGen.nextInt(10) <= 6){
                Slime.loseDef(1);
                System.out.println("Slime lost his only defense!");
                System.out.println("Nice!");
            }
            System.out.println("You did " + damageDone + " damage.");//          Tells people how much damage they did
            attacking = false;
        }else if (!attacking && !justEncountered){
            int damageTaken = NumGen.nextInt(damageRandom);
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
