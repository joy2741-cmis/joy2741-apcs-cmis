import javax.swing.JOptionPane;

public class FundamentalsP3
{
public static void main( String[] args)
{
    String input = JOptionPane.showInputDialog( "Pick a number" );
    
    int num = Integer.parseInt( input );
    
    if ( num % 2 == 0)
    {
        System.out.println( input + " is an even number ");
    }
    else
    {
        System.out.println( input + " is an odd number ");
    
    

    }
}
}
