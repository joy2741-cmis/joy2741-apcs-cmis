import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor implements HeroStats 
{
    private int health = 50; 
    private int maxHealth = 50;
    
    public Health()
    {
        setImage(new GreenfootImage("Health: " + health + "/" + maxHealth, 20, Color.BLACK, Color.WHITE));
    }//end constructor
    
    public void increment()
    {
        health += 10;
    }//end increment()

    public void decrement()
    {
        health -= 10;
    }//end decrement

    public int getNumber(){
        return 0;
    }//end getNumber

    public void setNumber( int newNumber ){

    }//end setNumber
    
}//end class
