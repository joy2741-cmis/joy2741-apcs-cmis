
public class fishTank
{

    private boolean fish; //true --> there's fish //false --> no fish
    private int numberOfFish;
    private String fishNumber = "#0"; 
    private double tankHeight;
    private boolean clean; //true --> clean //false --> dirty

    public fishTank( boolean fish )
    {
        this.fish = fish;
        if (  numberOfFish > 0)
        {
            this.fish = true;
        }
        else
        {
            this.fish = false;
        }//end if
        this.numberOfFish = numberOfFish;
        numberOfFish = (int)(Math.random()*10);

        this.fishNumber = fishNumber;
        /*
        for()
        {
            
        }//end for       
        
        String fishName = fishNumber + numberOfFish;
        */

    }//end fishTank

    public static void main( String[] args)
    {
        fishTank F1 = new fishTank(true);
        System.out.println(F1);
        //System.out.println(F1.fish);
        //System.out.println(F1.numberOfFish);
        //System.out.println(F1.fishNumber);
    }//end method

    public String toString()
    {
        String output = "Fish? " + fish + "\nNumber of Fish: " + numberOfFish + "\nFish Name: " + fishNumber + "\nTank height: " + tankHeight + "\nClean? " + clean;
        return output;
    }
}
