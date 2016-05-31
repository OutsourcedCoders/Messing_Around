package NationSimulator.NationActions;

import MessingAround.UserInputs;

public class NationWarBribe extends UserInputs{
    public static void main(String[] args) {
        System.out.print("Input bribe amount :");
        bribeAttempt = sc.nextInt();
        if(bribeAttempt >= enemyBribe) {
            System.out.println("You have successfully bribed the invading nation, the war is called off.");
            warOn = false;
        }
        else{
            System.out.println("The enemy nation was not swayed by the bribe; the war continues.");
            NationSimulator.NationActions.NationWarFight.main(args);
        }
            eventWealthEffect = -bribeAttempt;
    }
}
