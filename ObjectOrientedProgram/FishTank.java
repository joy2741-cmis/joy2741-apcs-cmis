
public class FishTank
{

    private boolean fish; //true --> there's fish //false --> no fish
    private int numberOfFish;
    private String fishNumber = "#0"; 
    private double tankHeight;
    private boolean clean; //true --> clean //false --> dirty
    
    //public static final double[] fishLength = new double[] {80, 36, 7 }; //commoncarp, oscar, siamese fighting fish
    
    //public static final GOLDFISH = 0;

    public FishTank( boolean fish )
    {
        this.fish = fish;
        this.numberOfFish = numberOfFish;
        numberOfFish = (int)(Math.random()*10);

        this.fishNumber = fishNumber;

    }//end fishTank
    
    /*
     * 
     * 
     */

    /*
    public boolean getFish(){

    if( fish )
    {
    fish = "";
    }
    else 
    {
    fish =  "The tank is empty";
    }

    return getFish;
    }//end getter fish
     */

    public void setfish( boolean newFish )
    {
        fish = newFish;
    }// end setter fish

    public int getNumberOfFish()
    {
        return numberOfFish;
    }//end getter numberOfFish

    public void setNumberOfFish( int newNumberOfFish )
    {
        numberOfFish = newNumberOfFish;
    }//end setter numberOfFish

    public String getFishNumber()
    {

        return fishNumber;
    }//end getter fishNumber

    public void setFishNumber( String newFishNumber )
    {
        fishNumber = newFishNumber;
    }//end setter fishNumber

    public double getTankHeight()
    {
        return tankHeight;
    }//end getter tankHeight

    public void setTankHeight( double newTankHeight )
    {
        tankHeight = mewTankHeight;
    }//end setter tankHeight

    public static void main( String[] args)
    {
        FishTank F1 = new FishTank(true);
        System.out.println(F1);

    }//end method

    public String toString()
    {
        String output = "Are there any fish? " + fish + "\nNumber of Fish: " + numberOfFish + "\nFish Name: " + fishNumber + "\nTank height: " + tankHeight + "\nClean? " + clean;
        return output;
    }
}

