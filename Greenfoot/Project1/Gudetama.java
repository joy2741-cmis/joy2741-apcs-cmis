import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Gudetama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gudetama extends Actor
{
    Actor target;
    int speed = 1;
    GreenfootImage shield;

    public Gudetama( Actor target )
    {        
        GreenfootImage gudetama = getImage();
        gudetama.scale(gudetama.getWidth()-150, gudetama.getHeight()-71); 
        this.target = target;
        this.speed = speed;
    }//end Gudetama

    public void act() 
    {  
        if( target!= null )
        {
            followTarget();
        }
        else
        {
            moveRandomly();
        }//end if
        soySauceBoost();
    }//end act

    public void followTarget()
    {
        turnTowards(target.getX(), target.getY());
        move(speed);
    }//end followTarget

    public void setTarget( Actor newTarget )
    {
        target = newTarget;
    }//end setTarget

    public void moveRandomly()
    {
        move(speed);
        if( Greenfoot.getRandomNumber(3) == 0 )
        {
            turn(-15);
        }
        else if( Greenfoot.getRandomNumber(3) == 1 )
        {
            turn(15);
        }
    }//end moveRandomly

    public void soySauceBoost()
    {
        Actor soySauce = getOneObjectAtOffset(0,0,SoySauce.class);
        if( soySauce != null )
        {
            getWorld().removeObject(soySauce);
            speed += 7;         
            setTarget(null);
        }
    }//end soySauceBoost

    public void avoidChopstick()
    {
        Actor chopsticks = getOneObjectAtOffset(0,0,Chopsticks.class);
        if( chopsticks != null && ((chopsticks.getX() - getX() < 50) || (chopsticks.getY() - getY() < 50)))
        {
           turn(180);
           move(1);
        }//end if
    }//end avoidChopstick

}
