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
    int num;
    
    public Gudetama( Actor target )
    {        
        GreenfootImage gudetama = getImage();
        gudetama.scale( gudetama.getWidth()-150, gudetama.getHeight()-71); 
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
        generateGudetama();
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

    public void generateGudetama()
    {
        Actor soySauce = getOneObjectAtOffset(0,0,SoySauce.class);
        MyWorld world = (MyWorld) getWorld();
        if( soySauce != null && ( world.getNumGd() < 5 ) )
        {
            world.generateGudetama();
        }
    }//end soySauceBoost

    public void avoidChopstick()
    {
        Actor chopsticks = getOneObjectAtOffset(0,0,Chopsticks.class);
        if( chopsticks != null && ((chopsticks.getX() - getX() < 50) || (chopsticks.getY() - getY() < 50)) )
        {
            turn(180);
            move(3);
        }//end if
    }//end avoidChopstick
    
    /*
    public Actor getGudetama()
    {
        
    }//end getGudetama
    */
}
