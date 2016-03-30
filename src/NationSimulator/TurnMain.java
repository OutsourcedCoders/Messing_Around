package NationSimulator;

import MessingAround.UserInputs;

public class TurnMain extends UserInputs{
    public static void main(String[] args) {
        if(nationEventNum != 3) {//                                              Non-war Scenario         
            System.out.println("What would you do?");
            while(!userAnswered) {
                
            }
        }else {
            System.out.println(nationName + " is at war.");//                    War Scenario
        }
    }
}
