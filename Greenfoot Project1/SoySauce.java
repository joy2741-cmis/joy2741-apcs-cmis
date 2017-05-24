import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SoySauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoySauce extends Actor
{
    private GreenfootImage img;
    public SoySauce()
    {
        img = new GreenfootImage(50,50);
        img.drawOval(12,12,25,25);
        img.setColor(Color.BLACK);
        img.fillOval(12,12,25,25);
        setImage(img);
    }//end constructor

    public void act() 
    {
        moveRandomly();
        avoidEnemy();
    }    

    public void moveRandomly()
    {
        move(5);
        if( Greenfoot.getRandomNumber(3) == 0 )
        {
            turn(-15);
        }
        else if( Greenfoot.getRandomNumber(3) == 1 )
        {
            turn(15);
        }
    }//end moveRandomly

    public void avoidEnemy()
    {
        Actor egg = getOneObjectAtOffset(0,0,Egg.class);
        if( egg != null && ((egg.getX() - getX() < 50) || (egg.getY() - getY() < 50)) )
        {
            turn(180);
            move(3);
        }//end if
    }//end avoidEnemy
}
