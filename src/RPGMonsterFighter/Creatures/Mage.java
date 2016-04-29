package RPGMonsterFighter.Creatures;
public class Mage extends DefaultCreature{
    public boolean spellUsed = false;
    
    public Mage(String dfName,int dfHealth, int dfMana, int dfDefense, boolean dfSpellUsed){
        super(dfName, dfHealth, dfMana, dfDefense);
        spellUsed = dfSpellUsed;
    }
    
    public void spellChoice() {
        switch (mana) {
            case 0:
                damageTaken = NumGen.nextInt(5);
                System.out.println("The WIZARD hit you with his CANE!");
                System.out.println("OW! That hurts!");
                spellUsed = true;
                break;
            case 1:
                damageTaken = 10;
                System.out.println("WIZARD used EARTH TREMBLE!");
                System.out.println("The ground SHAKES.");
                spellUsed = true;
                break;
            case 2:
                damageTaken = 15;
                System.out.println("WIZARD used WATER BOLT!");
                System.out.println("Globules of ENCHANTED WATER fly at you!");
                spellUsed = true;
                break;
            case 3:
                damageTaken = 20;
                System.out.println("WIZARD used STAR STORM!");
                System.out.println("FALLEN STARS rain around you!");
                spellUsed = true;
                break;
            case 4:
                damageTaken = 25;
                System.out.println("WIZARD used SHOCKER BREAKER!");
                System.out.println("You get hit by a BEAM OF LIGHT!");
                spellUsed = false;
                break;
            case 5:
                damageTaken = 30;
                System.out.println("WIZARD used LIGHTNING BOLT!");
                System.out.println("The ground SMOULDERS around you.");
                spellUsed = true;
                break;
            default:
                damageTaken = 9999;
                System.out.println("W1ZZ4RD us3d G1ItCH 4TTcK?");
                System.out.println("YOU BROKE IT NOW YOU'RE DEAD!");
                spellUsed = true;
                break;
        }
    }
}
