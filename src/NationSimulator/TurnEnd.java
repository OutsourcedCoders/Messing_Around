package NationSimulator;

import MessingAround.UserInputs;

public class TurnEnd extends UserInputs{
    public static void main(String args[]) {
        nationPopulation = (int) (nationPopulation * (nationGrowthRate)); 
        nationStrength   = nationPopulation * individualStrength; 
        nationWealth     = nationWealth + nationWealthIncrease; 
    }
}
