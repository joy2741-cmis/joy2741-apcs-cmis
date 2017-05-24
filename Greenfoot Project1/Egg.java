import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoySauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    Actor target;
    int speed = 1;
    int num;

    public Egg()
    {        
        GreenfootImage gudetama = getImage();
        gudetama.scale( gudetama.getWidth()-150, gudetama.getHeight()-71); 
        this.target = target;
        this.speed = speed;
    }//end Gudetama

    public void act() 
    {
        move();
        absorbSoySauce();
    }    

    public void move()
    {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation(getX(), getY()-3);
        }
        else if( Greenfoot.isKeyDown("s") )
        {
            setLocation(getX(), getY()+3);
        }
        else if( Greenfoot.isKeyDown("a") )
        {
            setLocation(getX()-3, getY());
        }
        else if( Greenfoot.isKeyDown("d") )
        {
            setLocation(getX()+3, getY());
        }//end if
    }//end move

    public void absorbSoySauce()
    {        
        if( isTouching(SoySauce.class) )
        {
            removeTouching(SoySauce.class);
            MyWorld world = (MyWorld) getWorld();
            Score score = world.getScore();
            score.increment();
        }//end if
    }//end pokeGudetama
}
