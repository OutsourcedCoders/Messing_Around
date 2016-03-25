package RPGMonsterFighter.Creatures;

public class Creature {
    public int health;
    public int mana;
    public int defense;
    public Creature(int defaultHealth, int defaultMana, int defaultDefense){
        health = defaultHealth;
        mana = defaultMana;
        defense = defaultDefense;
        
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
}
