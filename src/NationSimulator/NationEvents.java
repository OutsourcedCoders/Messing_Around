package NationSimulator;

import MessingAround.UserInputs;

public class NationEvents extends UserInputs{
    public static void main(String[] args) {
        nationNumGen = (int) (Math.random() * 100); 
        if(warOn) {
            userAction = "war";
        }
        else if(nationNumGen <= 39) {
            nationEvent = "Nothing happened.";
            eventWealthEffect = 0;
            eventPopulationEffect = 0;
            eventStrengthEffect = 0;
            nationEventNum = 0;
        }
        else if(nationNumGen <= 40) {
            nationEvent = "A tornado wrecked havoc.";
            nationEventNum = 1;
            eventWealthEffect = -(nationWealth * .5);
            eventPopulationEffect = -.4;
            eventStrengthEffect = -.02;
        }
        else if(nationNumGen <= 45) {
            nationEvent = "A neighbouring country brings gifts of gold.";
            nationEventNum = 2;
            eventWealthEffect = nationWealth *.25;
            eventPopulationEffect = .2;
            eventStrengthEffect = 0;
        }
        else if(nationNumGen <= 60) {
            nationEvent = "A neighbouring nation has declared war.";
            nationEventNum = 3;
            eventStrengthEffect = .1;
            eventPopulationEffect = 0;
            eventWealthEffect = 0;
            warOn = true;
            userAction = "war";
            NationSimulator.EnemyNation.main(args);
        }
        else if(nationNumGen <= 65) {
            nationEvent = "The economy is booming.";
            nationEventNum = 4;
            eventWealthEffect = nationWealth * .25;
            eventPopulationEffect = .2;
            eventStrengthEffect = 0;
        }
        else if(nationNumGen <= 85) {
            nationEvent = "A fire spreads destruction around the capital.";
            nationEventNum = 5;
            eventWealthEffect = -(nationWealth * .15);
            eventPopulationEffect = -.4;
            eventStrengthEffect = -.02;
        }
        else if(nationNumGen <= 90) {
            nationEvent = "Technology has been advanced significantly. Building costs are reduced by 25%";
            nationEventNum = 6;
            houseCost  = (int) (houseCost * .75);
            roadCost   = (int) (roadCost * .75);
            weaponCost = (int) (weaponCost * .75);
            eventPopulationEffect = 0;
            eventStrengthEffect = 0;
            eventWealthEffect = 0;
        }
        else if(nationNumGen <= 98) {
            nationEvent = "A plague has developed.";
            nationEventNum = 7;
            eventWealthEffect = -(nationWealth * .3);
            eventPopulationEffect = -.5;
            eventStrengthEffect = -.05;
        }
        else {
            nationEvent = "Your nation has gained more territory.";
            nationEventNum = 8;
            roadCount = (int) (roadCount * (Math.random() / 2));
            houseCount = (int) (houseCount * (Math.random() / 3));
            weaponCount = (int) (weaponCount * (Math.random() / 2.5));
            eventPopulationEffect = ((Math.random() + 3) / 8);
            eventStrengthEffect = 0;
            eventWealthEffect = 0;
        }
    }
}