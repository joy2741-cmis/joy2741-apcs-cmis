import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{  
    public void act() 
    {
        moveAround();
        eat();
    }//end constructor
    
    public void moveAround()
    {
        move(4);
        if( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }//end if       
        if( getX() <= 5 || getX() >= getWorld().getWidth() - 5 )
        {
            turn(180);
        }//end if
        if( getY() <= 5 || getY() >= getWorld().getHeight() - 5 )
        {
            turn(180);
        }//end if        
    }//end moveAround
    
    public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Crab.class); 
        //x and y difference from our current position
        //the third parameter --> class we're interested in
        if( crab != null )
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.wav");
        }//end if

    }//end eat
}
