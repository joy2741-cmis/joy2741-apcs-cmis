import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gudetama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gudetama extends Actor
{
    /**
     * Act - do whatever the Gudetama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Gudetama()
    {        
        GreenfootImage gudetama = getImage();
        gudetama.scale(gudetama.getWidth()-150, gudetama.getHeight()-71); 
    }//end Gudetama
    
    public void act() 
    {  
        
    }    
}
