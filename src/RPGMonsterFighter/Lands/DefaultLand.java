package RPGMonsterFighter.Lands;

public class DefaultLand{
    public String weather;
    public int lootCnc;
    public boolean findCreature;
    
    public DefaultLand(String dfWeather, int dfLootCnc, boolean dfFindCreature){
        weather = dfWeather;
        lootCnc = dfLootCnc;
        findCreature = dfFindCreature;
        
    }
    public void setWeather(String NewWeatherVal){
        weather = NewWeatherVal;
    }
    public void setLootCnc(int NewLootCncVal){
        lootCnc = NewLootCncVal;
    }
    public void setCreatureCnc(boolean NewFindCreature){
        findCreature = NewFindCreature;
    }
    
}
