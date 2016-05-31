package NationSimulator;

import MessingAround.UserInputs;

public class NationInfo extends UserInputs{
    public static void main(String[] args) {
        switch(userAction.toUpperCase()){
            case "ATTACKED":
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Fight   |  Surrender  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("   Bribe   |             |");
                System.out.println("-------------------------------------------------------------------------------------------");
                break;
            case "BUILD":
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build more homes   |  Build more trade roads  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("  Build more weapons  |           Exit           |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
            case "DEFAULT":
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build   |  End Turn  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("           |            |");
                System.out.println("------------------------------------------------------------------------------------------");
                break;
            case "WAR":
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build    |    End Turn   |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("   Attack   |  Bribe Enemy  |");
                System.out.println("----------------------------------------------------------------------------------------------");
            default:
                break;
        }
    }
}
