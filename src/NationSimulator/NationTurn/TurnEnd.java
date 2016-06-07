package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnEnd extends UserInputs {

    public static void main(String args[]) {
        if (nationWealth < 0) {
            debtCount++;
            System.out.println("You are in debt.");
            System.out.println("You will lose if debt is not eliminated in " + (2 - debtCount) + " years.");
        } else {
            debtCount--;
        }
        if (debtCount == 2) {
            System.out.println("You have lost the game because of debt.");
            gameOn = false;
        }
        if (nationPopulation <= 0) {
            System.out.println(nationName + "'s people have been wiped out.");
            gameOn = false;
        } else if (nationPopulation == 1) {
            System.out.println(nationName + "'s people have basically been wiped out");
            gameOn = false;
        }
        populationLimit = (int) (houseTech * houseCount);
        nationGrowthRate = ((double) houseTech / houseCount);
        nationGrowthRate = nationGrowthRate + .9 + eventPopulationEffect;
        nationPopulation = (int) (nationPopulation * (nationGrowthRate));
        if (nationPopulation > populationLimit) {
            System.out.println("You have reached your population limit of " + populationLimit);
            nationPopulation = populationLimit;
        }
        individualStrength = (weaponCount * weaponTech) + eventStrengthEffect;
        nationStrength = (float) (nationPopulation * individualStrength);
        nationWealthInc = (int) (roadCount * roadTech + eventWealthEffect);
        nationWealth = nationWealth + nationWealthInc;

        turnCount = turnCount + 1;
        NationSimulator.NationEvents.main(args);
        NationSimulator.NationTurn.TurnIntro.main(args);
    }
}
