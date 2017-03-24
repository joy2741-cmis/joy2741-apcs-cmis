import java.util.Arrays;
public class Test
{
    public static void main( String[] args )
    {
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0 };
        int counter = 0;
        int[] numsCopied = Arrays.copyOf(nums, nums.length);

        for( int i = 9; i < numsCopied.length; i++ )//run through nums
        {
            for( int j = i; counter < 2; counter++, j++ )
            {
                if( j == numsCopied.length-1 )
                {
                    counter = 3;
                }
                System.out.println(numsCopied[j]);
                System.out.println("Counter: " + counter);

            }//end for
        }//end for

    }//end class
}//end class
