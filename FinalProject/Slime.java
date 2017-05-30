import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Slime extends Enemy
{
    Actor target;
    boolean isFighting = false;

    public Slime( Actor target )
    {
        super(20, 15, 2, 7);
        GreenfootImage boss = getImage();
        boss.scale( boss.getWidth()/6, boss.getHeight()/6 );
        this.target = target;
    }//end constructor       

    public void setIsFighting( boolean newIsFighting )
    {
        isFighting = newIsFighting;
    }//end setIsFighting
    
    public void showStats()
    {
        level1 world = (level1) getWorld();       
        //Slime healthCounter = new SHealth();
        //world.addObject(healthCounter, 520, 20);                
    }//end showStats

    public void act()
    {
        if( isFighting == false )
        {
            moveRandomly();
        }
        //showStats();
        isDead();
    }//end act

    public void moveRandomly()
    {
        move(1);
        int random = Greenfoot.getRandomNumber(6);
        if( random == 0 )
        {
            turn(-15);
        }
        else if( random == 1 )
        {
            turn(15);
        }
    }//end moveRandomly

    //METHODS INHERITED FROM CHARACTER
    public void attack()
    {
        int randomAD = getMinAD() + Greenfoot.getRandomNumber(getMaxAD() - getMinAD());  
        //return randomAD;
    }//end attack

    public int skill()
    {
        return 0;
    }//end skill

    public int lowerHealth()
    {
        
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

    public int randomEXP()
    {
        int randomEXP = Greenfoot.getRandomNumber(30);
        return randomEXP;
    }//end randomEXP

    public boolean isDead()
    {
        if( getHealth() == 0 )
        {
            level1 world = (level1) getWorld();
            world.removeObject(this);
            return true;
        }
        return false;
    }//end isDead()
}
