import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class level extends World
{
    ArrayList<Character> enemies = new ArrayList<Character>(); 
    
    public level( ArrayList<Character> enemies )
    {
        super(600, 400, 1);
        this.enemies = enemies;
    }//end constructor
}
