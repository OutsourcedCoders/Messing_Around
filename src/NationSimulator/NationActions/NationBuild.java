package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationBuild extends UserInputs{
    public static void main(String[] args) {
        while(turnSubActive) {            
            userAnswered = false;
            userAction = "build";
            NationSimulator.NationInfo.main(args);
            while(!userAnswered) {
                userSubAction = sc.nextLine();
                switch(userSubAction.toUpperCase()) {
                    case "BUILD MORE HOMES": 
                        System.out.println("Each house increases population limit by " + houseTech 
                                + " at a cost of " + houseCost + " gold");
                        System.out.print("Input number of homes to be built: ");
                        houseBuild = sc.nextInt();
                        if(houseBuild * houseCost <= nationWealth + 1000) {
                            if(houseBuild * houseCost >= nationWealth){
                                System.out.println("You will be in debt if you build this. Are you sure?");
                                System.out.println("----------------");
                                System.out.println("|  YES  |  NO  |");
                                System.out.println("----------------");
                                userInput = sc.nextLine();
                                userInput = sc.nextLine();
                                switch(userInput.toUpperCase()){
                                    case "YES":  
                                        houseCount = houseCount + houseBuild;
                                        nationWealth = nationWealth - houseBuild * houseCost;
                                        System.out.println("Houses are slated to be built");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                        System.out.println("   Build more homes   |  Build more trade roads  |");
                                        System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                        System.out.println("  Build more weapons  |           Exit           |");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        break;
                                    case "NO":
                                        System.out.println("Build has been cancelled");
                                        break;
                                    default:
                                        System.out.println("Something broke \\0/");
                                        break;
                                }
                            }
                            else{
                                houseCount = houseCount + houseBuild;
                                nationWealth = nationWealth - houseBuild * houseCost;
                                System.out.println("Houses are slated to be built");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                System.out.println("   Build more homes   |  Build more trade roads  |");
                                System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                System.out.println("  Build more weapons  |           Exit           |");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else{
                            System.out.println("Insufficient Gold");
                        }
                        break;
                    case "BUILD MORE TRADE ROADS":
                        System.out.println("Each road increases national wealth gain by " + roadTech + " per turn at a cost of " + roadCost + " gold");
                        System.out.print("Input number of roads to be built: ");
                        roadBuild = sc.nextInt();
                        if(roadBuild * roadCost <= nationWealth + 1000) {
                            if(roadBuild * roadCost >= nationWealth){
                                System.out.println("You will be in debt if you build this");
                                System.out.println("----------------");
                                System.out.println("|  YES  |  NO  |");
                                System.out.println("----------------");
                                userInput = sc.nextLine();
                                userInput = sc.nextLine();
                                switch(userInput.toUpperCase()){
                                    case "YES":
                                        roadCount = roadCount + roadBuild;
                                        nationWealth = nationWealth - roadBuild * roadCost;
                                        System.out.println("Roads are slated to be built");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                        System.out.println("   Build more homes   |  Build more trade roads  |");
                                        System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                        System.out.println("  Build more weapons  |           Exit           |");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        break;
                                    case "NO":
                                        System.out.println("Build has been cancelled");
                                        break;
                                    default:
                                        System.out.println("Something broke \\0/");
                                        break;
                                }
                            }
                            else{
                                roadCount = roadCount + roadBuild;
                                nationWealth = nationWealth - roadBuild * roadCost;
                                System.out.println("Roads are slated to be built");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                System.out.println("   Build more homes   |  Build more trade roads  |");
                                System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                System.out.println("  Build more weapons  |           Exit           |");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else {
                            System.out.println("Insufficient Gold");
                        }
                        break;
                    case "BUILD MORE WEAPONS":
                        System.out.println("Each weapon increases individual strength by " + weaponTech + " and costs " + weaponCost  + " gold.");
                        System.out.print("Input number of weapons to be built: ");
                        weaponBuild = sc.nextInt();
                        if(weaponBuild * weaponCost <= nationWealth + 1000) {
                            if(weaponBuild * weaponCost >= nationWealth){
                                System.out.println("You will be in debt if you build this");
                                System.out.println("----------------");
                                System.out.println("|  YES  |  NO  |");
                                System.out.println("----------------");
                                userInput = sc.nextLine();
                                userInput = sc.nextLine();
                                switch(userInput.toUpperCase()){
                                    case "YES":
                                        weaponCount = weaponCount + weaponBuild;
                                        nationWealth = nationWealth - weaponBuild * weaponCost;
                                        individualStrength = weaponCount * weaponTech;
                                        nationStrength     = (float) (nationPopulation * individualStrength);                             
                                        System.out.println("Weapons are slated to be built");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                        System.out.println("   Build more homes   |  Build more trade roads  |");
                                        System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                        System.out.println("  Build more weapons  |           Exit           |");
                                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                        break;
                                    case "NO":
                                        System.out.println("Build has been cancelled");
                                        break;
                                    default:
                                        System.out.println("Something broke \\0/");
                                        break;
                                }
                            }
                            else{
                                weaponCount = weaponCount + weaponBuild;
                                nationWealth = nationWealth - weaponBuild * weaponCost;
                                individualStrength = weaponCount * weaponTech;
                                nationStrength     = (float) (nationPopulation * individualStrength); 
                                System.out.println("Weapons are slated to be built");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                                System.out.println("   Build more homes   |  Build more trade roads  |");
                                System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                                System.out.println("  Build more weapons  |           Exit           |");
                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else {
                            System.out.println("Insufficient Gold");
                        }
                        break;
                    case "HELP":
                        System.out.println(nationName);
                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        System.out.print("|    Nation Wealth    |  Nation Population  |  Nation Strength  |");
                        System.out.println("   Build more homes   |  Build more trade roads  |");
                        System.out.print("|    " + nationWealth + "\t      |  " + nationPopulation + "\t\t    |  " + nationStrength + "\t\t|");
                        System.out.println("  Build more weapons  |           Exit           |");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        break;
                    case "EXIT":
                        userAnswered = true;
                        turnSubActive = false;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}