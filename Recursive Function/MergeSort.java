
public class MergeSort
{
    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99 };
        int[] right = new int[nums.length/2];        
        int[] leftE = new int[nums.length/2]; //even
        int[] leftO = new int[(nums.length/2)+1];

        if( nums.length % 2 != 0 ) 
        {
            split(nums,leftO,right);//odd            
            for( int i = 0; i < leftO.length; i++ )
            {
                System.out.print( leftO[i] + " ");
            }//end for
        }
        else
        {
            split(nums,leftE,right);//even
            for( int i = 0; i < leftE.length; i++ )
            {
                System.out.print( leftE[i] + " ");
            }//end for
        }//end if-else

    }//end method

    public static int[] split( int[] nums, int[] left, int[] right )
    {
        int i = 0;
        for( int x = 0; x < left.length; x++, i++ )
        {
            left[x] = nums[i];
        }//end for
        return left;

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
