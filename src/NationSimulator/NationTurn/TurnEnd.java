package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnEnd extends UserInputs{
    public static void main(String args[]) {
        NationSimulator.NationEvents.main(args);
        populationLimit = houseTech * houseCount;
        nationPopulation = (int) (nationPopulation * (nationGrowthRate)); 
        if (nationPopulation > populationLimit) {
            nationPopulation = populationLimit;
        }
        nationStrength   = nationPopulation * individualStrength; 
        nationWealthInc  = roadCount * roadTech; 
        nationWealth     = nationWealth + nationWealthInc; 
        turnCount        = turnCount + 1;
    }
}
