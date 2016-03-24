package RockPaperScissors;

import MessingAround.UserInputs;
import java.util.Random;

public class RockPaperScissors extends UserInputs{
    static int bestOf         = 0;
    static int userWins       = 0;
    static int computerWins   = 0;
    static int dumbRandomizer = 3;
    static String userChoice     = "Default";
    static String computerChoice = "Default";
    static Random rpcNumGen = new Random();
    static boolean gameOn = true;
        
    public static void main(String args[]) {
            System.out.println("Welcome to Rock, Paper, Scissors");
        while(gameOn) {
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
            userChoice = sc.nextLine();
            while(userWins <= (bestOf / 2) && computerWins <= (bestOf / 2)) {//      Keeps the game running
                    System.out.print("Please input your choice: ");
                    userChoice = sc.nextLine();
                while(!userAnswered) {//                                             User Choice
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
                switch (rpcNumGen.nextInt(dumbRandomizer)) {//                       Computer Choice
                    case 0:
                        computerChoice = "ROCK";
                        break;
                    case 1:
                        computerChoice = "PAPER";
                        break;
                    case 2:
                        computerChoice = "SCISSORS";
                        break;
                    default:
                        System.out.println("GREAT JOB YOU BROKE IT!");
                        break;
                }
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerChoice.toLowerCase());
                if(userChoice.toUpperCase() == computerChoice) {
                    System.out.println("You tied...");
                }
                else{
                switch (userChoice.toUpperCase()) {//                                Round decisions
                    case "ROCK":
                        if(computerChoice == "SCISSORS") {
                            System.out.println("You won this round");
                            userWins ++;
                        }
                        else{
                            System.out.println("You lost this round");
                            computerWins ++;
                        }break;
                    case "PAPER":
                        if(computerChoice == "ROCK") {
                            System.out.println("You won this round");
                            userWins ++;
                        }
                        else{
                            System.out.println("You lost this round");
                            computerWins ++;
                        }
                        break;
                    case "SCISSORS":
                        if(computerChoice == "PAPER") {
                            System.out.println("You won this round");
                            userWins ++;
                        }
                        else{
                            System.out.println("You lost this round");
                            computerWins ++;
                        }break;
                    default:
                        System.out.println("GODDAMNIT YOU BROKE IT AGAIN");
                        break;
                    }
                }
            }
            System.out.print("And the winner is ");//                                Winner
            if(userWins > computerWins) {
                System.out.println("you!");
            }
            else{
                System.out.println("the computer!");
            }
            System.out.print("You won " + userWins + " times and lost ");//          Stats
            System.out.println(computerWins + " times");
            System.out.print("The computer won " + computerWins + " games and ");
            System.out.println("lost " + userWins + " times");
        
            userAnswered = false;
            while(!userAnswered) {
                System.out.print("Continue? ");
                userInput = sc.nextLine();
                switch (userInput.toUpperCase()) {//                                     Continue?
                    case "YES":
                        userAnswered = true;
                    break;
                    case "NO":
                        System.out.println("Back to main menu?");
                        gameOn = false;
                        userInput = sc.nextLine();
                        switch (userInput.toUpperCase()) {
                            case "YES":
                                break;
                            case "NO":
                                System.out.println("See you later");
                                break;
                            default:
                                userInput = "NO";
                                break;
                        }
                default:
                    System.out.println("See you later");
                    userAnswered = true;
                    break;
                }
            }
        }
    }
}
