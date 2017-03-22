import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Cheese extends Actor
{
    private int freshness;
    private GreenfootImage img;

    public Cheese(){
        img = new GreenfootImage(20, 20);
        img.setColor(Color.yellow);
        img.fill();
        setImage(img);
        freshness = 500 + Greenfoot.getRandomNumber(500); //min 500 max 1000
    }

    public void act(){
        freshness();
    }    

    public void freshness(){        
        System.out.println("F: " + freshness);
        freshness--;
        //while( freshness > 0 )
        //{
            if( freshness <= freshness/2 )
            {
                img.setColor(Color.green);
                img.fill();
                setImage(img);
            }
            else if( freshness <= ((75/100)*freshness ))
            {
                img.setColor(Color.red); //dark green
                img.fill();
                setImage(img);
            }
            else if( freshness <= ((87/100)*freshness ))
            {
                img.setColor(Color.black);
                img.fill();
                setImage(img);
            }
            else if( freshness == 0 )
            {
                MyWorld w = (MyWorld)getWorld();
                w.removeObject(this); //remove world
            }
       // }//end while //number 4
    }//end freshness

    public boolean isRotten(){
        return freshness < 0; //if less than 0, then it is rotten
    }

}
