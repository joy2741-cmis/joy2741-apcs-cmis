import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Character
{
    int lvl;
    int exp;

    public Hero( )
    {
        super(50, 50, 5, 20);
        lvl = 1;
        exp = 0;
    }//end constructor

    //METHODS INHERITED FROM CHARACTER
    public void attack()
    {

    }//end attack

    public void skill()
    {

    }//end skill

    public int lowerHealth()
    {
        int health = getHealth();	
        return health;
    }//end lowerHealth

    public int lowerMana()
    {
        return 0;
    }//end lowerMana

    public int regeneratesHealth()    
    {
        return 0;
    }//end lowerMana

    public int regeneratesMana()
    {
        return 0;
    }//end lowerMana
    

    //ADDITIONAL METHODS
    public int randomEXP()
    {
        int randomEXP = Greenfoot.getRandomNumber(30) * lvl;
        return randomEXP;
    }//end randomEXP
    
    public void gainEXP()
    {
        int additionalEXP = randomEXP();
        exp += additionalEXP;
    }
    
}
