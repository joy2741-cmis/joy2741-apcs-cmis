import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeA extends Actor
{
    /**
     * run
     */
    public void act() 
    {
        turnLeft();
        turnRight();     
    }  

    public void turnLeft()
    {
        move(3);
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-90);
        }//end if
    }//end turnLeft

    public void turnRight()
    {
        move(3);
        if( Greenfoot.isKeyDown("right") )
        {
            turn(-90);
        }//end if
    }//end turnRight

}
