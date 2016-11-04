
public class Test
{
    public static void main( String[] args )
    {
        int grid[][] = new int[][] {{ 0, 1, 2, 3, 4}, { 5, 6, 7, 8, 9}, { 10, 11, 12, 13, 14}};

        for ( int y = 0; y < grid.length; y++ )
        {
            for( int x = 0; x < grid[y].length; x++ )
            {
                System.out.println(grid[y][x]);
            }//end for x
        }//end for y

        /*
        for ( int y = 0; y < grid.length; y++ )
        {
        for( int i = 0; i < grid.length; i++ )
        {
        System.out.println(grid[y][i]);
        }
        for( int x = 0; x < grid[y].length; x++ )
        {
        System.out.println(grid[x]);
        }//end for x
        }//end for y
         */
              

        

    }//end main
}//end test
