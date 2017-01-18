import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int wormsEaten;
    public void act() 
    {
        moveAndTurn();
        eat();
    }//end constructor

    public void moveAndTurn()
    {
        move(4);
        if( Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }//end if
        if( Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }//end if
    }//end moveAndTurn

    public void eat()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class); 
        //x and y difference from our current position
        //the third parameter --> class we're interested in
        if( worm != null )
        {
            World world;
            world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
            wormsEaten = wormsEaten + 1;
        }//end if

    }//end eat
    
    public int getWormsEaten()
    {
        return wormsEaten;
    }//end getWormsEaten
    
}  //end class  

