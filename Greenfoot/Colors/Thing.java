import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Thing extends Actor
{
    private GreenfootImage img,oval;

    public Thing(){
        //Colors
        Color pastelPurple = new Color(0xD0B3E1);
        Color pastelPink = new Color(0xFFDDDD);
        Color pastelGreen = new Color(0xB9E3AE);
        Color pastelBrown = new Color(0xCBAB8D);
        Color pastelYellow = new Color(0xFFFF88);

        //Square
        img = new GreenfootImage(300,300);
        img.setColor(pastelBrown);
        img.fill();

        //Pink Lines
        img.setColor(pastelPink);
        //vertical
        img.fillRect(0, 0, 5, 300);
        img.fillRect(50, 0, 5, 300);
        img.fillRect(100, 0, 5, 300);
        img.fillRect(150, 0, 5, 300);
        img.fillRect(200, 0, 5, 300);
        img.fillRect(250, 0, 5, 300);
        //horizontal
        img.fillRect(0,50,300,5);
        img.fillRect(0,100,300,5);
        img.fillRect(0,150,300,5);
        img.fillRect(0,200,300,5);
        img.fillRect(0,250,300,5);

        //Green Lines
        img.setColor(pastelGreen);
        //vertical
        img.fillRect(40, 0, 3, 300);
        img.fillRect(90, 0, 3, 300);
        img.fillRect(140, 0, 3, 300);
        img.fillRect(190, 0, 3, 300);
        img.fillRect(240, 0, 3, 300);
        img.fillRect(290, 0, 3, 300);
        //horizontal
        img.setColor(pastelYellow);
        img.fillRect(0,40,300,3);
        img.fillRect(0,90,300,3);
        img.fillRect(0,140,300,3);
        img.fillRect(0,190,300,3);
        img.fillRect(0,240,300,3);
        img.fillRect(0,290,300,3);

        //Oval
        
        img.drawOval(12,12,25,25);
        oval = new GreenfootImage(img);
        oval.setColor(pastelPurple);
        oval.fillOval(12,12,25,25);

        //img.fillRect(12,12,25,25);
        //img.fillOval(12,12,25,25);
        //alt.setColor(pastelPink);
        //alt.drawRect(10,10, 29,29);

        setImage(img);
    }

    public void act() 
    {
        changeImage();
    }    

    public void changeImage(){
        
    }
}
