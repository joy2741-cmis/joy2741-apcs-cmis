import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    Character target;
    HeroStats heroStats = new HeroStats();
    BossStats stats = new BossStats();
    randomNumberGenerator generator = new randomNumberGenerator();

    public Boss( Character target )
    {        
        super(100, 80, 30, 70);
        GreenfootImage boss = getImage();
        boss.scale( boss.getWidth()/2, boss.getHeight()/2 );
        this.target = target;
    }//end constructor

    public void act()
    {
        moveRandomly();
        attack();
        isDead();
    }//end act

    public void moveRandomly()
    {
        move(1);
        int random = Greenfoot.getRandomNumber(4);
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
        if( isTouching(Hero.class) )
        {
            if( Greenfoot.getRandomNumber(150) == 0 )
            {
                int AD = generator.bossDamage();
                System.out.println("Boss AD: " + AD);
                System.out.println("Hero Health: " + heroStats.getHealth());
                heroStats.setHealth(heroStats.getHealth() - AD);
                System.out.println("Hero Health After: " + heroStats.getHealth());
            }//end if
        }//end if
    }//end attack
    
    public void slowed()
    {
        Greenfoot.delay(5);
    }

    public int skill()
    {
        return 0;
    }//end skill

    public int lowerHealth()
    {
        return 0;
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
        if( stats.getHealth() == 0 )
        {
            //BossLevel world = (BossLevel) getWorld();
            //world.removeObject(this);
            System.out.println("You defeated the boss");
            Greenfoot.stop();
            return true;
        }
        return false;
    }//end isDead()
}
