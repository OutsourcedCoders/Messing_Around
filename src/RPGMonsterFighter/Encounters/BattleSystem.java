package RPGMonsterFighter.Encounters;

public class BattleSystem extends MonsterChoice{
    public static void main(String[] args) {
        while(inBattle = true){
            System.out.println("----------------------------");
            System.out.println("| FIGHT | ITEM | ACT | RUN |");
            System.out.println("----------------------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "FIGHT":
                    attacking = true;
                    switch(monsterChoice){
                        case 0:
                            RPGMonsterFighter.Creatures.Zombie.main(args);
                            break;
                        case 1:
                            RPGMonsterFighter.Creatures.Spider.main(args);
                            break;
                        case 2:
                            RPGMonsterFighter.Creatures.Slime.main(args);
                            break;
                        case 3:
                            RPGMonsterFighter.Creatures.Wizard.main(args);
                            break;
                        case 4:
                            //RPGMonsterFighter.Creatures.Archer.main(args);
                            break;
                        case 5:
                            //RPGMonsterFighter.Creatures.Giant.main(args);
                            break;
                        case 6:
                            //RPGMonsterFighter.Creatures.EffingDragon.main(args);
                            break;
                        case 7:
                            //RPGMonsterFighter.Creatures.Dwarf.main(args);
                            break;
                        default:
                            System.out.println("Uh oh! You run across a");//     YOU BROKE IT
                            System.out.println("But nobody came.");//            WHY?!?!?!?!
                            //RPGMonsterFighter.Creatures.Glitch.main(args);
                            break;
                    }
                    break;
                case "ITEM":
                    System.out.println("I haven't finished this yet D: ");//     TODO: actually make items.
                    break;
                case "ACT":
                    userAnswered = false;
                    while(!userAnswered){
                        System.out.println("---------------");
                        System.out.println("| CHECK | SAY |");
                        System.out.println("---------------");
                        System.out.print(": ");
                        userInput = sc.nextLine();
                        switch(userInput.toUpperCase()){
                            case "CHECK":
                                switch(monsterChoice){
                                    case 0:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.Zombie.main(args);
                                        break;
                                    case 1:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.Spider.main(args);
                                        break;
                                    case 2:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.Slime.main(args);
                                        break;
                                    case 3:
                                        hasChecked = true;
                                        RPGMonsterFighter.Creatures.Wizard.main(args);
                                        break;
                                    case 4:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.Archer.main(args);
                                        break;
                                    case 5:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.Giant.main(args);
                                        break;
                                    case 6:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.EffingDragon.main(args);
                                        break;
                                    case 7:
                                        hasChecked = true;
                                        //RPGMonsterFighter.Creatures.Dwarf.main(args);
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
                    switch(monsterChoice){
                        case 0:
                            System.out.println("Obviously, you're too fast.");
                            System.out.println("You outrun the ZOMBIE.");
                            inBattle = false;
                            break;
                        case 1:
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
    }
}
