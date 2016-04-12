package RPGMonsterFighter.Creatures;
import RPGMonsterFighter.RPG_Game;

public class Wizard extends RPG_Game{
    public static DefaultCreature Wizard = new DefaultCreature(100, 20, 5);
    public static void main(String[] args) {
        boolean spellUsed = false;
        if(justEncountered){
            System.out.println("\nYou see a powerful WIZARD.");
            Wizard.setHealth(100 + NumGen.nextInt(25));//                         Default health
            Wizard.setDefense(5);
            Wizard.setMana(NumGen.nextInt(5));
            justEncountered = false;
        }if(hasChecked){
            System.out.println("WIZARD attributes:");
            System.out.println("HP   = " + Wizard.health);
            System.out.println("DEF  = " + Wizard.defense);
            System.out.println("MANA = " + Wizard.mana);
            hasChecked = false;
        }if(attacking){
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            Wizard.loseHealthMob(Wizard.damage);//                                  Script for doing damage
            if(Wizard.defense != 0 && NumGen.nextInt(10) <= 7){
                Wizard.loseDef(1);
                System.out.println("WIZARD lost 1 defense!");
                System.out.println("YES!");
            }
            System.out.println("You did " + Wizard.damage + " damage.");//       Tells people how much damage they did
            attacking = false;
        }else if(!attacking){
            Wizard.gainMana(NumGen.nextInt(5));
            if(Wizard.mana <= 6){
                Wizard.setMana(NumGen.nextInt(5));
            }
            while(!spellUsed)
                switch(Wizard.mana){
                    case 0:
                        damageTaken = NumGen.nextInt(5);
                        System.out.println("The WIZARD hit you with his CANE!");
                    System.out.println("That hurts!");
                case 1:
                    damageTaken = 10;
                    System.out.println("WIZARD used EARTH TREMBLE!");
                    System.out.println("The ground SHAKES.");
                case 2:
                    damageTaken = 15;
                    System.out.println("WIZARD used WATER BOLT!");
                    System.out.println("Globules of ENCHANTED WATER fly at you!");
                case 3:
                    damageTaken = 20;
                    System.out.println("WIZARD used STAR STORM!");
                    System.out.println("FALLEN STARS rain around you!");
                    break;
                case 4:
                    damageTaken = 25;
                    System.out.println("WIZARD used SHOCKER BREAKER!");
                    System.out.println("You get hit by a BEAM OF LIGHT!");
                    break;
                case 5:
                    damageTaken = 30;
                    System.out.println("WIZARD used LIGHTNING BOLT!");
                    System.out.println("The ground SMOULDERS around you.");
                    break;
                default:
                    damageTaken = 9999;
                    System.out.println("W1ZZ4RD us3d G1ItCH 4TTcK?");
                    System.out.println("YOU BROKE IT NOW YOU'RE DEAD!");
                }
            Player.loseHealthPlayer(damageTaken);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + Player.damage + " damage!");//      Tells people how much damage they took
        }if(plrHp == 0){
            alive = false;
        }
        
        RPGMonsterFighter.Encounters.BattleSystem.main(args);
    }
}
