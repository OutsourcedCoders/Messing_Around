package TicTacToe;

import TicTacToe.Scripts.UserInterface;

/**
 *
 * @author Benja_thomp486
 */


public class Game extends UserInterface{
    public static void main(String[] args){
        while(!userFinished){
            System.out.println("");
            Ans2 = false;
            while(!Ans1){
                System.out.println("What level of cpu do want to play?");
                userInput = sc.nextLine();
                switch(userInput) {
                    case "1":
                        Level = 1;
                        Ans1 = true;
                        break;
                    case "2":
                        Level = 2;
                        Ans1 = true;
                        break;
                    case "3":
                        Level = 3;
                        Ans1 = true;
                        break;
                    case "9001":
                        Level = 9001;
                        Ans1 = true;
                        break;
                    default:
                        System.out.println("That's not a valid level (1-3 work)");
                        break;
                }
                System.out.println("Level set to " + userInput);
            }
            Display();
            System.out.println("Please make a move (1-9) or type 'quit' to exit");
            while(!Ans2){
                userInput = "";
                userInput = sc.nextLine();
                System.out.println();
                switch(userInput) {
                    case "1":
                        LastMove = 1;
                        Ans2 = true;
                        break;
                    case "2":
                        LastMove = 2;
                        Ans2 = true;
                        break;
                    case "3":
                        LastMove = 3;
                        Ans2 = true;
                        break;
                    case "4":
                        LastMove = 4;
                        Ans2 = true;
                        break;
                    case "5":
                        LastMove = 5;
                        Ans2 = true;
                        break;
                    case "6":
                        LastMove = 6;
                        Ans2 = true;
                        break;
                    case "7":
                        LastMove = 7;
                        Ans2 = true;
                        break;
                    case "8":
                        LastMove = 8;
                        Ans2 = true;
                        break;
                    case "9":
                        LastMove = 9;
                        Ans2 = true;
                        break;
                    case "QUIT":
                        Ans2 = true;
                        break;
                    default:
                        System.out.println("That's not a valid command or move");
                        break;
                }
                CPUMove();
                Display();
                if(CheckForWin()){
                
                }
            }
            if (userFinished){
                System.out.println("Thanks for playing!\nYou won  " + PlayerWins + "." + "\nAnd lost " + CPUWins + ".");
            }
        }
    }
}