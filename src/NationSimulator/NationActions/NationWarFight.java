package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationWarFight extends UserInputs{
    public static void main(String[] args) {
        System.out.println("If the strength level of those sent to war matches or outweighs the enemy's strength level, you will repulse the invasion.");
        System.out.println("Otherwise, the percentage higher the opposing nation's strength is will reflect the damage dealt to your nation's assets.");
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
        if(enemySoldierStrength > sentToWar * weaponTech * sentToWar) {
            System.out.println("Your attack was unsuccessful.");
            System.out.println("You have been invaded.");
            enemyStrength = (enemySoldierStrength - sentToWar * individualStrength);
            eventWealthEffect = -enemySoldierStrength/sentToWar * weaponTech * weaponCount;
            eventPopulationEffect = -enemySoldierStrength/sentToWar * weaponTech * weaponCount;
            System.out.println("You have lost " + Math.abs(eventWealthEffect) + " gold and " + Math.abs(eventPopulationEffect) + " soldiers were slain.");
            warOn = false;            
            if(Math.random() > .33) {
                System.out.println("The enemy has withdrawn.");
                warOn = false;
            }
        }
        else {
            System.out.println("You have successfully repelled the invasion.");
            enemyStrength = (enemySoldierStrength - sentToWar * individualStrength);
            sentToWar = (int) (sentToWar * individualStrength / enemySoldierStrength);
            weaponCount = (int) (weaponCount - (sentToWar * individualStrength / enemySoldierStrength));
            System.out.println("You have lost " + Math.abs(eventWealthEffect) + " gold and " + Math.abs(eventPopulationEffect) + " soldiers were slain.");
            if(Math.random() > .33) {
                System.out.println("The enemy has withdrawn.");
                warOn = false;
            }
        }
    }
}
