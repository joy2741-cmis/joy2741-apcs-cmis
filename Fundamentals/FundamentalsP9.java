import javax.swing.JOptionPane;

public class FundamentalsP9
{
   
    public static void main( String[] args )
    {
        String username = JOptionPane.showInputDialog( "Username:" );
        String passwordInput = JOptionPane.showInputDialog( "Password:" );
        
        int password = Integer.parseInt( passwordInput );
        
        if( username.equals( "username" ) && password == 1234 )
            {
                System.out.println(" You have successfully logged in " );
                }
                else
            {
                System.out.println(" Login unsuccessful...try again " );
            }
                
      
            
            
        
    }
}
