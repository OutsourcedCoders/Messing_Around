package RPS;

import MessingAround.UserInputs;

public class RPSUI extends UserInputs{
    public static void main(String[] args) {
        System.out.println("\t\t-----------------------------------------");
        System.out.println("\t\t|    Rock    |    Paper    |  Scissors  |");
        System.out.print("User: \t\t");
        switch(userChoice.toUpperCase()) {
            case "ROCK":
                System.out.println("|------------|             |            |");
                break;
            case "PAPER": 
                System.out.println("|            |-------------|            |");
                break;
            case "SCISSORS":
                System.out.println("|            |             |------------|");
                break;
            default:
                System.out.println("Damnit you broke it again");
                break;
        }
        System.out.print("Computer:\t");
        switch(computerChoice.toUpperCase()) {
            case "ROCK":
                System.out.println("|------------|             |            |");
                break;
            case "PAPER": 
                System.out.println("|            |-------------|            |");
                break;
            case "SCISSORS":
                System.out.println("|            |             |------------|");
                break;
            default:
                System.out.println("Damnit you broke it again");
                break;
        }
        System.out.println("\t\t-----------------------------------------");
    }
}
