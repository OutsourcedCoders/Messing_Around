package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationBuild extends UserInputs{
    public static void main(String[] args) {
        while(turnSubActive) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("|  Build more homes  |  Build more trade roads  |  Build more weapons  |  Exit  |");
            System.out.println("---------------------------------------------------------------------------------");
            userInput = sc.nextLine();
            userAnswered = false;
            while(!userAnswered) {
                switch(userInput.toUpperCase()) {
                    case "BUILD MORE HOMES": 
                        System.out.println("Each house increases population limit by " + houseTech 
                                + " at a cost of " + houseCost + " gold");
                        System.out.print("Input number of homes to be built: ");
                        houseBuild = sc.nextInt();
                        if(houseBuild * houseCost <= nationWealth) {
                            houseCount = houseCount + houseBuild;
                            nationWealth = nationWealth - houseBuild * houseCost;
                            userAnswered = true;
                        }
                        else{
                            System.out.println("Insufficient Gold");
                        }
                        break;
                    case "BUILD MORE TRADE ROADS":
                        System.out.println("Each road increases national wealth gain by " + roadTech
                                + " per turn at a cost of " + roadCost + " gold");
                        System.out.print("Input number of roads to be built: ");
                        roadBuild = sc.nextInt();
                        if(roadBuild * roadCost <= nationWealth) {
                            roadCount = roadCount + roadBuild;
                            nationWealth = nationWealth - roadBuild * roadCost;
                        }
                }
            }
        }
    }
}
