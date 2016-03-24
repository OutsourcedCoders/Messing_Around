package MessingAround;
//     MESSING AROUND!
//  --------------------
//  Brought to you by:
//  Jasonface900
//  YourAverageRandy
//  and created on:
//  March 23th, 2016
//  --------------------
public class MessingAroundMain extends UserInputs{
    public static void main(String[] args) {
        while(userAnswered == false) {
        System.out.print("Hey, how are yah?\n : ");
        userInput = sc.next();
        
        switch (userInput.toUpperCase()) {
            case "GOOD":                                                        //ANDY'S WORK TESTING
                System.out.println("That's good to hear.");
                userAnswered = true;
                break;                                                          //Jorge: Added some new case statements
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
            default: 
                System.out.println("Please input a valid response :");
                userInput = sc.next();
                break;
            }
        }
        userAnswered = false;                                                   //Testing more userInput
        while(userAnswered == false){
            System.out.print("What kinda game would you like to play?\n :");
            userInput = sc.nextLine();
            switch (userInput.toUpperCase()) {
                case "INSERT GAME NAME HERE":
                    System.out.println("\nAlright.");
                    userAnswered = true;
                    break;
                default:
                    System.out.println("\nPlease input a valid game");
                    break;
            }
        }
    }
}
