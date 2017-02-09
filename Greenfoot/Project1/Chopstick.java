import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chopstick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chopstick extends Actor
{
    /**
     * Act - do whatever the Chopstick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Chopstick()
    {
        GreenfootImage chopstick = getImage();
        chopstick.scale(chopstick.getWidth(), chopstick.getHeight()); 
    }//end constructor
    
    public void act() 
    {
        // Add your action code here.
    }    
}
