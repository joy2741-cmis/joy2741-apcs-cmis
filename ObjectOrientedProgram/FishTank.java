
public class FishTank
{

    private boolean fish; //true --> there's fish //false --> no fish
    private int numberOfFish;
    private String fishNumber = "#0"; 
    private double tankHeight;
    private double tankWidth;
    private double tankDepth;
    private int tankVolume;
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
    
    public double getTankHeight()
    {        
        return tankHeight;
    }//end getter tankHeight
    
    public void setTankHeight( double TankHeight )
    {
        tankHeight = (Math.random()*50)+5;
    }//end setter tankHeight
    
    public double getTankWidth()
    {
        return tankWidth;
    }//end getter tankWidth
     
    public void setTankWidth( double TankWidth )
    {
        tankWidth = (Math.random()*50)+5;
    }//end setter tankWidth
        
        public int getNumberOfFish()
    {
        numberOfFish = (int)(Math.random()*20);
        return numberOfFish;
    }
    
    public boolean equals(FishTank other)
    {
        if( this.numberOfFish == other.numberOfFish)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }//end equals Fish
    
    /*
    public boolean getFish()
    {
        String fishCheck;
        
        if( numberOfFish > 0)
        {
            fishCheck = "The tank is empty.";
        }
        else
        {
            fishCheck = "The tank is not empty.";
        }//end ifelse
        //return;
        //return fishCheck;
    }//end getter fish
    
    */
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
     
    
    public static void main( String[] args)
    {
        FishTank F1 = new FishTank("true");
        System.out.println(F1);
        System.out.println(F1.numberOfFish);
    }//end method
    
    /*
    public String toString()
    {
        String output = "Are there any fish? " + fish + "\nNumber of Fish: " + numberOfFish + "\nFish Name: " + fishNumber + "\nTank height: " + tankHeight + "\nClean? " + clean;
        return output;
    }//end string
    */
}

