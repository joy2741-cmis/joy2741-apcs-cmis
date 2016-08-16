import javax.swing.JOptionPane;

public class FundamentalsP2
{
    public static void main( String[] args)
    {
     
    
        
    String input1 = JOptionPane.showInputDialog( "Pick a number" );
    String input2 = JOptionPane.showInputDialog( "Pick another number" );
    
    int a = Integer.parseInt( input1 );
    int b = Integer.parseInt( input2 );
    
     
    
    if( a < b ) 
    {
        System.out.println( "The value of a is " + input1 + " and it is less than b whose value is " + input2);
    }
    else if ( a == b)
    {
        System.out.println( "The value of a is " + input1 + " and it is equal to b whose value is " + input2);
    }
    else
    {
        System.out.println( "The value of a is " + input1 + " and it is more than b whose value is " + input2);
    
    }
    
}
}
