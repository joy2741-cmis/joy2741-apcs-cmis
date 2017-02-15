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

    int speed = 2;

    public Chopsticks()
    {
        GreenfootImage chopsticks = getImage();
        chopsticks.scale(chopsticks.getWidth()-750, chopsticks.getHeight()-750); 
        this.speed = speed;
    }//end constructor

    public void act() 
    {
        move();
    }//end act

    public void move()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-speed);
        }
        else if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(), getY()+speed);
        }
        else if( Greenfoot.isKeyDown("left") )
        {
            setLocation(getX()-speed, getY());
        }
        else if( Greenfoot.isKeyDown("right") )
        {
            setLocation(getX()+speed, getY());
        }//end if
    }//end move
}
