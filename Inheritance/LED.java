
public class LED extends Television
{
    public LED()
    {
        super();
        super.setModel("LED Platinum");
        super.setPrice(399.99);
    }//end zero-arg constructor

    public LED( String initialModel, double initialPrice )
    {
        super( initialModel, initialPrice );
    }//end two-arg constructor
       
}//end class Plasma
