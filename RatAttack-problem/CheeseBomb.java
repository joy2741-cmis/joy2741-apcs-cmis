import greenfoot.*; 
import java.awt.Color;

public class CheeseBomb extends Actor
{
    private int timer = 1000; 
    private GreenfootImage img;
    public CheeseBomb(){
        img = new GreenfootImage(25,25);
        img.setColor(Color.red);
        img.fillOval(0,0,25,25);
        setImage(img);
        
    }
    public void act() 
    { 
        if ( timer-- < 0){ //if timer decrements until less than 0, remove cheesebomb
            World w = getWorld();
            w.removeObject(this);
        }
    }    
}
