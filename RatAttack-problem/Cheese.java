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
        freshness = 500 + Greenfoot.getRandomNumber(500); //min 500 max 1000
        setImage(img);
    }

    public void act(){
    }

    public boolean isRotten(){
        return freshness < 0; //if less than 0, then it is rotten
    }

}
