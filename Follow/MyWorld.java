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
    
    public void prepare()
    {
        Ball a = new Ball();
        addObject(a,400,200);
        Ball b = new Ball(a);
        addObject(b,a.getX()-40,a.getY());
        Ball c = new Ball(b);
        addObject(c,b.getX()-40,a.getY());
        Ball d = new Ball(c);
        addObject(d,c.getX()-40,a.getY());
        Ball e = new Ball(d);
        addObject(e,d.getX()-40,a.getY());
        Ball f = new Ball(e);
        addObject(f,e.getX()-40,e.getY());
    }//end prepare

}
