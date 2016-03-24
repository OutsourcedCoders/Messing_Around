package MessingAround;

import java.util.Random;

public class RockPaperScissors extends UserInputs{
    static int bestOf       = 0;
    static int userWins     = 0;
    static int computerWins = 0;
    static String userChoice     = "Default";
    static String computerChoice = "Default";
    static Random rpcNumGen = new Random();
        
    public static void main(String args[]) {
            System.out.print("Welcome to Rock, Paper, Scissors");
        while(!userAnswered) {//                                                 User inputs best of games
            System.out.print("Best of how many: ");
            bestOf = sc.nextInt();
            if (bestOf == 0) {
                System.out.println("Please input a valid numeric response");
            }
            else {
                userAnswered = true;
            }
        }userAnswered = false;
        while(userWins <= (bestOf / 2) || computerWins <= (bestOf / 2)) {
                System.out.print("Please input your choice :");
                userChoice = sc.nextLine();
            while(!userAnswered) {
                switch (userChoice.toUpperCase()) {
                    case "ROCK":
                        userAnswered = true;
                        break;
                    case "PAPER":
                        userAnswered = true;
                        break;
                    case "SCISSORS":
                        userAnswered = true;
                        break;
                    default:
                        System.out.print("Please input a valid answer :");
                        userChoice = sc.nextLine();
                        break;
                }
            }
            switch (rpcNumGen.nextInt(3)) {
                case 1:
                    computerChoice = "ROCK";
                    break;
                case 2:
                    computerChoice = "PAPER";
                    break;
                case 3:
                    computerChoice = "SCISSORS";
                    break;
                default:
                    System.out.println("GREAT JOB YOU BROKE IT!");
                    break;
            }
            if(userChoice == computerChoice) {
                System.out.println("You tied...");
            }
        }
        
    }
}
