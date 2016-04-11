package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Slime extends RPG_Game{
    public static DefaultCreature Slime = new DefaultCreature(15, 0, 1);
    public static void main(String[] args) {
        if(justEncountered){
            System.out.println("\nYou hear the SLIME MONSTER squish.");
            Slime.setHealth(15 + NumGen.nextInt(10));//                          Default health
            Slime.setMana(0);
            Slime.setDefense(1);
            justEncountered = false;
        }if(hasChecked){
            System.out.println("SLIME MONSTER attributes:");
            System.out.println("HP   = " + Slime.health);
            System.out.println("DEF  = " + Slime.defense);
            System.out.println("MANA = " + Slime.mana);
            hasChecked = false;
        }if(attacking){
            damageDone = NumGen.nextInt(5);//                                    Randomizes damage from a val of 0-5
            Slime.loseHealthMob(damageDone);
            if(Slime.defense != 0 && NumGen.nextInt(10) <= 6){
                Slime.loseDef(1);
                System.out.println("SLIME MONSTER lost his only defense!");
                System.out.println("Nice!");
            }
            System.out.println("You did " + Slime.damage + " damage.");//        Tells people how much damage they did
            attacking = false;
            RPGMonsterFighter.Creatures.Slime.main(args);
        }else if(!attacking){
            damageTaken = NumGen.nextInt(damageRandom);
            Player.loseHealthPlayer(Player.damage);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + Player.damage + " damage!");//      Tells people how much damage they took
        }if(plrHp == 0){
            alive = false;
        }if(Slime.health <= 0){
            System.out.println("SLIME has died!");
            System.out.println("You got 10 exp!");
            inBattle = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
