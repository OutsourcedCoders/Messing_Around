package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Wizard extends RPG_Game{
    public static DefaultCreature Wizard = new DefaultCreature(100, 20, 5);
    public static void main(String[] args) {
        if(justEncountered){
            System.out.println("\nYou see a powerful WIZARD.");
            Wizard.setHealth(100 + NumGen.nextInt(25));//                         Default health
            Wizard.setDefense(5);
            Wizard.setMana(20);
            justEncountered = false;
        }if(hasChecked){
            System.out.println("WIZARD attributes:");
            System.out.println("HP   = " + Wizard.health);
            System.out.println("DEF  = " + Wizard.defense);
            System.out.println("MANA = " + Wizard.mana);
            hasChecked = false;
        }if(attacking){
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            damageDone = damageDone * weaponClass;//                             Currently unused
            damageDone = damageDone + 1;//                                       Adds 1 to damage done to do at least 1 damage
            Wizard.loseHealth(damageDone);//                                     Script for doing damage
            if(Wizard.defense != 0 && NumGen.nextInt(10) <= 6){
                Wizard.loseDef(1);
                System.out.println("WIZARD lost 1 defense!");
                System.out.println("YES!");
            }
            System.out.println("You did " + damageDone + " damage.");//          Tells people how much damage they did
            attacking = false;
        }else if(!attacking){
            damageTaken = NumGen.nextInt(damageRandom);
            damageTaken = damageTaken - plrDef;
            damageTaken = damageTaken + 1;//                                     Adds 1 to damage taken to take at least 1 damage
            if(Wizard.mana >= 3){
                
            }
            Player.loseHealth(damageTaken);//                                    Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");//        Tells people how much damage they took
        }if(plrHp == 0){
            alive = false;
        }
        //Wizard.gainMana();
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
