package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnEnd extends UserInputs{
    public static void main(String args[]) {
        populationLimit = (int) (houseTech * houseCount);
        nationGrowthRate = ((double)houseTech/houseCount); 
        nationGrowthRate = nationGrowthRate+ 1 + eventPopulationEffect;
        nationPopulation = (int) (nationPopulation * (nationGrowthRate)); 
        if (nationPopulation > populationLimit) {
            nationPopulation = populationLimit;
        }
        if(nationPopulation <= 0) {
            System.out.println(nationName + "'s people have been wiped out.");
            gameOn = false;
        }
        individualStrength = (weaponCount * weaponTech) + eventStrengthEffect;
        nationStrength     = (float) (nationPopulation * individualStrength);
        nationWealthInc    = (int) (roadCount * roadTech + eventWealthEffect);
        nationWealth       = nationWealth + nationWealthInc; 
        if(nationWealth < 0) {
            System.out.println("You are in debt.");
            System.out.println("You will lose if debt is not eliminated in 2 years.");
            debtCount++;
            if(debtCount == 2) {
                System.out.println("You have lost the game.");
                gameOn = false;
            }
        }
        else{
            debtCount--;
        }
        turnCount = turnCount + 1;
        NationSimulator.NationEvents.main(args);
        NationSimulator.NationTurn.TurnIntro.main(args);
    }
}
