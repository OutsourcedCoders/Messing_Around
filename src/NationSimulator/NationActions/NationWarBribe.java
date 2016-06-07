package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationWarBribe extends UserInputs {
    public static void main(String[] args) {
        while (turnSubActive) {
            System.out.print("Input bribe amount :");
            bribeAttempt = sc.nextInt();
            if (bribeAttempt > nationWealth + 1000) {
                System.out.println("Insufficient Gold");
            } else if (bribeAttempt >= enemyBribe) {
                System.out.println("You have successfully bribed the invading nation, the war is called off.");
                warOn = false;
                turnSubActive = false;
            } else {
                System.out.println("The enemy nation was not swayed by the bribe; the war continues.");
                NationSimulator.NationActions.EnemyAttack.main(args);
            }
        }
        nationWealth -= bribeAttempt;
    }
}
