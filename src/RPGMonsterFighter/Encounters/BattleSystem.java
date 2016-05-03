package RPGMonsterFighter.Encounters;

import static MessingAround.UserInputs.*;
import RPGMonsterFighter.Creatures.*;
import static RPGMonsterFighter.Encounters.BattleSystem.Wizard;
import static RPGMonsterFighter.RPG_Game.Player;

public class BattleSystem extends MonsterChoice {

    public static void BattleScript() {
        if (Player.health <= 0) {
            alive = false;
            World.LandGen();
        }
        while (inBattle = true) {
            System.out.println("----------------------------");
            System.out.println("| FIGHT | ITEM | ACT | RUN |");
            System.out.println("----------------------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch (userInput.toUpperCase()) {
                case "FIGHT":
                    attacking = true;
                    switch (monsterChoice) {
                        case 0:
                            Zombie();
                            break;
                        case 1:
                            Spider();
                            break;
                        case 2:
                            Slime();
                            break;
                        case 3:
                            Wizard();
                            break;
                        case 4:
                            //Archer();
                            break;
                        case 5:
                            //Giant();
                            break;
                        case 6:
                            //EffingDragon();
                            break;
                        case 7:
                            //Dwarf();
                            break;
                        case 8:
                            //Glitch();
                        default:
                            System.out.println("Uh oh! You run across a");//     YOU BROKE IT
                            System.out.println("But nobody came.");//            WHY?!?!?!?!
                            Player.setHealth(-9999);
                            break;
                    }
                    break;
                case "ITEM":
                    System.out.println("I haven't finished this yet D: ");//     TODO: actually make items.
                    break;
                case "ACT":
                    userAnswered = false;
                    while (!userAnswered) {
                        System.out.println("---------------");
                        System.out.println("| CHECK | SAY |");
                        System.out.println("---------------");
                        System.out.print(": ");
                        userInput = sc.nextLine();
                        switch (userInput.toUpperCase()) {
                            case "CHECK":
                                switch (monsterChoice) {
                                    case 0:
                                        hasChecked = true;
                                        Zombie();
                                        break;
                                    case 1:
                                        hasChecked = true;
                                        Spider();
                                        break;
                                    case 2:
                                        hasChecked = true;
                                        Slime();
                                        break;
                                    case 3:
                                        hasChecked = true;
                                        Wizard();
                                        break;
                                    case 4:
                                        hasChecked = true;
                                        //Archer();
                                        break;
                                    case 5:
                                        hasChecked = true;
                                        //Giant();
                                        break;
                                    case 6:
                                        hasChecked = true;
                                        //EffingDragon();
                                        break;
                                    case 7:
                                        hasChecked = true;
                                        //Dwarf();
                                        break;
                                    default:
                                        System.out.println("GL1TC4 M0N2T3R:");
                                        System.out.println("DEF: OVER 9000!");
                                        System.out.println("ATK: 1337");
                                        System.out.println("HP:  8008");
                                        break;
                                }
                                break;
                            case "SAY":
                                break;
                        }
                    }
                    break;
                case "RUN":
                    switch (monsterChoice) {
                        case 0:
                            System.out.println("Obviously, you're too fast.");
                            System.out.println("You outrun the ZOMBIE.");
                            inBattle = false;
                            break;
                        case 1:
                            System.out.println("");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            System.out.println("You can't outrun the flames.");//Dragon encounter
                            break;
                        case 7:
                            break;
                        default:
                            System.out.print("HOW THE F*** DID YOU BREAK ");
                            System.out.println("IT THIS TIME?!?!?");
                            break;
                    }
            }
        }
        RPGMonsterFighter.Encounters.World.LandGen();
    }

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
