import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyA extends Actor
{
    Actor target;
    
    public EnemyA( Actor target )
    {
        this.target = target;
    }//end EnemyA

    public void act()
    {
        turn();
        checkEdge();
    }//end act

    public void turn()
    {
        if( Greenfoot.getRandomNumber(4) == 0 )
        {
            setLocation(getX(), getY()-30); //up
        }
        else if( Greenfoot.getRandomNumber(4) == 1 )
        {
            setLocation(getX(), getY()+30); //down
        }
        else if( Greenfoot.getRandomNumber(4) == 2 )
        {
            setLocation(getX()-30, getY()); //left           
        }
        else if( Greenfoot.getRandomNumber(4) == 3 )
        {
            setLocation(getX()+30, getY()); //right
        }//end if
    }//end move

    public void checkEdge()
    {
        if( isAtEdge() == true )
        {
            move(200);
            if( Greenfoot.getRandomNumber(100) % 2 == 0 )
            {
                turn(90);
            }
            else
            {
                turn(-90);
            }//end if
        }//end if
    }//end checkEdge
}//end class
