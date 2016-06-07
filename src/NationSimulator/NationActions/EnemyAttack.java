package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class EnemyAttack extends UserInputs {

    public static void main(String[] args) {
        userAction = "attacked";
        NationSimulator.NationInfo.main(args);
        enemyAttackSoldiers = (int) (enemySoldiers / Math.random() * Math.random() + 5);
        System.out.println("The enemy has invaded with " + enemyAttackSoldiers + " soldiers with a strength of " + f.format(enemyAttackSoldiers * ((Math.random() + 2) / 8)));
        userTick = 0;
        turnSubActive = true;
        while (turnSubActive) {
            System.out.println("What will you do?");
            userInput = sc.nextLine();
            switch (userInput.toUpperCase()) {
                case "FIGHT":
                    NationSimulator.NationActions.NationWarFight.main(args);
                    enemySoldiers -= enemyAttackSoldiers;
                    turnSubActive = false;
                    break;
                case "BRIBE":
                    NationSimulator.NationActions.NationWarBribe.main(args);
                    break;
                case "SURRENDER":
                    placeholder = (int) (-enemyAttackSoldiers * Math.random() * 3);
                    eventWealthEffect = placeholder * (Math.random() + 1) * 5;
                    if (Math.abs(placeholder) > nationPopulation) {
                        placeholder = -nationPopulation;
                    }
                    nationPopulation = (int) (nationPopulation + placeholder);
                    enemySoldiers += (int) (Math.random() * placeholder);
                    System.out.println("You have lost " + (int) (Math.round(Math.abs(eventWealthEffect))) + " gold and " + (int) (Math.abs(placeholder)) + " people have been slain or captured.");
                    turnSubActive = false;
                    break;
                default:
                    if (userTick == 1) {
                        System.out.println("In your indecisiveness, the enemy has attacked");
                        placeholder = (int) (-enemyAttackSoldiers * Math.random() * 4);
                        eventWealthEffect = placeholder * (Math.random() + 1) * 5;
                        if (Math.abs(placeholder) > nationPopulation) {
                            placeholder = nationPopulation;
                        }
                        nationPopulation = (int) (nationPopulation + placeholder);
                        enemySoldiers += (int) (Math.random() * placeholder);
                        System.out.println("You have lost " + (int) (Math.round(Math.abs(eventWealthEffect))) + " gold and " + (int) (Math.abs(placeholder)) + " people have been slain or captured.");
                        turnSubActive = false;
                    } else {
                        userTick++;
                    }
                    break;
            }
        }
    }
}