package NationSimulator.NationActions;

import MessingAround.UserInputs;
public class EnemyAttack extends UserInputs{
    public static void main(String[] args) {
        int placeholder;
        userAction = "attacked";
        NationSimulator.NationInfo.main(args);
        enemyAttackSoldiers = (int) (enemySoldiers / Math.random() * Math.random());
        System.out.println("The enemy has invaded with " + enemyAttackSoldiers + " soldiers with a strength of " + enemyAttackSoldiers * ((Math.random() + 2) / 8));
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
                if(placeholder > nationPopulation) {
                    System.out.println("test");
                    placeholder = nationPopulation;
                }
                nationPopulation = nationPopulation + placeholder;
                System.out.println("You have lost " + Math.abs(eventWealthEffect) + " gold and " + Math.abs(placeholder) + " people have been slain or captured.");
                break;
            default:
                placeholder = (int) (-enemyAttackSoldiers * Math.random() * 2);
                eventWealthEffect = placeholder * (Math.random() + 1) * 5;
                if(placeholder > nationPopulation) {
                    System.out.println("test");
                    placeholder = nationPopulation;
                }
                nationPopulation = nationPopulation + placeholder;
                System.out.println("You have lost " + Math.abs(eventWealthEffect) + " gold and " + Math.abs(placeholder) + " people have been slain or captured.");
                break;
        }
    }
}
