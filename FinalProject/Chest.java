import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest extends Actor
{
    /**
     * Act - do whatever the Chest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Chest()
    {
        GreenfootImage boss = getImage();
        boss.scale( boss.getWidth()/8, boss.getHeight()/8 );
    }//end constructor

    public void act() 
    {
        // Add your action code here.
    }    

    public static void main( String[] args )
    {
        String choice1 = "Health and mana are fully restored";
        String choice2 = "Gained additional damage";
        String choice3 = "Better luck next time";

        int randomNum = Greenfoot.getRandomNumber(2);
        if( randomNum == 0 )
        {
            System.out.println(choice1);
        }
        else if( randomNum == 1 )
        {
            System.out.println(choice2);
        }
        else
        {
            System.out.println(choice3);
        }

    }//end static main
}
