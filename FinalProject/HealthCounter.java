import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HealthCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthCounter extends Actor
{
    private int totalCount = 0;
    HeroStats stats = new HeroStats();
    public HealthCounter()
    {
        setImage(new GreenfootImage("Health: " + stats.getHealth(), 20, Color.WHITE, Color.BLACK));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void bumpCount()
    {
        setImage(new GreenfootImage("" + stats.getHealth(), 20, Color.WHITE, Color.BLACK));
    }
}
