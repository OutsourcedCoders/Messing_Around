package NationSimulator.NationTurn;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------"
                + "----------------------------------");
        System.out.println("|    Nation Wealth    |  Nation Population  |  Nation"
            + " Strength  |  Event  |  Build  |");
        System.out.println("|    " + nationWealth + "\t      |  " + nationPopulation +
            "\t\t    |  " + nationStrength + "\t\t|  " + nationEventNum + "      |");
        System.out.println("---------------------------------------------------"
                + "----------------------------------");
        System.out.println(nationEvent);
        NationSimulator.NationTurn.TurnMain.main(args);
    }
}
