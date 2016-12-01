
public class Plasma extends Television
{
    public Plasma()
    {
        super();
        super.setModel("Plasma Sapphire");
        super.setPrice(499.99);
    }//end zero-arg constructor

    public Plasma( String initialModel, double initialPrice )
    {
        super( initialModel, initialPrice );
    }//end two-arg constructor
       
}//end class Plasma
