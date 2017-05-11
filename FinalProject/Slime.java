import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Character
{
    Character target;

    public Slime( Character target )
    {
        super(20, 15, 2, 7);
        this.target = target;
    }//end constructor

    //METHODS INHERITED FROM CHARACTER
    public int attack()
    {
        int randomAD = getMinAD() + Greenfoot.getRandomNumber(getMaxAD() - getMinAD());  
        return randomAD;
    }//end attack

    public int skill()
    {
        return 0;
    }//end skill

    public int lowerHealth()
    {
        int health = getHealth();
        int damage = target.attack();
        System.out.println("target.attack(): " + damage);
        int newHealth = health - damage;
        setHealth(newHealth);

        return health;
    }//end lowerHealth
    
    public int lowerMana()
    {
        int mana = getMana();
        return mana;
    }//end lowerMana

    public int regeneratesHealth()    
    {
        return 0;
    }//end lowerMana

    public int regeneratesMana()
    {
        return 0;
    }//end lowerMana

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
