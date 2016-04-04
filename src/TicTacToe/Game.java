package TicTacToe;

import TicTacToe.Scripts.UserInterface;

/**
 *
 * @author Benja_thomp486
 */


public class Game extends UserInterface{
    public static void main(String[] args){
        System.out.println("");
        boolean Ans1 = false;
        boolean Ans2 = false;
        while(!Ans1){
            userInput = sc.nextLine();
            System.out.println("What level of cpu do want to play?");
            switch(userInput) {
                case "1":
                    Level = 1;
                    break;
                case "2":
                    Level = 2;
                    break;
                case "3":
                    Level = 3;
                    break;
                case "9001":
                    Level = 9001;
                    break;
                default:
                    System.out.println("That's not a valid level (1-3 work)");
                    break;
            }
        }
        System.out.println("Level set to " + userInput);
        Display();
        System.out.println("Please make a move (1-9) or type 'quit' to exit");
        while(!Ans2){
            userInput = "";
            userInput = sc.nextLine();
            System.out.println();
            switch(userInput) {
                case "1":
                    LastMove = 1;
                    break;
                case "2":
                    LastMove = 2;
                    break;
                case "3":
                    LastMove = 3;
                    break;
                case "4":
                    LastMove = 4;
                    break;
                case "5":
                    LastMove = 5;
                    break;
                case "6":
                    LastMove = 6;
                    break;
                case "7":
                    LastMove = 7;
                    break;
                case "8":
                    LastMove = 8;
                    break;
                case "9":
                    LastMove = 9;
                    break;
                case "QUIT":
                    Ans2 = true;
                    break;
                default:
                    System.out.println("That's not a valid command or move");
                    break;
            }
            if(CheckForWin()){
                
            }
            CPUMove();
        }
        System.out.println("Thanks for playing!\nYou won " + PlayerWins + "\nAnd lost" + CPUWins );
    }
}