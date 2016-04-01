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
        else if(nationPopulation == 0) {
            gameOn = false;
        }
        individualStrength = weaponCount * weaponTech;
        nationStrength     = nationPopulation * individualStrength; 
        nationWealthInc    = roadCount * roadTech;
        nationWealth       = nationWealth + nationWealthInc; 
        if(nationWealth <= 0) {
            System.out.println("You are in debt.");
            System.out.println("You will lose if debt is not eliminated in 2 years.");
            debtCount++;
            if(debtCount >= 2) {
                gameOn = false;
            }
        }
        else{
            debtCount--;
        }
        turnCount          = turnCount + 1;
        if(gameOn) {
            NationSimulator.NationTurn.TurnIntro.main(args);
        }
        else{
        }
    }
}
