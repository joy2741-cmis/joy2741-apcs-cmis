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
        //checkEdge();
    }//end act

    public void turn()
    {        
        move(3);
        if( Greenfoot.getRandomNumber(4) == 0 )
        {
            turn(-15);
        }

        else if ( Greenfoot.getRandomNumber(4) == 1 )
        {
            turn(15);
        }                  
    }//end move
    /*
    public void checkEdge()
    {
        if( isAtEdge() == true )
        {
            if( Greenfoot.getRandomNumber(2) == 0 )
            {
                setLocation(getX()+20, getY()+20);
            }
            else
            {
                setLocation(getX()-20, getY()-20);
            }//end if
        }//end if
    }//end checkEdge
    */

}

