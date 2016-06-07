package NationSimulator.NationTurn;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
        if(gameOn) {
            if(!warOn){
                if(turnCount < 10) {
                    System.out.print("-------------");
                }
                else if(turnCount < 100) {
                    System.out.print("--------------");
                }
                else{
                    System.out.print("---------------");
                }
                    for(int i = -1; i <= nationName.length() + nationEvent.length(); i++){
                        System.out.print("-");
                    }
            }
            else{
                if(turnCount < 10) {
                    System.out.print("---------------------------");
                }
                else if(turnCount < 100) {
                    System.out.print("----------------------------");
                }
                else{
                    System.out.print("-----------------------------");
                }
                for(int i = -1; i <= nationName.length() + nationName.length(); i++){
                    System.out.print("-");
                }
            }
            System.out.print("\n|" + nationName + "|");
            System.out.print("  Turn " + turnCount + "  | ");
            userAction = "Default";
            if(!warOn){
                System.out.println(nationEvent + "|");
            }
            else{
                System.out.println(nationName + " is at war. |");
            }
            NationSimulator.NationTurn.TurnMain.main(args);
        }
    }
}
