import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroStats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroStats implements Stats
{
    private int health = 20;
    private int mana = 20;
    private int minAD = 5;
    private int maxAD = 20;
    private int EXP = 0;
    private int lvl = 1;

    public void act() 
    {
        // Add your action code here.
    }    

    public int getHealth()
    {
        return health;
    }

    public void setHealth( int newHealth )
    {
        health = newHealth;
    }

    public int getMana()
    {
        return mana;
    }//end getMana    

    public void setMana( int newMana )
    {
        mana = newMana;
    }//end setHealth

    public int getMinAD()
    {
        return minAD;
    }//end getMinAD

    public int getMaxAD()
    {
        return maxAD;
    }//end getMaxAD

    public void setMaxAD( int newMaxAD )
    {
        maxAD = newMaxAD;
    }//end setMaxAD

    public int getEXP()
    {
        return EXP;
    }//end getEXP

    public void setEXP( int newEXP )
    {
        EXP = newEXP;
    }//end setEXP
    
    public int getLvl()
    {
        return lvl;
    }
    
    public void lvlUp()
    {
        int requirement = 100 * lvl;
        if(EXP == requirement )
        {
            lvl++;
            setMaxAD(getMaxAD() + Greenfoot.getRandomNumber(30)); //increase AD
            setHealth(getHealth() + Greenfoot.getRandomNumber(50)); //increase Health
            setMana(getMana() + Greenfoot.getRandomNumber(50)); //increase Mana
            setEXP(0);
        }
        lvl++;
    }

}
