import javax.swing.JOptionPane;
public class Problem4
{
    public static void main( String[] args )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Number: "));

        int table[][] = new int[input][input];

        for( int x = 0; x < table.length; x++ )
        {
            for( int y = 0; y < table[0].length; y++ )
            {
                if ( x == 0 )
                {
                    table[0][y] = y;
                    System.out.print(table[x][y] + "   " );
                }
                else if ( y == 0 )
                {
                    table[x][0] = x;
                    System.out.print(table[x][y] + "   " );
                }
                else if ( table[x][y] > 500 )
                {
                    table[x][y] = x * y;
                    System.out.print(table[x][y] + "   " );
                }
                else
                {
                    table[x][y] = x * y;
                    System.out.print(table[x][y] + "   " );

                }
            }//end inner for
            System.out.println("\n");
        }//end outer for
    }//end main
}//end class
//in the first row --> print out x
//in the first column --> print out y

