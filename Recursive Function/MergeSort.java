import java.util.Arrays;
public class MergeSort
{
    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99 };
        int[] placements = new int[nums.length];
        split(nums);
    }//end method

    public static int[] split( int[] nums )
    {
        int counter = 0;
        int[] numsCopied = Arrays.copyOf(nums, 1);

        for( int i = 1; i < numsCopied.length; i++ )//run through nums
        {
            for( int j = i; counter < 2; counter++, j++ )
            {
                System.out.println(numsCopied[i]);
            }//end for
        }//end for
        return nums;
    }//end split

    public static int[] sort( int[] nums )
    {        
        return nums;
    }//end sort

    public static int[] merge( int[] nums )
    {
        return nums;
    }//end merge

}//end MergeSort

//int[] RArray = Arrays.copyOf(nums, 1);