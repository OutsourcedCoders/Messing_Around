package RPGMonsterFighter.Lands;

public class Plains extends DefaultLand{
    public int windStr;                                                                       
    public Plains(String dfWeather,int dfLootCnc,boolean dfFindCreature,int dfWindStr){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public void setWindStr(int NewWindStrVal){
        windStr = NewWindStrVal;
    }
    
    public static void main(String[] args) {
        System.out.println("You encounter a beautiful PLAINS.");
        System.out.println("Wind rustles the tall grass around.");
        System.out.println("What do you do?");
        System.out.println("------------------------");
        System.out.println("| Item | Search | Move |");
        System.out.println("------------------------");
        System.out.println(": ");
        
    }
}
