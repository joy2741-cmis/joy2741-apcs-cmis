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
        TypeA typeA = new TypeA();
        addObject(typeA,400,200);
        TypeB typeB = new TypeB();
        addObject(typeB,300,100);
        EnemyB enemyB = new EnemyB();
        addObject(enemyB,200,300);
        EnemyA enemyA = new EnemyA( enemyB );
        addObject(enemyA,100,150);        
    }//end prepare()
}//end class
