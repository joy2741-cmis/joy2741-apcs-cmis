import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class level1 extends World
{
    ArrayList<Character> enemies = new ArrayList<Character>(); 

    public level1()
    {
        super(600, 400, 1);
        for( int i = 0; i < 10; i++ )
        {
            addSlime();
        }//end for
        addSlime();
        addHero();
    }//end constructor

    public void addSlime()
    {        
        Slime slime = new Slime(null);
        enemies.add(slime);
        addObject(slime,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }//end addHero
    
    public void addHero()
    {
        Hero hero = new Hero(null);
        addObject(hero,300,200);
    }//end addHero

}//end class
