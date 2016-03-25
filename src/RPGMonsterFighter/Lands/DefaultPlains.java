package RPGMonsterFighter.Lands;

public class DefaultPlains extends DefaultLand{
    public int windStr;
    /*                                                                           Requires 4 Variables
    /                                                                            In order:
    /                                                                            Weather (String)
    /                                                                            Loot Chance (int)
    /                                                                            Creatures (boolean)
    /                                                                            Wind Strength (int)
    */                                                                           
    public DefaultPlains(String dfWeather,int dfLootCnc,boolean dfFindCreature,int dfWindStr){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public void setWindStr(int NewWindStrVal){
        windStr = NewWindStrVal;
    }
}
