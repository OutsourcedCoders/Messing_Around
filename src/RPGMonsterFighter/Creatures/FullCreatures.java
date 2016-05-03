package RPGMonsterFighter.Creatures;

public class FullCreatures extends RPGMonsterFighter.RPG_Game{
    public static void Zombie() {
        DefaultCreature Zombie = new DefaultCreature("ZOMBIE", 50, 0, 0);
        if (justEncountered) {
            System.out.println("\nYou see a horrifying ZOMBIE.");
            Zombie.setHealth(50 + NumGen.nextInt(25));//                         Default health
            Zombie.setDefense(0);
            Zombie.setMana(0);
            justEncountered = false;
        }
        if (hasChecked) {
            Zombie.checkCreature();
            hasChecked = false;
        }
        if (hasDefended) {
            System.out.println("ZOMBIE defended your attack!");
            hasDefended = false;
        }
        if (attacking) {
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            Zombie.getHitMob(damageDone);
            System.out.println("You did " + Zombie.damage + " damage.");//       Tells people how much damage they did
            Zombie.messageHurt();
            attacking = false;
        } else if (!attacking) {
            damageTaken = NumGen.nextInt(damageRandom);
            Player.getHitPlayer(Player.damage);//                                    Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + Player.damage + " damage!");//        Tells people how much damage they took
        }
        if (plrHp == 0) {
            alive = false;
        }
    }

    public static void Spider() {
        DefaultCreature Spider = new DefaultCreature("SPIDER", 75, 0, 5);
        if (justEncountered) {
            System.out.println("\nA terrifying GIANT SPIDER crawls towards you.");
            Spider.setHealth(75 + NumGen.nextInt(25));//                         Default health
            Spider.setMana(0);
            Spider.setDefense(5);
            justEncountered = false;
        }
        if (hasChecked) {
            Spider.checkCreature();
        }
        if (attacking) {
            Spider.getHitMob(Spider.damage);//                               Script for doing damage
            System.out.println("You did " + Spider.damage + " damage.");//       Tells people how much damage they did
            if (Spider.lostDef) {
                System.out.println("SPIDER's DEFENSE dropped by 1!");
                System.out.println("Critical hit!");
            }
            attacking = false;

        } else if (!attacking) {
            damageTaken = NumGen.nextInt(damageRandom);
            Player.getHitPlayer(damageTaken);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + damageTaken + " damage!");//        Tells people how much damage they took
        }
        if (plrHp == 0) {
            alive = false;
        }
    }
    public static void Slime() {
        DefaultCreature Slime = new DefaultCreature("SLIME", 15, 0, 1);
        if (justEncountered) {
            System.out.println("\nYou hear the SLIME MONSTER squish.");
            Slime.setHealth(15 + NumGen.nextInt(10));//                          Default health
            Slime.setMana(0);
            Slime.setDefense(1);
            justEncountered = false;
        }
        if (hasChecked) {
            Slime.checkCreature();
            hasChecked = false;
        }
        if (attacking) {
            Slime.getHitMob(NumGen.nextInt(5));
            if (Slime.defense != 0 && NumGen.nextInt(100) <= 60) {
                Slime.loseDef(1);
                System.out.println("SLIME MONSTER lost his only defense!");
                System.out.println("Nice!");
            }
            System.out.println("You did " + Slime.damage + " damage.");//        Tells people how much damage they did
            attacking = false;
        } else if (!attacking) {
            damageTaken = NumGen.nextInt(damageRandom);
            Player.getHitPlayer(Player.damage);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println("You took " + Player.damage + " damage!");//      Tells people how much damage they took
        }
        if (plrHp == 0) {
            alive = false;
        }
        if (Slime.health <= 0) {
            System.out.println("SLIME has died!");
            System.out.println("You got 10 exp!");
            inBattle = false;
        }
    }

    public static void Wizard() {
        Mage Wizard = new Mage("WIZARD", 100, 20, 5, false);
        if (justEncountered) {
            System.out.println("\nYou see a powerful WIZARD.");
            Wizard.setHealth(100 + NumGen.nextInt(25));//                         Default health
            Wizard.setDefense(5);
            Wizard.setMana(NumGen.nextInt(5));
            justEncountered = false;
        }
        if (hasChecked) {
            Wizard.checkCreature();
            hasChecked = false;
        }
        if (attacking) {
            damageDone = NumGen.nextInt(damageRandom);//                         Randomizes damage from a val of 0-5
            Wizard.getHitMob(Wizard.damage);//                               Script for doing damage
            if (Wizard.defense != 0 && NumGen.nextInt(10) <= 7) {
                Wizard.loseDef(1);
                System.out.println("WIZARD lost 1 defense!");
                System.out.println("YES!");
            }
            System.out.println(Player.name + " did " + Wizard.damage + " damage!");//       Tells people how much damage they did
            
            attacking = false;
        } else if (!attacking) {
            Wizard.gainMana(NumGen.nextInt(5));
            if (Wizard.mana <= 6) {
                Wizard.setMana(NumGen.nextInt(5));
            }
            while (!Wizard.spellUsed) {

            }
            Player.getHitPlayer(damageTaken);//                            Script for taking damage
            System.out.println("\nOh no!");
            System.out.println(Player.name + " took " + Player.damage + " damage!");//      Tells people how much damage they took
        }
        if (plrHp == 0) {
            alive = false;
        }

    }
}
