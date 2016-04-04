package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnEnd extends UserInputs{
    public static void main(String args[]) {
        NationSimulator.NationEvents.main(args);
        populationLimit = houseTech * houseCount;
        nationGrowthRate = 1 + (houseTech/houseCount) + eventPopulationEffect;
        System.out.println(nationGrowthRate);
        nationPopulation = (int) (nationPopulation * (nationGrowthRate)); 
        if (nationPopulation > populationLimit) {
            nationPopulation = populationLimit;
        }
        if(nationPopulation <= 0) {
            gameOn = false;
        }
        individualStrength = weaponCount * weaponTech * eventStrengthEffect;
        nationStrength     = (float) (nationPopulation * individualStrength);
        nationWealthInc    = (int) (roadCount * roadTech + eventWealthEffect);
        nationWealth       = nationWealth + nationWealthInc; 
        if(nationWealth < 0) {
            System.out.println("You are in debt.");
            System.out.println("You will lose if debt is not eliminated in 2 years.");
            debtCount++;
            if(debtCount == 2) {
                gameOn = false;
            }
        }
        else{
            debtCount--;
        }
        turnCount = turnCount + 1;
        NationSimulator.NationTurn.TurnIntro.main(args);
    }
}
