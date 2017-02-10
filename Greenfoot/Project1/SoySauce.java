import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoySauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoySauce extends Actor
{
    /**
     * Act - do whatever the SoySauce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SoySauce()
    {
        GreenfootImage soySauce = getImage();
        soySauce.scale(soySauce.getWidth()-130, soySauce.getHeight()-233); 
    }//end constructor

    public void act() 
    {
        // Add your action code here.
    }    
}
