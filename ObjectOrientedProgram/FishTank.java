
public class FishTank
{

    private boolean fish; //true --> there's fish //false --> no fish
    private int numberOfFish;
    private String fishNumber = "#0"; 
    private double tankHeight;
    private boolean clean; //true --> clean //false --> dirty
    private String name;

    public static final double[] fishLength = new double[] {80, 36, 7}; //commoncarp, oscar, siamese fighting fish
    public static final int COMMONCARP = 1;
    public static final int OSCAR = 2;
    public static final int SIAMESE = 3;

    public FishTank( String name )
    {
        this.fish = fish;
        this.numberOfFish = numberOfFish;
        this.fishNumber = fishNumber;

    }//end fishTank

    public boolean getFish()
    {
        return fish;
    }//end getter fish

    public int getNumberOfFish()
    {
        numberOfFish = (int)(Math.random()*20);
        return numberOfFish;
    }

    public void setfish( boolean newFish )
    {
        fish = newFish;
    }// end setter fish

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
        tankHeight = newTankHeight;
    }//end setter tankHeight

    public static void main( String[] args)
    {
        FishTank F1 = new FishTank("true");
        System.out.println(F1);
        System.out.println(F1.numberOfFish);

    }//end method

    public String toString()
    {
        String output = "Are there any fish? " + fish + "\nNumber of Fish: " + numberOfFish + "\nFish Name: " + fishNumber + "\nTank height: " + tankHeight + "\nClean? " + clean;

        return output;
    }//end string
}

