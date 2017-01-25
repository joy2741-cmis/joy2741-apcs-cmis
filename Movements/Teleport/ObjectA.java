import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectA extends Actor
{
    Actor target;
    
    public ObjectA( Actor target )
    {
        this.target = target;
    }//end constructor
    
    public void act() 
    {
        follow();
    }//end act
    
    public void follow()
    {
        turnTowards(target.getX(), target.getY());
        move(25);
    }//end follow

}//end class
