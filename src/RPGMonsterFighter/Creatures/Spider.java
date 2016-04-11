package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Spider extends RPG_Game{
    public static DefaultCreature Spider = new DefaultCreature(75, 0, 5);
    public static void main(String[] args) {
        if(justEncountered){
            System.out.println("\nA terrifying GIANT SPIDER crawls towards you.");
            Spider.setHealth(75 + NumGen.nextInt(25));//                         Default health
            Spider.setMana(0);
            Spider.setDefense(5);
            justEncountered = false;
        }
        if(hasChecked){
            System.out.println("SPIDER attributes:");
            System.out.println("HP   = " + Spider.health);
            System.out.println("DEF  = " + Spider.defense);
            System.out.println("MANA = " + Spider.mana);
            hasChecked = false;
        }if(attacking){
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            Spider.loseHealthMob(Spider.damage);//                               Script for doing damage
            if(Spider.defense != 0 && NumGen.nextInt(10) <= 6){
                Spider.loseDef(1);
                System.out.println("Spider lost 1 defense!");
                System.out.println("YES!");
            }
            System.out.println("You did " + Spider.damage + " damage.");//       Tells people how much damage they did
            attacking = false;
            RPGMonsterFighter.Creatures.Spider.main(args);
        }else if (!attacking){
            damageTaken = NumGen.nextInt(damageRandom);
            Player.loseHealthPlayer(Player.damage);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");//        Tells people how much damage they took
        }if(plrHp == 0){
            alive = false;
        }
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
