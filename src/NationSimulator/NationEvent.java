package NationSimulator;

import MessingAround.UserInputs;

public class NationEvent extends UserInputs{
    public static void main(String[] args) {
        dumbRandomizer = 99;
        nationNumGen = NumGen.nextInt(dumbRandomizer); 
        if(nationNumGen <= 49) {
            nationEvent = "Nothing happened.";
            nationEventNum = 0;
        }
        else if(nationNumGen <= 54) {
            nationEvent = "A tornado wrecked havoc";
            nationEventNum = 1;
            nationWealthIncrease = (int) -(nationWealth * .3);
            nationGrowthRate = .7;
            individualStrength = .08;
        }
        
    }
}
