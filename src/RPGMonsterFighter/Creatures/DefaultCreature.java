package RPGMonsterFighter.Creatures;

import MessingAround.MessingAroundMain;

public class DefaultCreature extends MessingAroundMain{
    public String name;
    public int health;
    public int mana;
    public int defense;
    
    public boolean lostDef;
    public int damage;
    
    public DefaultCreature(String dfName,int dfHealth, int dfMana, int dfDefense){
        name = dfName;
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
        lostMobHealth = lostMobHealth * weaponClass;//                           Currently unused
        int random = NumGen.nextInt(100);
        if(random >= 70 && defense >= 0){
            hasDefended = true;
            lostMobHealth = lostMobHealth - defense;//                           Uses defense to change damage done
            random = NumGen.nextInt();
            if(random <= 40){
                defense = defense - 1;
                lostDef = true;
                System.out.println(name + " lost 1 DEFENSE!");
                System.out.println("");
            }
        }
        if(lostMobHealth <= 0){
            lostMobHealth = 1;//                                                 Adds 1 to damage done to do at least 1 damage
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
    public void checkCreature(){
        System.out.println(name + " attributes:");
        System.out.println("HP   = " + health);
        System.out.println("MANA = " + mana);
        System.out.println("DEF  = " + defense);
    }
    public void messageHurt(){
        int random = NumGen.nextInt(100);
        if(random >= 90){
            System.out.println(name + " feels a lot of pain.");
        }else if(random >= 80){
            System.out.println(name + " is having a 8ad br8k!");
        }else if(random >= 70){
            System.out.println(name + " needs a BAND-AID.");
        }else if(random >= 60){
            System.out.println(name + " wants to RUN!");
        }else if(random >= 50){
            System.out.println(name + " is hurt!");
        }else if(random >= 40){
            System.out.println(name + " needs a ");
        }else if(random >= 30){
            System.out.println(name);
        }else if(random >= 20){
            
        }else if(random >= 10){
            
        }else{
            System.out.println("You broke it D:");
            System.out.println("Prepare for a GLITCH MONSTER!");
            
        }
    }
}
