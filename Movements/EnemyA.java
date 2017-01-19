import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyA extends Actor
{
    /**
     * Act - do whatever the EnemyA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        turn();
        checkEdge();
    }//end act
    
    public void move()
    {
        if( Greenfoot.getRandomNumber(100) % 2 == 0 )
        {
            move(50);
        }
        else if( Greenfoot.getRandomNumber(100) % 3 == 0 )
        {
            move(100);
        }
        else if( Greenfoot.getRandomNumber(100) % 5 == 0 )
        {
            move(75);
        }
        else 
        {
            move(120);
        }
    }//end move

    public void turn()
    {
        move();
        if( Greenfoot.getRandomNumber(100) % 2 == 0 )
        {
            setRotation(-90);
        }
        else if( Greenfoot.getRandomNumber(100) % 3 == 0 )
        {
            setRotation(90);
        }
        else if( Greenfoot.getRandomNumber(100) % 5 == 0 )
        {
            setRotation(-180);
        }
        else 
        {
            setRotation(180);
        }
    }//end move

    public void checkEdge()
    {
        if( isAtEdge() == true )
        {
            move(200);
            if( Greenfoot.getRandomNumber(100) % 2 == 0 )
            {
                turn();
            }
            else
            {
                turn();
            }//end if
        }//end if
    }//end checkEdge

}
