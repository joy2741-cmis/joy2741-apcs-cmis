import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Enemy extends Actor
{
    int health;
    int mana;
    int minAD;
    int maxAD;

    public Enemy( int health, int mana, int minAD, int maxAD )
    {
        this.health = health;
        this.mana = mana;
        this.minAD = minAD;
        this.maxAD = maxAD;
    }//end constructor

    public abstract void attack();

    public abstract int skill();

    public abstract int lowerHealth();

    public abstract int lowerMana();

    public abstract int regeneratesHealth();

    public abstract int regeneratesMana();

    public int getHealth()
    {
        return health;
    }//end getHealth
    
    public void setHealth( int newHealth )
    {
        health = newHealth;
    }//end setHealth

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

    public boolean isDead()
    {
        if( getHealth() == 0 )
        {
            return true;
        }
        return false;
    }//end isDead()

}//end class
