 


public class MyCar extends Vehicle implements Connectable, Discountable
{
    public MyCar()
    {
        super( 4 );
    }
    
    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
    }//end connectToBluetooth
    
    public void applyDiscount()
    {
        System.out.println("10% discount");
    }//end apply Discount
}
