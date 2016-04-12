package RPGMonsterFighter.Creatures;

import MessingAround.MessingAroundMain;

public class DefaultCreature extends MessingAroundMain{
    public int health;
    public int mana;
    public int defense;
    public int damage;

    public DefaultCreature(int dfHealth, int dfMana, int dfDefense){
        health = dfHealth;
        mana = dfMana;
        defense = dfDefense;
        
    }
    public void setHealth(int setHealth){
        health = setHealth;
    }
    public void setMana(int setMana){
        mana = setMana;
    }
    public void setDefense(int setDefense){
        defense = setDefense;
    }
    public void loseHealthMob(int lostMobHealth){
        lostMobHealth = lostMobHealth * weaponClass;//                                     Currently unused
        lostMobHealth = lostMobHealth - defense;//                                             Uses defense to change damage done
        if(lostMobHealth<= 0){
            lostMobHealth = 1;//                                                        Adds 1 to damage done to do at least 1 damage
        }
        damage = lostMobHealth;
        health = health - lostMobHealth;
    }
    public void loseHealthPlayer(int lostPlrHealth){
        lostPlrHealth = lostPlrHealth - defense;
        if(lostPlrHealth <= 0){
            lostPlrHealth = 1;
        }
        damage = lostPlrHealth;
        health = health - lostPlrHealth;
    }
    public void loseMana(int lostMana){
        mana = mana - lostMana;
    }
    public void loseDef(int lostDef){
        defense = defense - lostDef;
    }
    public void gainHealth(int gainedHealth){
        health = health + gainedHealth;
    }
    public void gainDefense(int gainedDefense){
        defense = defense + gainedDefense;
    }
    public void gainMana(int gainedMana){
        mana = mana + gainedMana;
    }
}
