package RPGMonsterFighter.Creatures;

public class DefaultCreature {
    public int health;
    public int mana;
    public int defense;

    public DefaultCreature(int dfHealth, int dfMana, int dfDefense){
        health = dfHealth;
        mana = dfMana;
        defense = dfDefense;
        
    }
    public void setHealth(int newHealthVal){
        health = newHealthVal;
    }
    public void setMana(int newManaVal){
        mana = newManaVal;
    }
    public void setDefense(int newDefenseVal){
        defense = newDefenseVal;
    }
    public void loseHealth(int lostHealth){
        health = health - lostHealth;
    }
    public void loseMana(int lostMana){
        mana = mana - lostMana;
    }
    public void loseDef(int lostDef){
        defense = defense - lostDef;
    }
}
