package MessingAround;
//                                                                                  MESSING AROUND!
//                                                                               --------------------
//                                                                               Brought to you by:
//                                                                               Jasonface900
//                                                                               YourAverageRandy
//                                                                               Sci1017
//                                                                               and created on:
//                                                                               March 23th, 2016
//                                                                               --------------------
public class MessingAroundMain extends UserInputs{
    public static void main(String[] args) {
        System.out.print("Hey, how are yah?: ");
        while(!userAnswered) {
        userInput = sc.nextLine();
        switch (userInput.toUpperCase()) {
            case "GOOD"://                                                       Andy's work
                System.out.println("That's good to hear.");
                userAnswered = true;
                break;//                                                         Jorge: Added some new case statements
            case "BAD":
                System.out.println("That's just too bad.");
                userAnswered = true;
                break;
            case "SO SO":
                System.out.println("That's okay.");
                userAnswered = true;
                break;
            case "OK":
                System.out.println("That's fine.");
                userAnswered = true;
                break;
            case "MAD":
                System.out.println("WHY YOU MAD BRO!");
                userAnswered = true;
                break;
            case "DEVELOPER":
                System.out.println("So, you're a dev.");
                System.out.println("You get some cool choices then!");
                isDeveloper = true;
                userAnswered = true;
                break;
            default: 
                System.out.println("Please input a valid response");
                break;
            }
        }
        userAnswered = false;//                                                  Game Selection
        while(!userAnswered) {
            System.out.println("What kinda game would you like to play?");
            if(isDeveloper){
                System.out.println("");
                System.out.println("Choices: ");
                System.out.println("Rock Paper Scissors");
                System.out.println("Nation Simulator");
                System.out.println("RPG");
                System.out.println("Tic Tac Toe");
            }
            System.out.print(": ");
            userInput = sc.nextLine();
            switch (userInput.toUpperCase()) {
                case "NATION SIMULATOR":
                    userGame = userInput;
                    userAnswered = true;
                    NationSimulator.NationMain.main(args);
                    break;
                case "ROCK PAPER SCISSORS":
                    System.out.println("\nAlright.");
                    userGame = userInput;//                                      Jorge:
                    userAnswered = true;//                                        IT WORKS!
                    RPS.RockPaperScissors.main(args);
                    break;
                case "RPG":
                    System.out.println("\nHell yeah!");
                    userAnswered = true;
                    RPGMonsterFighter.RPG_Game.main(args);
                case "TIC TAC TOE":
                    System.out.println("Never hate the classics");
                    TicTacToe.Game.main(args);
                    break;
                default:
                    System.out.println(userInput);
                    break;
            }
        }
    }
}
