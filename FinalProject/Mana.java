import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Mana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mana extends Actor implements HeroStats 
{
    private int mana = 50; 
    private int maxMana = 50;
    
    public Mana()
    {
        setImage(new GreenfootImage("Mana: " + mana + "/" + maxMana, 20, Color.BLACK, Color.WHITE));
    }//end constructor
    
    public void increment()
    {
        mana += 10;
    }//end increment()

    public void decrement()
    {
        mana -= 10;
    }//end decrement

    public int getNumber(){
        return 0;
    }//end getNumber

    public void setNumber( int newNumber ){

    }//end setNumber
    
}//end class
