import greenfoot.*;
import java.util.*;
public class Rat extends Actor
{
    private int direction;
    private int eaten;
    private boolean cheeseEaten = false;

    public Rat(){
        direction = Greenfoot.getRandomNumber(4);
        getImage().scale(50,25);
        eaten = 0; //how many cheese
    }

    public void act() 
    {
        eat();
        Cheese closest = getTargetCheese(200); 
        //check for cheese within the range(200)
        if(closest == null){
            wander();
            //if there's no cheese, move randomly
        } else{
            moveTowardCheese(closest);
            //else, move towards the closest cheese
        }
        if( eaten == 3 )
        {
            addRat();
        }//end if
        die();//if touches trap, dies
    }   

    public void wander(){ //move randomly
        if(Math.random() > 0.95){
            //Math.random() = 0.0-1.0 //if more than 0.95
            direction = Greenfoot.getRandomNumber(4);
            //get 0-3
        }
        int dx = 0;
        int dy = 0;
        if ( direction == 0 ){ //up
            dy = -1;
        } else if ( direction == 1 ){ //down
            dy = 1;
        } else if ( direction == 2 ){ //left
            dx = -1;
        } else if ( direction == 3 ){ //right
            dx = 1;
        }

        setLocation(getX() + dx, getY() + dy); //change direction
    }

    public void increaseRisk()
    {
        int num = Greenfoot.getRandomNumber(1000);
        if( num == 1 )
        {
            MyWorld w = (MyWorld)getWorld();
            w.addObject(new RatDisease(), getX(), getY());
        }
    }//end increaseRisk

    public void moveTowardCheese(Cheese cheese){
        int dx = 0;
        int dy = 0;
        int cheeseX = cheese.getX();
        int cheeseY = cheese.getY();
        int x = getX();
        int y = getY();

        if ( x < cheeseX ){//if cheese is to the right, move right
            dx = 1;
        }else if ( x > cheeseX){//if cheese is to the left, move left
            dx = -1;
        }

        if ( y < cheeseY ){//if cheese is down, move down
            dy = 1;
        }else if ( y > cheeseY ){//if cheese is up, move up
            dy = -1;
        }
        setLocation(x + dx, y + dy);//move
    }

    public Cheese getTargetCheese(int range){ //check for cheese to pick up
        Cheese target = null; //set target to none
        List<Cheese> cheeses = getObjectsInRange(range, Cheese.class);
        if (cheeses.size() == 0){
            target = null;
            //if there's no cheese in the array, no target
        }else if( cheeses.size() >= 1 ){
            target = cheeses.get(0);
            //if there's cheese in the array, get the first one
        } 
        return target; //return no cheese or the closet cheese
    }

    public void eat(){
        Cheese cheese = (Cheese)getOneIntersectingObject(Cheese.class); //touching a cheese
        if( cheese != null){ //if there's cheese
            World w = getWorld();
            w.removeObject(cheese); //remove cheese
            eaten++; //increment eaten
        }
        cheeseEaten = true;
    }

    public void die(){
        if(isTouching(Trap.class)){ //if rat touches trap
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this); 
            w.score(); //calculate score
        }
    }

    public void addRat(){
        MyWorld w = (MyWorld)getWorld();
        w.addObject(new Rat(), getX(), getY());
        eaten = 0;
    }//end addRat
}
