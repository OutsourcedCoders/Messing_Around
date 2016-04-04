/**
 * How Levels Work:
 * Level 1 CPU plays a random square EVERY turn
 * Level 2 CPU knows how to block
 * Level 3 CPU knows how to block and win
 * Level 9001 CPU CANNOT lose, only tie or win.
 */
package TicTacToe.Scripts;

/**
 *
 * @author Benja_thomp486
 */
public class Levels extends Data{
    public static void CPUMove(){
        if(Level == 1){
            if(PlayerFirst){
                
            }
            else{
            
            }
        }
        else if(Level == 2){
            if(PlayerFirst){
            
            }
            else{
                
            }
        }
        else if(Level == 3){
            if(PlayerFirst){
                
            }
            else{
                
            }
        }
        else if(Level == 9001){
            if(PlayerFirst){
                switch(LastMove){
                    case 1:
                        ;
                        break;
                    case 2:
                }
            }
            else{
                
            }
        }
        else{
            System.out.println("Oh Come On!");
        }
    }
}    