
package TicTacToe.Scripts;

/**
 *
 * @author Benja_thomp486
 */

/**
 * Board will look like
 * X | O | X
 * --+---+--
 * O | X | O
 * --+---+--
 * X | O | X
*/
public class UserInterface extends Levels{
    
    public static boolean CheckForWin(){
        return false;
    }
    public static void Display(){
        System.out.println("");
        for(int i = 0; i<9 ;i++){
            switch(Game[i]){
                case 0:
                    System.out.print(" " + i + " ");
                    break;
                case 1:
                    System.out.print(" X ");
                    break;
                case 2:
                    System.out.print(" O ");
                    break;
                default:
                    System.out.print("Caaarl. What did you do?");
                    break;
            }
            switch(i){
                case 0:
                    System.out.print("|");
                    break;
                case 1:
                    System.out.print("|");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println(" --+---+-- ");
                    break;
                case 3:
                    System.out.print("|");
                    break;   
                case 4:
                    System.out.print("|");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println(" --+---+-- ");
                    break;
                case 6:
                    System.out.print("|");
                    break;
                case 7:
                    System.out.print("|");
                    break;
                case 8:
                    System.out.println("");
                    break;
                default:
                    System.out.println("You broke it...");
                    break;
            }
        }
    }
}
