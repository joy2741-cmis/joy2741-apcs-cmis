
public class Array2D2
{
    public static void main( String[] args )
    {
        int array[][] = new int[3][5];
        int num = 1;
        int sumTotalTotal = 0;
        /*
        for( int x = 0; x < array.length; x++ )
        {
            int sumTotalRow = 0;
            for( int y = 0; y < array[0].length; y++ )
            {
                array[x][y] = num;
                if( array[x][y] > 9 )
                {
                    System.out.print(array[x][y] + " ");
                }
                else
                {
                    System.out.print(array[x][y] + "  ");
                }//end if
                num++;
                sumTotalRow+= array[x][y];
                sumTotalTotal += array[x][y];                  
            }//end inner for
            System.out.println("\nSum total (Row): " + sumTotalRow);
            System.out.println("\n");
        }//end outer for
        */
        for( int x = 0; x < array[0].length; x++ )
        {
            int sumTotalColumn = 0;
            for( int y = 0; y < array.length; y++ )
            {
                array[x][y] = num;
                if( array[x][y] > 9 )
                {
                    System.out.print(array[x][y] + " ");
                }
                else
                {
                    System.out.print(array[x][y] + "  ");
                }//end if
                num++;
                sumTotalTotal += array[x][y];                  
            }//end inner for
            System.out.println("Sum total (Column" + x + "): " + sumTotalColumn);
            System.out.println("\n");
        }//end outer for
        System.out.println("\nSum total: " + sumTotalTotal);
    }//end main
}//end class
