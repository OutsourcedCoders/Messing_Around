package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnMain extends UserInputs{
    public static void main(String[] args) {
        turnActive = true;
        if(nationEventNum != 3) {//                                              Non-war Scenario         
            while(turnActive) {
                System.out.println("What would you do?");
                userInput = sc.nextLine();
                switch(userInput.toUpperCase()) {
                    case "BUILD":
                        NationSimulator.NationActions.NationBuild.main(args);
                        break;
                    case "END TURN":
                        turnActive = false;
                    default:
                        break;
                }
            }
        }else {
            System.out.println(nationName + " is at war.");//                    War Scenario
        }
        NationSimulator.NationTurn.TurnEnd.main(args);
    }
}
