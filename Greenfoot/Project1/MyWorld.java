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
        prepare();
    }//end constructor

    public void prepare()
    {
        SoySauce soySauce = new SoySauce();
        addObject(soySauce,100,300);
        Gudetama gudetama = new Gudetama(soySauce);
        addObject(gudetama,300,200);
        Chopstick chopstick = new Chopstick();
        addObject(chopstick,500,100);
    }//end prepare

    
    
}
