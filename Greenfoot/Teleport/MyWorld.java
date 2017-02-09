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
    }//end myWorld
    
    private void prepare()
    {        
        ObjectB b = new ObjectB();
        addObject(b,400,300);
        ObjectA a = new ObjectA( b );
        addObject(a,100,200);
    }//end prepare
}//end World
