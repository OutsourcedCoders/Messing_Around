package MessingAround;

public class MessingAroundMain extends userInput{
    public static void main(String[] args) {
        while(userAnswered == false) {
        System.out.print("Hey, how are yah?: ");
        userInput = sc.next();
        
        switch (userInput.toUpperCase()) {
            case "GOOD":                                                        //ANDY'S WORK TESTING
                System.out.println("That's good to hear.");
                userAnswered = true;
                break;
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
            default: 
                System.out.println("Please input a valid response");
                userInput = sc.next();
                break;
            }
        //userInput = sc.next();                                                  //Jorge's work (also testing)
        System.out.println("Hey, My name's MessingAroundMain.java");
        
        }
        
        userAnswered = false;                                                   //Testing more userInput
        while(userAnswered == false) {
            System.out.print("What kinda game would you like to play?");
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
