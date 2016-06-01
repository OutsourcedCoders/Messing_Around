package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnMain extends UserInputs{
    public static void main(String[] args) {
        turnActive = true;
        if(nationEventNum != 3) {//                                              Non-war Scenario         
            NationSimulator.NationInfo.main(args);
            while(turnActive) {
                System.out.println("What would you do?");
                userAction = sc.nextLine();
                switch(userAction.toUpperCase()) {
                    case "BUILD":
                        NationSimulator.NationActions.NationBuild.main(args);
                        NationSimulator.NationInfo.main(args);
                        break;
                    case "END TURN":
                        turnActive = false;
                    default:
                        break;
                }
            }
        }
        else {
            userAction = "War";
            NationSimulator.NationInfo.main(args);//                    War Scenario
            System.out.println("What would you do?");
            userAction = sc.nextLine();
            switch(userAction.toUpperCase()) {
                case "ATTACK":
                    NationSimulator.NationActions.NationWarFight.main(args);
                    break;
                case "BRIBE ENEMY":
                    NationSimulator.NationActions.NationWarBribe.main(args);
                    break;
                case "BUILD":
                    NationSimulator.NationActions.NationBuild.main(args);
                    NationSimulator.NationInfo.main(args);
                    break;
                case "END TURN":
                    NationSimulator.NationActions.EnemyAttack.main(args);
                    break;
            }
        }
        NationSimulator.NationTurn.TurnEnd.main(args);
    }
}
