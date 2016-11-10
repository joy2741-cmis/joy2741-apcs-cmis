import javax.swing.JOptionPane;
public class Array2D4
{
    public static void main( String[] args )
    {

        int inputRow = Integer.parseInt(JOptionPane.showInputDialog("Row: "));
        int inputColumn = Integer.parseInt(JOptionPane.showInputDialog("Column: "));
        int inputCharType = Integer.parseInt(JOptionPane.showInputDialog("1) Uppercase \n2) Lowercase \n3 Digits"));
        char[][] alphabet = new  char[inputRow][inputColumn];
        char a = 0;
        int runtime = 0;

        /*
        if ( runtime == 0 )
        {
        System.out.print(alphabet[x][y] + "  ");
        runtime++;
        a++;
        }
        else if ( runtime == 1 )
        {
        System.out.print("  " + alphabet[x][y]);
        runtime--;
        a++;
        }
         */
        if ( inputCharType == 1 ) //Uppercase
        {
            for ( int x = 0; x < alphabet.length; x++ )
            {
                a = 65;
                for( int y = 0; y < alphabet[0].length; y++ )
                {
                    if ( a > 90 )
                    {
                        x = alphabet.length + 1;
                    }//end if
                    else
                    {
                        alphabet[x][y] = a;
                        System.out.print(alphabet[x][y] + " ");
                        a++;
                    }//end else

                }//end inner for
                System.out.println("\n");
            }//end outer for
        }
        else if ( inputCharType == 2 ) //Lowercase
        {
            for ( int x = 0; x < alphabet.length; x++ )
            {
                a = 97;
                for( int y = 0; y < alphabet[0].length; y++ )
                {
                    if ( a > 122 )
                    {
                        x = alphabet.length + 1;
                    }//end if
                    else
                    {
                        alphabet[x][y] = a;
                        System.out.print(alphabet[x][y] + " ");
                        a++;
                    }//end else

                }//end inner for
                System.out.println("\n");
            } //end outer for
        }//end else if
        else if ( inputCharType == 3 ) //digits
        {
            for ( int x = 0; x < alphabet.length; x++ )
            {
                a = 0;
                for( int y = 0; y < alphabet[0].length; y++ )
                {
                    if ( a > 26 )
                    {
                        x = alphabet.length + 1;
                    }//end if
                    else
                    {
                        alphabet[x][y] = a;
                        //int i = Character.getNumericValue(alphabet[x][y].charAt(a));
                        //System.out.print(i + " ");
                        a++;
                    }//end else

                }//end inner for
                System.out.println("\n");
            } //end outer for
        }//end else if

    }//end main
}//end class
