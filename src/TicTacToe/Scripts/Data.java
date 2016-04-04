package TicTacToe.Scripts;
import MessingAround.UserInputs;

public class Data extends UserInputs{
    public static int LastMove;
    public static int[] Game          = {0,0,0,0,0,0,0,0,0};
    public static int Level           = 1;
    public static int PlayerWins      = 0;
    public static int CPUWins         = 0;
    public static boolean PlayerFirst = true;
}