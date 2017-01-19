import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeB extends Actor
{
    /**
     * Act - do whatever the TypeB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        rotateLeft();
        rotateRight();
    }//end act
    
    public void rotateLeft()
    {
        move(3);
        if( Greenfoot.isKeyDown( "left" ) )
        {
            turn(-5);
        }//end if
    }//end rotateLeft
    
    public void rotateRight()
    {
        move(3);
        if( Greenfoot.isKeyDown( "right" ) )
        {
            turn(5);
        }//end if
    }//end rotateRight
}
