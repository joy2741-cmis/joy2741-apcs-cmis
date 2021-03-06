import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectB extends Actor
{
    /**
     * Act - do whatever the ObjectB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean horizontal;

    public void act() 
    {
        turn();
        checkEdge();
    } //end act

    private void move()
    {
        if( Greenfoot.getRandomNumber(4) == 0 )
        {
            move(20);
        }
        else if( Greenfoot.getRandomNumber(4) == 1 )
        {
            move(30);
        }
        else if( Greenfoot.getRandomNumber(4) == 2 )
        {
            move(40);
        }
        else if( Greenfoot.getRandomNumber(4) == 3 )//move right
        {
            move(50);
        }//end if-else
    }//end move

    private void turn()
    {
        move();
        if( Greenfoot.getRandomNumber(4) == 0 )//move up
        {
            setLocation(getX(), getY()-30);
        }
        else if( Greenfoot.getRandomNumber(4) == 1 )//move down
        {
            setLocation(getX(), getY()+30);
        }
        else if( Greenfoot.getRandomNumber(4) == 2 )//move left
        {
            setLocation(getX()-30, getY());
        }
        else if( Greenfoot.getRandomNumber(4) == 3 )//move right
        {
            setLocation(getX()+30, getY());
        }//end if-else

    }//end moveAndTurn

    private void checkEdge()
    {
        if( isAtEdge() == true )
        {
            if( getX() < 10 )
            {
                setLocation(600,getY());
                horizontal = true;
            }
            else if( getX() > 590 )
            {
                setLocation(0, getY());
                horizontal = true;
            }
            else if( getY() < 10 )
            {
                setLocation(getX(),400);
                horizontal = false;
            }
            else if( getX() > 390 )
            {
                setLocation(getX(),0);
                horizontal = false;
            }
        }//end if atEdge
    }//end checkEdge

    public boolean getHorizontal()
    {
        return horizontal;
    }//end getHorizontal
}//end class
