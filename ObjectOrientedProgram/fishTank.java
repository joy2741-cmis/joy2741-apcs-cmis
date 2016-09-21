
public class fishTank
{

    private boolean fish; //true --> there's fish //false --> no fish
    private int numberOfFish;
    private String fishNumber = "#"; 
    private double tankHeight;
    private boolean clean; //true --> clean //false --> dirty

    public fishTank( boolean fish, int numberOfFish, String fishNumber )
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
        this.fishNumber = fishNumber;
        for(int i = 0; i < numberOfFish; i++ )
        {
            System.out.println("i: " +  i);
            fishNumber += "i";
        }//end for

    }//end fishTank

    public static void main( String[] args)
    {
        fishTank F1 = new fishTank(true, 3, "#");
        System.out.println(F1);
        System.out.println(F1.fish);
        System.out.println(F1.numberOfFish);
        System.out.println(F1.fishNumber);
    }//end method

}
