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

    public Ball()//leader
    {

    }//end constructor
    
    public Ball( Actor target )//follower
    {
        this.target = target;
    }//end constructor

    public void act() 
    {
        // Add your action code here.
    }    
    
    public void move()
    {
       move(5); 
    }//end move

    public void isTouching()
    {
        if( Greenfoot.isTouching(Greenfoot.target) == true )
        {
            move(5);
        }//end if
    }//end leader

}
