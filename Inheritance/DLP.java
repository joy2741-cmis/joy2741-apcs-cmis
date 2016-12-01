
public class DLP extends Television
{
    public DLP()
    {
        super();
        super.setModel("DLP Silver");
        super.setPrice(99.99);
    }//end zero-arg constructor

    public DLP( String initialModel, double initialPrice )
    {
        super( initialModel, initialPrice );
    }//end two-arg constructor
       
}//end class DLP
