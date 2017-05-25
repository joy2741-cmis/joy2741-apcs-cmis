import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SHealth extends Slime implements HeroStats 
{
    private int health = 20; 
    private int maxHealth = 20;
    
    public SHealth()
    {
        super(null);
        setImage(new GreenfootImage("Health: " + health + "/" + maxHealth, 20, Color.RED, Color.WHITE));
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