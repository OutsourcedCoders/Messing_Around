package NationSimulator.NationTurn;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
        if(gameOn) {
            if(turnCount < 10) {
                System.out.print("-----------");
            }
            else if(turnCount < 100) {
                System.out.print("------------");
            }
            else{
                System.out.print("-------------");
            }
            for(int i = -1; i <= nationName.length(); i++){
                System.out.print("-");
            }
            System.out.print("\n|" + nationName + "|");
            System.out.print("  Turn " + turnCount + "  | ");
            userAction = "Default";
            if(nationEventNum != 3){
                System.out.println(nationEvent);
            }
            else{
                System.out.println(nationName + " is at war");
            }
            NationSimulator.NationTurn.TurnMain.main(args);
        }
    }
}
