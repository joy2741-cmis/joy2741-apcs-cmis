import javax.swing.JOptionPane;
class Array2D3
{
    public static void main( String[] args )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Number: "));

        int table[][] = new int[input+1][input+1];

        for( int x = 0; x < table.length; x++ )
        {
            for( int y = 0; y < table[0].length; y++ )
            {
                table[x][y] = x * y;
                if ( table[x][y] == 0 )
                {

                }
                else if ( table[x][y] > 9 )
                {
                    System.out.print(table[x][y] + "  ");
                }
                else
                {
                    System.out.print(table[x][y] + "   ");
                }

            }//end inner for
            System.out.println("\n");
        }//end outer for
    }//end main
}//end class
    //in the first row --> print out x
    //in the first column --> print out y