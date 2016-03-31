package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationBuild extends UserInputs{
    public static void main(String[] args) {
        while(turnSubActive) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|  Build more homes  |  Build more travel roads  |  Build more weapons  |");
            System.out.println("-------------------------------------------------------------------------");
            userInput = sc.nextLine();
            userAnswered = false;
            while(!userAnswered) {
                switch(userInput.toUpperCase()) {
                    case "BUILD MORE HOMES": 
                        System.out.println("Each house increases population limit by " + houseTech 
                                + " at a cost of " + houseCost + " gold");
                        System.out.print("Input number of homes to be built:");
                        houseBuild = sc.nextInt();
                        if(houseBuild * houseCost <= nationWealth) {
                            houseCount = houseCount + houseBuild; 
                            userAnswered = true;
                        }
                        else{
                            System.out.println("Insufficient Gold");
                        }
                }
            }
        }
    }
}
