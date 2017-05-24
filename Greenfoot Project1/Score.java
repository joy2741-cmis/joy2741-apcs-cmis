import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int score = 0;
    
    public Score()
    {
        setImage(new GreenfootImage("" + score, 40, Color.BLACK, Color.WHITE));
    }//end constructor
    
    public void increment()
    {
        score += 1;
        setImage(new GreenfootImage("" + score, 40, Color.BLACK, Color.WHITE));
    }//end increment
}
