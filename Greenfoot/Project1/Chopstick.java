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
        chopstick.scale(chopstick.getWidth()-750, chopstick.getHeight()-750); 
    }//end constructor
    
    public void act() 
    {
        move();
    }//end act
    
    public void move()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-1);
        }
        else if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(), getY()+1);
        }
        else if( Greenfoot.isKeyDown("left") )
        {
            setLocation(getX()-1, getY());
        }
        else if( Greenfoot.isKeyDown("right") )
        {
            setLocation(getX()+1, getY());
        }//end if
    }//end move
    
}
