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
}
