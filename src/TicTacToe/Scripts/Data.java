package TicTacToe.Scripts;
import MessingAround.UserInputs;

public class Data extends UserInputs{
    public static int LastMove;
    public static int[] Game           = {0,0,0,0,0,0,0,0,0};
    public static int Level            = 1;
    public static int PlayerWins       = 0;
    public static int CPUWins          = 0;
    public static boolean PlayerFirst  = true;
    public static boolean userFinished = false;
    public static boolean Ans1 = false;
    public static boolean Ans2 = false;
}