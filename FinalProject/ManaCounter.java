import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ManaCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManaCounter extends Actor
{
    private int totalCount = 0;
    HeroStats stats = new HeroStats();
    public ManaCounter()
    {
        setImage(new GreenfootImage("Mana: " + stats.getMana(), 20, Color.WHITE, Color.BLACK));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("" + totalCount, 20, Color.WHITE, Color.BLACK));
    }
}
