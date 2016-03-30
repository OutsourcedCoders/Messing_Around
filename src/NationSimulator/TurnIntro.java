package NationSimulator;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
        System.out.println("Nation Wealth \t\t\tNation Population \t\tNation"
            + " Strength \t\tEvent");
        System.out.println(nationWealth + "\t\t\t\t" + nationPopulation + "\t\t\t\t" 
            + nationStrength + "\t\t\t\t" + nationEventNum);
        System.out.println(nationEvent);
    }
}
