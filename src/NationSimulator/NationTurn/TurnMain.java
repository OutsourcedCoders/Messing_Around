package NationSimulator.NationTurn;

import MessingAround.UserInputs;

public class TurnMain extends UserInputs{
    public static void main(String[] args) {
        turnActive = true;
        if(enemySoldiers <= 0) {
            warOn = false;
        }
        if(!warOn) {//                                                           Non-war Scenario         
            while(turnActive) {   
                NationSimulator.NationInfo.main(args);
                System.out.println("What would you do?");
                userAction = sc.nextLine();
                switch(userAction.toUpperCase()) {
                    case "BUILD":
                        NationSimulator.NationActions.NationBuild.main(args);
                        break;
                    case "END TURN":
                        turnActive = false;
                    default:
                        break;
                }
            }
        }
        else {//                                                                 War Scenario
            userAction = "War";
            NationSimulator.NationInfo.main(args);
            while(turnActive) { 
                System.out.println("What would you do?");
                userAction = sc.nextLine();
                switch (userAction.toUpperCase()) {
                    case "ATTACK":
                        enemyAttackSoldiers = (int) (enemySoldiers / Math.random() * Math.random() + 5);
                        NationSimulator.NationActions.NationWarFight.main(args);
                        turnActive = false;
                        break;
                    case "BRIBE ENEMY":
                        NationSimulator.NationActions.NationWarBribe.main(args);
                        turnActive = false;
                        break;
                    case "BUILD":
                        NationSimulator.NationActions.NationBuild.main(args);
                        NationSimulator.NationInfo.main(args);
                        break;
                    case "END TURN":
                        NationSimulator.NationActions.EnemyAttack.main(args);
                        turnActive = false;
                        break;
                    default:
                        break;
                }
            }
        }
        NationSimulator.NationTurn.TurnEnd.main(args);
    }
}
