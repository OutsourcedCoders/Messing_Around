package NationSimulator.NationTurn;

import MessingAround.UserInputs;


public class TurnIntro extends UserInputs{
    public static void main(String[] args) {
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
        System.out.println("  Turn " + turnCount + "  |");
        userAction = "Default";
        System.out.println(nationEvent);
        if(gameOn) {
            NationSimulator.NationTurn.TurnMain.main(args);
        }
        else{}
    }
}
