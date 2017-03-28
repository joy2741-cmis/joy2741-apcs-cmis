import java.util.Arrays;
public class MergeSort
{
    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99, 7 };
        int[] placements = new int[nums.length];
        split(nums);
    }//end method

    public static int[] split( int[] nums )
    {
        int counter = 0;
        int[] left = Arrays.copyOf(nums, nums.length/2);
        int[] right = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        for( int i = 0; i < numsCopied.length; i++ )//run through nums
        {
            System.out.print(numsCopied[i] + " ");
        }//end for
        System.out.println();
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