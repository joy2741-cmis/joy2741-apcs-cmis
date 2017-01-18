import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,116,456);
        Crab crab2 = new Crab();
        addObject(crab2,182,360);
        Crab crab3 = new Crab();
        addObject(crab3,263,453);
        Crab crab4 = new Crab();
        addObject(crab4,408,255);
        Crab crab5 = new Crab();
        addObject(crab5,186,157);
        Crab crab6 = new Crab();
        addObject(crab6,491,75);
        Lobster lobster = new Lobster();
        addObject(lobster,94,289);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,261,318);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,483,459);
        Lobster lobster4 = new Lobster();
        addObject(lobster4,343,143);
        Worm worm = new Worm();
        addObject(worm,65,398);
        Worm worm2 = new Worm();
        addObject(worm2,205,519);
        Worm worm3 = new Worm();
        addObject(worm3,361,349);
        Worm worm4 = new Worm();
        addObject(worm4,498,320);
        Worm worm5 = new Worm();
        addObject(worm5,206,236);
        Worm worm6 = new Worm();
        addObject(worm6,74,117);
        Worm worm7 = new Worm();
        addObject(worm7,268,46);
        Worm worm8 = new Worm();
        addObject(worm8,531,154);
    }
}
