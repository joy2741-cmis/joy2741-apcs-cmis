import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gudetama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gudetama extends Actor
{
    Actor target;

    public Gudetama( Actor target )
    {        
        GreenfootImage gudetama = getImage();
        gudetama.scale(gudetama.getWidth()-150, gudetama.getHeight()-71); 
    }//end Gudetama

    public void act() 
    {  
        followTarget();
    }//end act
    
    public void followTarget()
    {
        turnTowards(target.getX(), target.getY());
        move(1);
    }//end followTarget


}
