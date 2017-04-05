
public class Insertion
{
    public static void main( String[] args )
    {
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99, 7 }; 
    }//end main

    public int[] insertion( int[] nums )
    {
        for( int scIndex = 1; scIndex < nums.length-1; scIndex++ )
        {
            int selectedNum = nums[scIndex];
            if( nums[scIndex] > nums[scIndex+1] )
            {
                for( int i = 0; i < scIndex; i++ ) //loop through the sorted array
                {
                    if( selectedNum < nums[i] )
                    {

                    }
                }//end inner for
            }//end if
        }//end outer for
        return nums;
    }//end insertion
}//end class

/*
 * outer for-loop --> index where the selected card is
 * conditions:
 * if the card in front is zero --> insert card --> increment 
 * if the selected card is more than the card before --> insert card --> increment
 * if the selected card is less than the card before --> go through the inner for loop --> increment
 * 
 * inner for-loop
 * loop through the sorted array
 * if the next number is more than the selected card, move everything to the right --> insert the card
 */