/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;
import MessingAround.UserInputs;
/**
 *
 * @author Benja_thomp486
 */
public class Data extends UserInputs {    /**
     * How Levels Work:
     * Level 1 CPU plays a random square EVERY turn
     * Level 2 CPU knows how to block
     * Level 3 CPU knows how to block and win
     * Level 9001 CPU CANNOT lose, only tie or win.
     */
    public static int[] Game         = {0,0,0,0,0,0,0,0,0};
    public static int Level          = 1;
    public static int PlayerWins     = 0;
    public static int CPUWins        = 0;
    public static boolean PlayerTurn = true;
}
