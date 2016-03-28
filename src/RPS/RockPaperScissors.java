package RPS;

import MessingAround.UserInputs;
//                                                                               Written by YourAverageRandy
public class RockPaperScissors extends UserInputs{        
    public static void main(String args[]) {
        userAnswered = false;
        gameOn = true;
        System.out.println("Welcome to Rock, Paper, Scissors");
        while(gameOn) {
            while(!userAnswered) {//                                             User inputs best of games
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
            userWins = 0; computerWins = 0;
            while(userWins <= (bestOf / 2) && computerWins <= (bestOf / 2)) {//  Keeps the game running
                    System.out.print("Please input your choice: ");
                    userChoice = sc.nextLine();
                while(!userAnswered) {//                                         User Choice
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
                switch (rpcNumGen.nextInt(dumbRandomizer)) {//                   Computer Choice
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
                System.out.print("Computer chose ");
                System.out.println(computerChoice.toLowerCase());
                switch (userChoice.toUpperCase()) {//                            Round decisions
                    case "ROCK":
                        switch(computerChoice) { 
                            case "SCISSORS":
                                System.out.println("You won this round");
                                userWins ++;
                                break;
                            case "PAPER": 
                                System.out.println("You lost this round");
                                computerWins ++;
                                break;
                            default:
                                System.out.println("You tied...");
                                break;
                            }
                        break;
                    case "PAPER":
                        switch (computerChoice) {
                            case "ROCK":
                                System.out.println("You won this round");
                                userWins ++;
                                break;
                            case "SCISSORS": 
                                System.out.println("You lost this round");
                                computerWins ++;
                                break;
                            default:
                                System.out.println("You tied...");
                                break;
                        }
                        break;
                    case "SCISSORS":
                        switch(computerChoice) {
                            case "PAPER": 
                                System.out.println("You won this round");
                                userWins ++;
                                break;
                            case "ROCK": 
                                System.out.println("You lost this round");
                                computerWins ++;
                                break;
                            default: 
                                System.out.println("You tied...");
                                break;
                        }
                    default:
                        System.out.println("GODDAMNIT YOU BROKE IT AGAIN");
                        break;
                }
            }
            System.out.print("And the winner is ");//                            Winner
            if(userWins > computerWins) {
                System.out.println("you!");
            }
            else{
                System.out.println("the computer!");
            }
            System.out.print("You won " + userWins + " times and lost ");//      Stats
            System.out.println(computerWins + " times");
            System.out.print("The computer won " + computerWins + " games and ");
            System.out.println("lost " + userWins + " times");
        
            userAnswered = false;
            while(!userAnswered) {
                System.out.print("Continue? :");
                userInput = sc.nextLine();
                switch (userInput.toUpperCase()) {//                             Continue?
                    case "YES":
                        RockPaperScissors.main(args);
                        userAnswered = true;
                    break;
                    case "NO":
                        System.out.print("Back to main menu? ");
                        gameOn = false;
                        userInput = sc.nextLine();
                        switch (userInput.toUpperCase()) {
                            case "YES":
                                MessingAround.MessingAroundMain.main(args);
                                userAnswered = true;
                                break;
                            case "NO":
                                System.out.println("See you later");
                                userAnswered = true;
                                break;
                            default:
                                userInput = "NO";
                                break;
                        }
                default:
                    System.out.println("See you later");
                    userAnswered = true;
                    gameOn = false;
                    break;
                }
            }
        }
    }
}