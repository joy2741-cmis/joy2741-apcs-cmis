import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    Actor target;
    boolean leader;

    public Ball()//leader
    {
        leader = true;
    }//end constructor

    public Ball( Actor target )//follower
    {
        this.target = target;
        leader = false;
    }//end constructor

    public void act() 
    {
        if( leader == true )
        {
            moveRandomly();
            checkEdge();
        }
        else
        {
            follow();
            checkOverlap();
        }//end if-else
    }    

    public void moveRandomly()
    {
        move(3);
        if( Greenfoot.getRandomNumber(2) == 0 )
        {
            turn(45);
        }
        else 
        {
            turn(-45);
        }//end if-else
    }//end move

    public void checkEdge()
    {
        move(3);
        if( getX() > 590 )
        {
            turn(-45);
        }
        else if( getX() < 10 )
        {
            turn(45);
        }
        else if( getY() < 10 )
        {
            turn(-45);
        }
        else if( getY() > 390 )
        {
            turn(45);
        }//end if
    }//end checkEdge

    public void follow()
    {
        turnTowards( target.getX(), target.getY() );
        move(3);
    }//end follow
    
    public void checkOverlap()
    {
        if( intersects( target ) )
        {
            turn(-180);
            move(2);
            turn(180);
        }//end if
    }//end checkOverlap

}
