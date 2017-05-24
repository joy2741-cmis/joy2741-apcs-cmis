import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int i = 0;
    private Score score;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        score = new Score();
        addObject(score, 40, 340);
        SoySauce soySauce = new SoySauce();
        addObject(soySauce, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        SoySauce soySauce2 = new SoySauce();
        addObject(soySauce2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Egg gudetama = new Egg();
        addObject(gudetama,300,200);
        Enemy enemy = new Enemy(gudetama);
        addObject(enemy, 400, 500);
    }//end constructor

    public void act()
    {
        generateSoySauce();
    }//end act

    public void generateSoySauce()
    {
        if( Greenfoot.getRandomNumber(100) == 0 )
        {
            SoySauce soySauce = new SoySauce();
            addObject(soySauce, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            i++;
        }//end if
    }//end generateSoySauce

    public Score getScore()
    {
        return score;
    }//end getScore
}//end class
