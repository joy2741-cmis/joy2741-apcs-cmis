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
        
        System.out.println(enemies.size());
    }//end constructor
}//end class
