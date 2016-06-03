package NationSimulator.NationActions;

import MessingAround.UserInputs;
import java.text.DecimalFormat;

public class EnemyAttack extends UserInputs{
    public static void main(String[] args) {
        userAction = "attacked";
        NationSimulator.NationInfo.main(args);
        enemyAttackSoldiers = (int) (enemySoldiers / Math.random() * Math.random() + 5);
        System.out.println("The enemy has invaded with " + enemyAttackSoldiers + " soldiers with a strength of " + f.format(enemyAttackSoldiers * ((Math.random() + 2) / 8)));
        System.out.println("What will you do?");
        userInput = sc.nextLine();
        switch(userInput.toUpperCase()) {
            case "FIGHT":
                NationSimulator.NationActions.NationWarFight.main(args);
                enemySoldiers -= enemyAttackSoldiers;
                break;
            case "BRIBE":
                NationSimulator.NationActions.NationWarBribe.main(args);
                break;
            case "SURRENDER":
                placeholder = (int) (-enemyAttackSoldiers * Math.random() * 2);
                eventWealthEffect = placeholder * (Math.random() + 1) * 5;
                if(Math.abs(placeholder) > nationPopulation) {
                    placeholder = nationPopulation;
                }
                nationPopulation = (int) (nationPopulation + placeholder);
                System.out.println("You have lost " + (int)(Math.round(Math.abs(eventWealthEffect))) + " gold and " + (int)(Math.abs(placeholder)) + " people have been slain or captured.");
                break;
            default:
                placeholder = (int) (-enemyAttackSoldiers * Math.random() * 2);
                eventWealthEffect = placeholder * (Math.random() + 1) * 5;
                if(Math.abs(placeholder) > nationPopulation) {
                    placeholder = nationPopulation;
                }
                nationPopulation = (int) (nationPopulation + placeholder);
                System.out.println("You have lost " + (int)(Math.round(Math.abs(eventWealthEffect))) + " gold and " + (int)(Math.abs(placeholder)) + " people have been slain or captured.");
                break;
        }
    }
}