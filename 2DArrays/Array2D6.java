import javax.swing.JOptionPane;
public class Array2D6
{
    public static void main( String[] args )
    {
        String lastName = JOptionPane.showInputDialog("Last name: ");
        String lastNameLowerCase = lastName.toLowerCase();
        //String password = JOptionPane.showInputDialog("Create a new password: ");
        //String passwordLowerCase = password.toLowerCase();

        char[] lastNameChar = lastNameLowerCase.toCharArray();
        char firstLetter = lastNameChar[0];
        char secondLetter = lastNameChar[1];

        boolean passwordValid = true;

        int order = 0;
        int index = 0;

        //Find the start of substring
        
        while ( index < 1 )
        {
            String password = JOptionPane.showInputDialog("Create a new password: ");
            String passwordLowerCase = password.toLowerCase();
            char[] passwordChar = passwordLowerCase.toCharArray();
            for( int i = 0; i < passwordChar.length; i++ )
            {
                if( passwordChar[i] == firstLetter )
                {
                    if( passwordChar[i+1] == secondLetter )
                    {
                        //System.out.println(lastNameLowerCase);
                        //System.out.println(passwordLowerCase);
                        order = i + 1;
                        int idx = order - 1;
                        //System.out.println("Order: " + order);
                        if ( passwordLowerCase.substring(idx, idx + lastNameChar.length).equals( lastNameLowerCase ))
                        {
                            System.out.println("Invalid password");
                            passwordValid = false;
                            index = 0;
                        }//end if
                        else
                        {
                            index = 1;
                        }//end else
                    }//end if secondLetter
                }//end if firstLetter
            }//end for
        }//end while
        if ( passwordValid == true )
        {
            System.out.println("Successfully created a password");
        }//end if

    }//end main
}//end class
