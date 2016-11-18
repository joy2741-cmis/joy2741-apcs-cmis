
public class Problem29
{
    public static void main( String[] args )
    {
        int[][] nums = new int[6][6]; //length + 2 b/c x = 2
        int terms = 0;

        for( int x = 2; x < nums.length; x++ )
        {
            for( int y = 2; y < nums[x].length; y++ )
            {
                nums[x][y] = (int)(Math.pow(x,y));
                System.out.print(nums[x][y] + " (" + x + ", " + y + ")   ");
                terms++;
            }//end for y
            System.out.println("\n");
        }//end for x

        System.out.println("Distinct terms: " + terms);

        for( int x = 2; x < nums.length; x++ )
        {
            for( int y = 2; y < nums.length; y++ )
            {
                System.out.print(nums[x][y] + " (" + x + ", " + y + ")   "); 
            }//end for y
            System.out.println("\n");
        }//end for x

    }//end method
}

/*
 * for loop math.power(a,i) a = 2, i = 2, i<100, i++
 * when i = 99, a++
 * for loop math.power(a,i) a < 100
 * 
 * result of each add to array
 * int[] array(1000)
 * print("i: " + array[i]) if array[i] != null
 * 
 * use BigInterger ;-;
 */