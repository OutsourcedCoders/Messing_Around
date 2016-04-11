package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Zombie extends RPG_Game{
    public static DefaultCreature Zombie = new DefaultCreature(50, 0, 0);
    public static void main(String[] args) {
        if(justEncountered){
            System.out.println("\nYou see a horrifying ZOMBIE.");
            Zombie.setHealth(50 + NumGen.nextInt(25));//                         Default health
            Zombie.setDefense(0);
            Zombie.setMana(0);
            justEncountered = false;
        }if(hasChecked){
            System.out.println("ZOMBIE attributes:");
            System.out.println("HP   = " + Zombie.health);
            System.out.println("DEF  = " + Zombie.defense);
            System.out.println("MANA = " + Zombie.mana);
            hasChecked = false;
        }if(attacking){
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            System.out.println("You did " + damageDone + " damage.");//          Tells people how much damage they did
            attacking = false;
            RPGMonsterFighter.Creatures.Zombie.main(args);
        }else if(!attacking){
            damageTaken = NumGen.nextInt(damageRandom);
            Player.loseHealthPlayer(damageTaken);//                                    Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");//        Tells people how much damage they took
        }if(plrHp == 0){
            alive = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
