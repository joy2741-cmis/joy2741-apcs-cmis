import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossStats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossStats implements Stats
{
    private int health = 100;
    private int mana = 80;
    private int minAD = 30;
    private int maxAD = 70;

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

}

