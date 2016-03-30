package NationSimulator.NationTurn;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------"
                + "------------------------------------------------------");
        System.out.println("|Nation Wealth \t\t\t|Nation Population \t\t|Nation"
            + " Strength \t\t|Event\t|");
        System.out.println("|" + nationWealth + "\t\t\t\t|" + nationPopulation +
            "\t\t\t\t|" + nationStrength + "\t\t\t\t|" + nationEventNum + "\t|");
        System.out.println("---------------------------------------------------"
                + "------------------------------------------------------");
        System.out.println(nationEvent);
    }
}
