package NationSimulator;

import MessingAround.UserInputs;

public class EnemyNation extends UserInputs{
    public static void main(String[] args) {
        enemyPopulation  = (int) (Math.random() * nationPopulation + turnCount * 5);
        enemyWeapons     = (int) (Math.random() * 2 * weaponCount);
        enemyStrength    = enemyWeapons * enemyPopulation * Math.random()/10 + .1;
        enemyWealth      = (int) (Math.random() * nationWealth + turnCount * Math.random() * 5);
        enemyBribe       = enemyWealth / 4;
    }
}
