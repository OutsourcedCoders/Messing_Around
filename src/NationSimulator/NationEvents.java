package NationSimulator;

import MessingAround.UserInputs;

public class NationEvents extends UserInputs{
    public static void main(String[] args) {
        nationNumGen = (int) (Math.random() * 100); 
        if(nationEventNum == 1) {//                                              Resets previous event's effect
            nationWealthInc = nationWealthInc + (int) + eventWealthEffect;
            nationGrowthRate = nationGrowthRate + eventPopulationEffect;
            individualStrength = individualStrength / eventStrengthEffect;
        }
        else if(nationEventNum == 2) {
            nationWealthInc = nationWealthInc + (int) + eventWealthEffect;
            nationGrowthRate = nationGrowthRate + eventPopulationEffect;
        }
        else if(nationNumGen == 3) {
            individualStrength = individualStrength / eventStrengthEffect;
        }
        else if(nationNumGen == 4) {
            nationWealthInc = (int) (nationWealthInc - eventWealthEffect);
            nationGrowthRate = nationGrowthRate / eventPopulationEffect;
        }
        else if(nationNumGen == 5) {
            nationWealthInc = (int) (nationWealthInc + eventWealthEffect);
            nationGrowthRate = nationGrowthRate / eventPopulationEffect;
            individualStrength = individualStrength / eventStrengthEffect;
        }
        else if(nationNumGen == 6) {
            houseCost = (4/3)*(houseCost);
            roadCost = (4/3)*(roadCost);
            weaponCost = (4/3)*(weaponCost);
        }
        else if(nationNumGen == 7) {
            nationWealthInc = (int) (nationWealthInc + eventWealthEffect);
            nationGrowthRate = nationGrowthRate * eventPopulationEffect;
            individualStrength = individualStrength * eventStrengthEffect;
        }
        if(nationNumGen <= 49) {
            nationEvent = "Nothing happened.";
            nationEventNum = 0;
        }
        else if(nationNumGen <= 50) {
            nationEvent = "A tornado wrecked havoc.";
            nationEventNum = 1;
            eventWealthEffect = nationWealth * .5;
            nationWealthInc = nationWealthInc + (int) - eventWealthEffect;
            eventPopulationEffect = .6;
            nationGrowthRate = nationGrowthRate - eventPopulationEffect;
            eventStrengthEffect = .8;
            individualStrength = individualStrength * eventStrengthEffect;
        }
        else if(nationNumGen <= 55) {
            nationEvent = "A neighbouring country brings gifts of gold.";
            nationEventNum = 2;
            eventWealthEffect = nationWealth *.25;
            nationWealthInc = nationWealthInc + (int) eventWealthEffect;
            eventPopulationEffect = 1.2;
            nationGrowthRate = nationGrowthRate * eventPopulationEffect;
        }
        else if(nationNumGen <= 70) {
            nationEvent = "A neighbouring nation has declared war.";
            nationEventNum = 3;
            eventStrengthEffect = 1.2;
            individualStrength = individualStrength * eventStrengthEffect;
        }
        else if(nationNumGen <= 75) {
            nationEvent = "The economy is booming.";
            nationEventNum = 4;
            eventWealthEffect = nationWealth * .25;
            nationWealthInc = (int) (nationWealthInc + eventWealthEffect);
            eventPopulationEffect = 1.2;
            nationGrowthRate = nationGrowthRate * eventPopulationEffect;
        }
        else if(nationNumGen <= 85) {
            nationEvent = "A fire spreads destruction around the capital.";
            nationEventNum = 5;
            eventWealthEffect = nationWealth * .15;
            nationWealthInc = (int) (nationWealthInc - eventWealthEffect);
            eventPopulationEffect = .8;
            nationGrowthRate = nationGrowthRate * eventPopulationEffect;
            eventStrengthEffect = .8;
            individualStrength = individualStrength * eventStrengthEffect;
        }
        else if(nationNumGen <= 90) {
            nationEvent = "Technology has been advanced significantly. Building costs are reduced by 25%";
            nationEventNum = 6;
            houseCost  = (int) (houseCost * .75);
            roadCost   = (int) (roadCost * .75);
            weaponCost = (int) (weaponCost * .75);
        }
        else if(nationNumGen <= 98) {
            nationEvent = "A plague has developed.";
            nationEventNum = 7;
            eventWealthEffect = nationWealth * .3;
            nationWealthInc = (int) (nationWealthInc - eventWealthEffect);
            eventPopulationEffect = 2;
            nationGrowthRate = nationGrowthRate / eventPopulationEffect;
            eventStrengthEffect = 2;
            individualStrength = individualStrength / eventStrengthEffect;
        }
        else {
            nationEvent = "Your nation has gained more territory.";
            nationEventNum = 8;
            roadCount = (int) (roadCount * (Math.random() / 2));
            houseCount = (int) (houseCount * (Math.random() / 3));
            weaponCount = (int) (weaponCount * (Math.random() / 2.5));
            nationGrowthRate = nationGrowthRate + (Math.random() / 2);
        }
    }
}