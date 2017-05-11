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
    Character target;

    public Hero( Character target )
    {
        super(50, 50, 5, 20);
        lvl = 1;
        exp = 0;
        this.target = target;
    }//end constructor

    public void act() 
    {
        
    }//end act 
    
    
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

    public void resetEXP( int newEXP )
    {
        exp = 0;
    }

    public void levelUp()
    {
        int requirement = 100 * lvl;
        if( exp == requirement )
        {
            lvl++;
            resetEXP(0);
        }
    }
        

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
   
}
