
public class Array2D2
{
    public static void main( String[] args )
    {
        int array[][] = new int[3][5];
        
        for( int x = 0; x < array.length; x++ )
        {
            for( int y = 0; y < array[0].length; y++ )
            {
                array[x][y]++;
                System.out.println(array[x][y]);
                //array[x][y]++;
            }//end inner for
        }//end outer for
    }//end main
}//end class

/*
 * 1 - 15 in row-major
 */