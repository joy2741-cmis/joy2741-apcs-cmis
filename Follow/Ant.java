import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    public void act() 
    {
        moveRandomly();
    }    
    
    public void moveRandomly()
    {
        move(4);
        if( Greenfoot.getRandomNumber(2) == 0 )
        {
            turn(-45);
        }
        else
        {
            turn(45);
        }//end if-else
    }
}//end class
