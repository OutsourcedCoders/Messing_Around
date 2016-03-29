package TicTacToe;

/**
 *
 * @author Benja_thomp486
 */


public class Game extends UserInterface{
    public static void main(String[] args) {
        Display();
        userInput = sc.nextLine();
        System.out.println("What level of cpu do want to play");
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
                System.out.println("That's not a Valid level (1-3 work)");
                break;
        }
        System.out.println("Level set to " + userInput);
    }
}
