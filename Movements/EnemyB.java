import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyB extends Actor
{
    /**
     * Act - do whatever the EnemyA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn();
        checkEdge();
    }//end act

    public void turn()
    {
        if( Greenfoot.getRandomNumber(4) == 0 )
        {
            setRotation(-5);
        }
        else if ( Greenfoot.getRandomNumber(4) == 1 )
        {
            setRotation(5);
        }  
        /*
        else if ( Greenfoot.getRandomNumber(4) == 2 )
        {
        setRotation(-135);
        }
        else
        {
        setRotation(135);
        }
         */
        move(10);
    }//end move

    public void checkEdge()
    {
        if( isAtEdge() == true )
        {
            if( Greenfoot.getRandomNumber(100) % 2 == 0 )
            {
                turn(180);
            }
            else
            {
                turn(-180);
            }//end if
            move(50);
        }//end if
    }//end checkEdge

}
