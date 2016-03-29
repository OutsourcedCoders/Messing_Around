package NationSimulator;

import MessingAround.UserInputs;

public class NationEvents extends UserInputs{
    public static void main(String[] args) {
        dumbRandomizer = 99;
        nationNumGen = NumGen.nextInt(dumbRandomizer); 
        if(nationNumGen <= 49) {
            nationEvent = "Nothing happened.";
            nationEventNum = 0;
        }
        else if(nationNumGen <= 50) {
            nationEvent = "A tornado wrecked havoc.";
            nationEventNum = 1;
            nationWealthInc = nationWealthInc + (int) -(nationWealth * .5);
            nationGrowthRate = nationGrowthRate -.6;
            individualStrength = .08;
        }
        else if(nationNumGen <= 55) {
            nationEvent = "A neighbouring country brings gifts of gold.";
            nationEventNum = 2;
            nationWealthInc = nationWealthInc + (int) (nationWealth *.25);
            nationGrowthRate = nationGrowthRate + .2;
        }
        else if(nationNumGen <= 70) {
            nationEvent = "A neighbouring nation has declared war.";
            nationEventNum = 3;
            individualStrength = .12;
        }
        else if(nationNumGen <= 75) {
            nationEvent = "The economy is booming.";
            nationEventNum = 4;
            nationWealthInc = (int) (nationWealthInc + (nationWealth * .25));
            nationGrowthRate = nationGrowthRate + .2;
        }
        else if(nationNumGen <= 85) {
            nationEvent = "A fire spreads destruction around the capital.";
            nationEventNum = 5;
            nationWealthInc = (int) (nationWealthInc - nationWealth * .15);
            nationGrowthRate = nationGrowthRate -.2;
            individualStrength = individualStrength -.02;
        }
        else if(nationNumGen <= 90) {
            nationEvent = "Technology has been advanced significantly.";
            nationEventNum = 6;
        }
        else if(nationNumGen <= 98) {
            nationEvent = "A plague has developed.";
            nationEventNum = 7;
            nationWealthInc = (int) (nationWealthInc - nationWealth * .3);
            nationGrowthRate = nationGrowthRate -.5;
            individualStrength = individualStrength - .05;
        }
        else if(nationNumGen <= 99) {
            nationEvent = "Your nation has gained more territory.";
            nationEventNum = 8;
            nationWealthInc = (int) (nationWealthInc * 1.5);
            nationGrowthRate = nationGrowthRate + .4;
            individualStrength = individualStrength + .04;
        }
    }
}
