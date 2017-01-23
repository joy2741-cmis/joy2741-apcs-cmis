import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeA extends Actor
{
    /**
     * run
     */
    public void act() 
    {
        turnLeft();
        turnRight();
        up();
        down();
    }  
    
    public void up()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-1);
        }//end if
    }//end up

    public void down()
    { 
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(),getY()+1);
        }//end if
    }//end down

    public void turnLeft()
    {
        if( Greenfoot.isKeyDown("left") )
        {
            setLocation(getX()-1,getY());
        }//end if
    }//end turnLeft

    public void turnRight()
    {
        if( Greenfoot.isKeyDown("right") )
        {
            setLocation(getX()+1,getY());
        }//end if
    }//end turnRight

}
