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
   
    public level()
    {
        super(600, 400, 1);
        Actor healthCounter = new Health();
        addObject(healthCounter, 80, 20);
        Actor manaCounter = new Mana();
        addObject(manaCounter, 74, 40);
    }//end constructor
        
    public void addSlime()
    {        
        Slime slime = new Slime(null);
        enemies.add(slime);
        addObject(slime,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }//end addHero
    
    public void addBat()
    {
        
    }//end addBat
    
    public void addBoss()
    {
        
    }//end addBoss
    
    public void addHero()
    {
        Hero hero = new Hero(null);
        addObject(hero,300,200);
    }//end addHero
    
    public ArrayList<Character> getEnemies()
    {
        return enemies;
    }//end getCharacters
    
}
