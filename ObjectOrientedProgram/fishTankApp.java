
public class fishTankApp
{         
    
    public static void main( String[] args)
    {
        FishTank F1 = new FishTank("Bob");
        System.out.println(F1);
        System.out.println("H: " + F1.getTankHeight() + "cm");
        System.out.println("W: " + F1.getTankWidth() + "cm");
        //System.out.println(F1.fish);
        System.out.println("#: " + F1.getNumberOfFish());
        //System.out.println(F1.fishNumber);
        System.out.println(F1.equals(F1));
    }//end method
    
}
