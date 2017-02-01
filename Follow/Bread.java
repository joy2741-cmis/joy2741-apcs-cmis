import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{

    public void act() 
    {
        moveRandomly();
        checkEdge();
        generateAnts();
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
    }//end moveRandomly

    public void generateAnts()
    {
        if( isTouching(null) == true )
        {
            getWorld().addObject(new Ant(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
    }//end generateAnts

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
}
