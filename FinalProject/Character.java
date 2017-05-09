import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Character extends Actor
{
    int health;
    int mana;
    int minAD;
    int maxAD;

    public Character( int health, int mana, int minAD, int maxAD )
    {
        this.health = health;
        this.mana = mana;
        this.minAD = minAD;
        this.maxAD = maxAD;
    }//end constructor

    public abstract void attack();

    public abstract void skill();

    public abstract int lowerHealth();

    public abstract int lowerMana();

    public abstract int regeneratesHealth();

    public abstract int regeneratesMana();

    public int getHealth()
    {
        return health;
    }//end getHealth

    public int getMana()
    {
        return mana;
    }//end getMana

    public int getMinAD()
    {
        return minAD;
    }//end getMinAD
    
    public int getMaxAD()
    {
        return maxAD;
    }//end getMaxAD

    public boolean isDead()
    {
        if( getHealth() == 0 )
        {
            return true;
        }
        return false;
    }//end isDead()

}
