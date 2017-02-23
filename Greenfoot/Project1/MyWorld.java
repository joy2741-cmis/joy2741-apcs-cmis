import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 10;
    int numGd = 1;
    
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
        Chopsticks chopsticks = new Chopsticks();
        addObject(chopsticks,500,100);
    }//end prepare
    
    public void generateGudetama()
    {
        Gudetama gudetama = new Gudetama(null);
        addObject(gudetama, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        numGd++;
    }//end generateGudetama
    
    public int getNumGd()
    {
        return numGd;
    }//end getNumGd

}
