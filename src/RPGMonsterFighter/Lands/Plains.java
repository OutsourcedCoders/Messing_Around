package RPGMonsterFighter.Lands;
import static MessingAround.UserInputs.creatureHere;

public class Plains extends DefaultLand{
    public int windStr;                                                                       
    public Plains(String dfWeather,int dfLootCnc,boolean dfFindCreature,int dfWindStr){
        super(dfWeather, dfLootCnc, dfFindCreature);
    }
    public void setWindStr(int NewWindStrVal){
        windStr = NewWindStrVal;
    }
    
    public Plains NewPlains = new Plains("" , 0, false, 0);
    
    public static void main(String[] args) {
        creatureHere = NumGen.nextBoolean();
        System.out.println("You encounter a beautiful PLAINS.");
        System.out.println("Wind rustles the tall grass around.");
        System.out.println("What do you do?");
        while(!userAnswered){
            System.out.println("-----------------");
            System.out.println("| Search | Move |");
            System.out.println("-----------------");
            System.out.print(": ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "ITEM"://                                                   item code goes here
                    break;
                case "SEARCH":
                    if(creatureHere = true){
                        inBattle = true;
                        RPGMonsterFighter.Encounters.World.main(args);
                    }//                                                          stuff
                    
                    break;
            }
        }
    }
}
