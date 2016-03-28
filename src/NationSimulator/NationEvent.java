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
        else if(nationNumGen <= 50) {
            nationEvent = "A tornado wrecked havoc";
            nationEventNum = 1;
            nationWealthInc = nationWealthInc + (int) -(nationWealth * .5);
            nationGrowthRate = nationGrowthRate -.6;
            individualStrength = .08;
        }
        else if(nationNumGen <= 55) {
            nationEvent = "A neighbouring country brings gifts of gold";
            nationEventNum = 2;
            nationWealthInc = nationWealthInc + (int) (nationWealth *.25);
            nationGrowthRate = nationGrowthRate + .2;
        }
        else if(nationNumGen <= 70) {
            nationEvent = "A neighbouring nation has declared war";
            nationEventNum = 3;
            individualStrength = .12;
        }
        else if(nationNumGen <= 75) {
            nationEvent = "The economy is booming";
            nationEventNum = 4;
            nationWealthInc = (int) (nationWealthInc + (nationWealth * .25));
            nationGrowthRate = nationGrowthRate + .2;
        }
        
    }
}
