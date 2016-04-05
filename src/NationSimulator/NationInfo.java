package NationSimulator;

import MessingAround.UserInputs;

public class NationInfo extends UserInputs{
    public static void main(String[] args) {
        switch(userAction.toUpperCase()){
            case "BUILD":
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build more homes   |  Build more trade roads  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("  Build more weapons  |           Exit           |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
            case "DEFAULT":
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build   |  End Turn  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("           |            |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
            case "WAR":
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                System.out.println("   Build   |  End Turn  |");
                System.out.print("|    " + wealthFormat.format(nationWealth) + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                System.out.println("           |            |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            default:
                System.out.println("I don't know how, but you broke it");
                break;
        }
    }
}
