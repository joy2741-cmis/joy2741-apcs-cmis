

public class LCD extends Television
{
    public LCD()
    {
        super();
        super.setModel("LCD Gold");
        super.setPrice(199.99);
    }//end zero-arg constructor

    public LCD( String initialModel, double initialPrice )
    {
        super( initialModel, initialPrice );
    }//end two-arg constructor
       
}//end class LCD
