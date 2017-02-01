import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
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
            //checkOverlap();
        }//end if-else
    }//end act

    public void moveRandomly()
    {
        move(1);
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
        move(4);
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
        if( target.getX() - getX() > 30 || target.getY() - getY() > 30 )
        {
            move(4);
        }
        else if( getY() - target.getY() > 30 || getX() - target.getX() > 30 )
        {
            move(4);
        }//end if else
    }//end follow

    public void checkOverlap()
    {
        if( intersects( target ) == true)
        {
            turn(-180);
            move(2);
            turn(180);
        }//end if
    }//end checkOverlap

}
