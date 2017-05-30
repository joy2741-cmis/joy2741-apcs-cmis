import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossLevel extends level
{

    int i = 0;
    /**
     * Constructor for objects of class BossLevel.
     * 
     */
    public BossLevel()
    {
        super();
        addHero();
        addBoss();

        Actor healthCounter = new HealthCounter();
        addObject(healthCounter, 80, 20);
        Actor manaCounter = new ManaCounter();
        addObject(manaCounter, 76, 40);
    }

    public void act()
    {
        generateChest();
    }

    public void generateChest()
    {   
        while( i < 2 )
        {
            if( Greenfoot.getRandomNumber(5000) == 0 )
            {
                Chest chest = new Chest();
                addObject(chest,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
                i++;
            }
        }
    }//end genChest

}
