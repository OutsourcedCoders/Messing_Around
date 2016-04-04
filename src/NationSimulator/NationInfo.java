package NationSimulator;

import MessingAround.UserInputs;

public class NationInfo extends UserInputs{
    public static void main(String[] args) {
        switch(userAction.toUpperCase()){
            case "BUILD":
                if(nationWealth > 100 || nationWealth < -100) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                    System.out.println("   Build more homes   |  Build more trade roads  |");
                    System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                    System.out.println("  Build more weapons  |           Exit           |");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
                else{
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                    System.out.println("   Build more homes   |  Build more trade roads  |");
                    System.out.print("|    " + nationWealth + "\t\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                    System.out.println("  Build more weapons  |           Exit           |");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
                break;
            case "DEFAULT":
                if(nationWealth > 100 || nationWealth < -100) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                    System.out.println("   Build   |  End Turn  |");
                    System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                    System.out.println("           |          |");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
                else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                    System.out.println("   Build   |  End Turn  |");
                    System.out.print("|    " + nationWealth + "\t\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                    System.out.println("           |            |");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
        }
    }
}
