import java.util.Arrays;
public class MergeSort
{
    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99, 7 };                        
        int[] placementsL = Arrays.copyOf(nums, nums.length);
        int[] placementsR = Arrays.copyOf(nums, nums.length);
        split(placementsL, placementsR);
    }//end method

    public static int[][] split( int[] placementsL, int[] placementsR )
    {
        int counter = 0;
        int[] left = Arrays.copyOf(placementsL, placementsL.length/2);
        int[] right = Arrays.copyOfRange(placementsR, placementsR.length/2, placementsR.length);
        int[][] result = new int[1][1];
        for( int i = 0; i < left.length; i++ )
        {
            System.out.print(left[i] + " ");
        }//end for
        System.out.println("Right\n");
        for( int i = 0; i < right.length; i++ )
        {
            System.out.print(right[i] + " ");
        }//end for

        placementsL = Arrays.copyOf(left, left.length);
        placementsR = Arrays.copyOf(right, right.length);

        if( left.length == 1 )
        {
            for( int i = 0; i < result.length; i++ )
            {
                for( int j = 0; j < result[0].length; j++ )
                {
                    result[1][0] = left;
                }//end j
            }//end i
            return left;
        }
        else
        {
            return split(right);
        }
    }//end split
}//end MergeSort

//int[] RArray = Arrays.copyOf(nums, 1);