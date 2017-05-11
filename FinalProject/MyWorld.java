import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Character slime1 = new Slime(null);
        Character hero = new Hero(slime1);
        Character slime = new Slime(hero);

        /*
        System.out.println("Hero's health: " + hero.getHealth());
        System.out.println("Slime's health: " + slime.getHealth());
        slime.lowerHealth();
        System.out.println("Slime's health: " + slime.getHealth());
         */
        
        System.out.println("///////////////////");
        System.out.println("Hero's health: " + hero.getHealth());
        hero.lowerHealth();
        System.out.println("Hero's health: " + hero.getHealth());

    }
}
