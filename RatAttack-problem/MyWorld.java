import greenfoot.*; 
import java.util.*;
public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private int level = 1;
    private int score = 0;
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
    }

    public void init(int level){
        List<Actor> actors = getObjects(null); //empty ArrayList
        for(Actor a: actors){// (int a = 0; a < actors.length; a++)
            removeObject(a); //remove previous actors
        }
        for(int i=0; i<level; i++){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
            //add rat according to lvl
        }
        addObject(new Exterminator(), 520, 200);//add exterminator
        addObject(new Trap(), 550, 200);//add trap(skull)
        startTime = System.currentTimeMillis();//get current time       

    }

    public void addRat(){
        runningTime = System.currentTimeMillis() - startTime;
        if( (runningTime/1000.0) == 15.0 )
        {
            addObject(new Rat(), 100,100 );
        }//end if
    }//end addRat

    public void addCheeseBomb()
    {
        CheeseBomb cheeseBomb = new CheeseBomb();
        cheeseBomb.countDown();
        cheeseBomb.setTimer(Greenfoot.getRandomNumber(100) + 950);
    }//end addCheeseBomb

    public void act(){
        runningTime = System.currentTimeMillis() - startTime;
        //running time = current time - time at the start of the game
        if(getObjects(Rat.class).size() == 0){
            init(level++);//when there's no more rat, level up
        }
        showText(score+"  "+(int)(15 -(runningTime/1000.0)), 50, 50);
        //15 is the limit
        //runningTime/1000 convert millisecond to second        
        addRat();
        addCheeseBomb();
    }

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);//add cheese
    }

    public void score(){
        score++;//add score
    }

    public void lose(){
        showText("Game Over!!", 300, 200);//game over
        Greenfoot.stop();//game stops
    }
}
