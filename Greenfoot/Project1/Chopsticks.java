import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chopstick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chopsticks extends Actor
{
    /**
     * Act - do whatever the Chopstick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Chopsticks()
    {
        GreenfootImage chopsticks = getImage();
        chopsticks.scale(chopsticks.getWidth()-750, chopsticks.getHeight()-750); 
    }//end constructor
    
    public void act() 
    {
        move();
        pokeGudetama();
    }//end act
    
    public void move()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-5);
        }
        else if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(), getY()+5);
        }
        else if( Greenfoot.isKeyDown("left") )
        {
            setLocation(getX()-5, getY());
        }
        else if( Greenfoot.isKeyDown("right") )
        {
            setLocation(getX()+5, getY());
        }//end if
    }//end move
    
    public void pokeGudetama()
    {
        Actor gudetama = getOneObjectAtOffset(-250,-250,Gudetama.class);
        if( gudetama != null )
        {
            getWorld().removeObject(gudetama);
        }
    }//end pokeGudetama
    
}
