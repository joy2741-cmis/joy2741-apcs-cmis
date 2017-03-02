
public class Test
{
    public static void main( String[] args )
    {
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0 };
        int max = 0;
        int pMax = 100;
        int[] sorted = new int[nums.length];

        for( int n = sorted.length; n > 0; n-- )
        {       
            max = -1;
            for( int i = 0; i < nums.length; i++ )
            {
                if( nums[i] > max && nums[i] > pMax )
                {
                    System.out.println("TMax " + nums[i]);
                    max = nums[i];                    
                }
                pMax = max;
                System.out.println("pMax: " + pMax);
            }//end method
            sorted[sorted.length-1] = max;
        }//end for

        System.out.println("\nSORTED");
        for( int i = 0; i < sorted.length; i++ )
        {
            System.out.println("n: " + i + " num: " + sorted[i]);
        }//end for

    }//end class
}//end class
