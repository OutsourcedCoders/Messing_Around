package RPGMonsterFighter.Encounters;

import static MessingAround.UserInputs.*;
import RPGMonsterFighter.Creatures.*;
import static RPGMonsterFighter.RPG_Game.Player;

public class BattleSystem extends MonsterChoice {

    public static void BattleScript() {
        if (Player.health <= 0) {
            isAlive = false;
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
                            RPGMonsterFighter.Creatures.FullCreatures.Zombie();
                            break;
                        case 1:
                            RPGMonsterFighter.Creatures.FullCreatures.Spider();
                            break;
                        case 2:
                            RPGMonsterFighter.Creatures.FullCreatures.Slime();
                            break;
                        case 3:
                            RPGMonsterFighter.Creatures.FullCreatures.Wizard();
                            break;
                        case 4:
                            //RPGMonsterFighter.Creatures.FullCreatures.Archer();
                            break;
                        case 5:
                            //RPGMonsterFighter.Creatures.FullCreatures.Giant();
                            break;
                        case 6:
                            //RPGMonsterFighter.Creatures.FullCreatures.EffingDragon();
                            break;
                        case 7:
                            //RPGMonsterFighter.Creatures.FullCreatures.Dwarf();
                            break;
                        case 8:
                            //RPGMonsterFighter.Creatures.FullCreatures.Glitch();
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
                    while(!userAnswered){
                        System.out.println("----------------------");
                        System.out.println("| CHECK | SAY | BACK |");
                        System.out.println("----------------------");
                        System.out.print(": ");
                        userInput = sc.nextLine();
                        switch (userInput.toUpperCase()) {
                            case "CHECK":
                                switch (monsterChoice) {
                                    case 0:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.FullCreatures.Zombie();
                                        break;
                                    case 1:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.FullCreatures.Spider();
                                        break;
                                    case 2:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.FullCreatures.Slime();
                                        break;
                                    case 3:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.FullCreatures.Wizard();
                                        break;
                                    case 4:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.FullCreatures.Archer();
                                        break;
                                    case 5:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.FullCreatures.Giant();
                                        break;
                                    case 6:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.FullCreatures.EffingDragon();
                                        break;
                                    case 7:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.FullCreatures.Dwarf();
                                        break;
                                    default:
                                        System.out.println("GL1TC4 M0N2T3R:");
                                        System.out.println("DEF: OVER 9000!");
                                        System.out.println("ATK: 1337");
                                        System.out.println("HP:  8008");
                                        //RPGMonsterFighter.Creatures.Glitch.main(args);
                                        break;
                                }
                                break;
                            case "SAY":
                                System.out.println("This isn't finished yet.");
                                System.out.println(":");
                                break;
                            case "BACK":
                                userAnswered = true;
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
        if(!inBattle){
            RPGMonsterFighter.Encounters.World.LandGen();
        }
    }
}