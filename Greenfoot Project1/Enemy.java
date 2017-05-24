import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    Actor target;
    int speed = 1;
    int num;

    public Enemy( Actor target )
    {
        this.target = target;
    }//end constructor

    public void act() 
    {
        pokeEgg();
        if( target != null )
        {
            followTarget();
        }
        else
        {
            moveRandomly();
        }//end if       
    }

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

    public void pokeEgg()
    {        
        Actor egg = getOneObjectAtOffset(0,0,Egg.class);
        if( egg != null )
        {      
            System.out.println("Game Over!");
            Greenfoot.stop();
        }
    }

}//end class
