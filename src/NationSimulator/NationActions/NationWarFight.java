package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationWarFight extends UserInputs{
    public static void main(String[] args) {
        System.out.println("If the strength level of those sent to war matches or outweighs the enemy's strength level, you will repulse the invasion.");
        System.out.print("Input number of people to send to war: ");
        userAnswered = false;
        while(!userAnswered){
            sentToWar = sc.nextInt();
            if(sentToWar > weaponCount){
                System.out.println("There is not enough weapons for everyone, please input another number");
            }
            else{
                userAnswered = true;
            }
        }
        if(enemyAttackSoldiers * .2 > (sentToWar * weaponTech * sentToWar)) {
            System.out.println("Your attack was unsuccessful.");
            System.out.println("You have been invaded.");
            enemyStrength = (enemySoldierStrength - sentToWar * individualStrength);
            enemySoldiers = (int) (enemyStrength / 2);
            placeholder = (int) (-enemyAttackSoldiers * Math.random() * 2) - sentToWar;
            eventWealthEffect = placeholder * (Math.random() + 1) * 5;
            if (Math.abs(placeholder) > nationPopulation) {
                placeholder = nationPopulation;
            }
            nationPopulation = (int) (nationPopulation + placeholder);
            System.out.println("You have lost " + Math.round(Math.abs(eventWealthEffect)) + " gold and " + Math.round(Math.abs(placeholder)) + " people have been slain or captured.");
            if(Math.random() > .33) {
                System.out.println("The enemy has withdrawn from the war.");
                warOn = false;
            }
        }
        else if(sentToWar == 0) {
            placeholder = (int) (-enemyAttackSoldiers * Math.random() * 2);
            eventWealthEffect = placeholder * (Math.random() + 1) * 5;
            if(Math.abs(placeholder) > nationPopulation) {
                placeholder = nationPopulation;
            }
            nationPopulation = (int) (nationPopulation + placeholder);
            System.out.println("You have lost " + (int)(Math.round(Math.abs(eventWealthEffect))) + " gold and " + (int)(Math.abs(placeholder)) + " people have been slain or captured.");
        }
        else {
            System.out.println("You have successfully repelled the invasion.");
            enemyStrength = (enemySoldierStrength - sentToWar * individualStrength);
            placeholder = (int) (sentToWar * individualStrength / enemySoldierStrength);
            weaponCount = (int) (weaponCount - (sentToWar * individualStrength / enemySoldierStrength));
            nationPopulation = (int) (nationPopulation + (placeholder - sentToWar));
            System.out.println(Math.round(Math.abs(placeholder - sentToWar)) + " soldiers were slain.");
            if(Math.random() > .33) {
                System.out.println("The enemy has withdrawn from the war.");
                warOn = false;
            }
        }
    }
}
