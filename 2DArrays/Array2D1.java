
public class Array2D1
{
    public static void main( String[] args )
    {
        int[][] grid = new int[3][4];

        System.out.println("RECTANGULAR FORM");
        for( int x = 0; x < grid.length; x++ )
        {
            for( int y = 0; y < grid[0].length; y++ )
            {
                grid[x][y] = (int)(Math.random()*9);
                if ( grid[x][y] == 5 )
                {
                    System.out.print(grid[x][y] + " " + "(" + x + "," + y + ")");
                }
                else
                {
                    System.out.print(grid[x][y] + " ");
                }//end if
            }//end inner for
            System.out.println("\n");
        }//end outer for

        System.out.println("GRID");
        for( int x = 0; x < grid.length; x++ )
        {
            for( int y = 0; y < grid[0].length; y++ )
            {
                grid[x][y] = (int)(Math.random()*9);
                System.out.print(grid[x][y] + " ");

            }//end inner for
            System.out.println("\n");
        }//end outer for
    }//end main
}//end class Array2D1

/*
 * 3*4 int array
 * filled with random numbers between 0 - 9
 * print in a rectangular format
 * 
 * print row, column pair of coordinates of all instances of the number 5
 * populate the 2D array
 * print out its contents
 */