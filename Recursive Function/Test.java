import java.util.Arrays;
public class Test
{
    public static void main( String[] args )
    {
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0 };
        int counter = 0;
        int[] numsCopied = Arrays.copyOf(nums, nums.length);
        int stored = 0;

        /*

        for( int i = 1; i < numsCopied.length; i++ )//run through nums
        {
        for( int j = i; counter < 2; counter++, j++ )
        {
        if( j == numsCopied.length-1 )
        {
        counter = 3;
        }
        if( numsCopied[j-1] > numsCopied[j] )
        {
        stored = numsCopied[j];
        numsCopied[j] = numsCopied[j-1];
        numsCopied[j-1] = stored;
        }
        System.out.println(numsCopied[j]);
        System.out.println("Counter: " + counter);
        }//end for
        counter = 0;
        }//end for

        for( int i = 0; i < numsCopied.length; i++ )
        {
        System.out.print(numsCopied[i] + " ");
        }//end for
         */
    }//end class
}//end class
