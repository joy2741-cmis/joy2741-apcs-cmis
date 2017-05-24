import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class level1 extends level 
{
    public level1()
    {
        super();
        addHero();
        for( int i = 0; i < 10; i++ )
        {
            addSlime();
        }//end for
        freezeEnemies();
    }//end constructor
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }//end prepare
    
    public void freezeEnemies()
    {
        System.out.println(getEnemies().size());
        
    }//end freezeEnemies
}//end class
