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
    }

    private void prepare()
    {

        Ball a = new Ball();
        addObject(a,410,200);

        Ball b = new Ball();
        addObject(b,a.getX()-22,a.getY());

        Ball c = new Ball();
        addObject(c,b.getX()-22,b.getY());

        Ball d = new Ball();
        addObject(d,c.getX()-22,c.getY());

        Ball e = new Ball();
        addObject(e,d.getX()-22,d.getY());

        Ball f = new Ball();
        addObject(f,e.getX()-22,e.getY());

    }
}
