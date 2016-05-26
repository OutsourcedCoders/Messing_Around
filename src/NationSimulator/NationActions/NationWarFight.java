package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationWarFight extends UserInputs{
    public static void main(String[] args) {
        System.out.println("If the strength level of those sent to war matches or outweighs the enemy's strength level, you will repulse the invasion.");
        System.out.println("Otherwise, the percentage higher the opposing nation's strength is will reflect the damage dealt to your nation's assets.");
        System.out.println("Input number of people to send to war");
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
        enemySoldiers = (int) (Math.random() * nationPopulation/4 + Math.random() * enemyPopulation/2);
        enemySoldierStrength = .01 * 2 * enemySoldiers;
        if(enemySoldierStrength > sentToWar * weaponTech * sentToWar) {
            System.out.println("You have been successfully invaded.");
            enemySoldierStrength = (enemySoldierStrength - sentToWar * individualStrength);
            eventWealthEffect = -enemySoldierStrength/sentToWar * weaponTech * weaponCount;
            eventPopulationEffect = -enemySoldierStrength/sentToWar * weaponTech * weaponCount;
            warOn = false;
        }
        else {
            System.out.println("You have successfully repelled the invasion.");
            sentToWar = (int) (sentToWar * individualStrength / enemySoldierStrength);
            weaponCount = (int) (weaponCount - (sentToWar * individualStrength / enemySoldierStrength));
            if(Math.random() > .33) {
                warOn = false;
            }
            else{
            }
        }
    }
}
