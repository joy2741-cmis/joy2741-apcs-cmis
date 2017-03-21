import greenfoot.*; 
import java.awt.Color;

public class CheeseBomb extends Actor
{
    private int timer = Greenfoot.getRandomNumber(100) + 950; 
    private GreenfootImage img;
    public CheeseBomb(){
        img = new GreenfootImage(25,25);
        img.setColor(Color.red);
        img.fillOval(0,0,25,25);
        setImage(img);

    }

    public void act() 
    { 
        countDown();
        /*
        if ( timer-- < 0){ //if timer decrements until less than 0, remove cheesebomb
        World w = getWorld();
        w.removeObject(this);
        }
         */
    }    

    public void countDown()
    {
        World w = getWorld();
        CheeseBomb cheeseBomb = new CheeseBomb();
        while( timer >= 0 )
        {
            if( cheeseBomb.getTimer() == 0 )
            {
                if( Greenfoot.getRandomNumber(4) == 0 )
                {
                    w.addObject(cheeseBomb,0 + Greenfoot.getRandomNumber(200), 0 - Greenfoot.getRandomNumber(100));
                }//top left
                else if( Greenfoot.getRandomNumber(4) == 1 ) 
                {
                    w.addObject(cheeseBomb,600 - Greenfoot.getRandomNumber(200), 0 -Greenfoot.getRandomNumber(100));
                }//top right
                else if( Greenfoot.getRandomNumber(4) == 2 ) 
                {
                    w.addObject(cheeseBomb,0 + Greenfoot.getRandomNumber(200), 400 - Greenfoot.getRandomNumber(100));
                }//bottom left
                else if( Greenfoot.getRandomNumber(4) == 3 ) 
                {
                    w.addObject(cheeseBomb,600 - Greenfoot.getRandomNumber(200), 400 - Greenfoot.getRandomNumber(100));
                }//bottom right
            }//end if
            timer--;
        }//end while
    }//end countDown

    public int getTimer()
    {
        return timer;
    }//end getCountDown

    public void setTimer( int newTimer )
    {
        timer = newTimer;
    }//end setCountDown

}
