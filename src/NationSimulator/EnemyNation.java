package NationSimulator;

import MessingAround.UserInputs;

public class EnemyNation extends UserInputs{
    public static void main(String[] args) {
        enemyPopulation  = (int) (Math.random() * nationPopulation + (turnCount * 4));
        enemyWeapons     = (int) (Math.random() * 2 * weaponCount);
        enemyStrength    = enemyWeapons * enemyPopulation * Math.random()/10 + .1;
        enemyWealth      = (int) (Math.random() * nationWealth + turnCount * Math.random() * 20);
        enemyBribe       = (int) (enemyWealth / (Math.random() * 4));
        enemySoldiers    = (int) (Math.random() * nationPopulation/4 + Math.random() * enemyPopulation/2);
        enemySoldierStrength = .2 * enemySoldiers;
    }
}
