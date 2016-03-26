package RPGMonsterFighter.Lands;

public class Plains extends DefaultLand{
    public int windStr;                                                                       
    public Plains(String dfWeather,int dfLootCnc,boolean dfFindCreature,int dfWindStr){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public void setWindStr(int NewWindStrVal){
        windStr = NewWindStrVal;
    }
}
