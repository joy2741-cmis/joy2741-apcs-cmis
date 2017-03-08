
public class Recursion
{

    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0 };
        int[] sorted = new int[nums.length-1];
        
        sort(nums);
        for( int n : sorted )
        {
            System.out.print( n + " ");
        }//end for
    }//end method
    
    //sort
    public static int[] sort( int[] nums )
    {
        int[] sorted = new int[nums.length-1];
        int numsLength = nums.length-1;
        int max = 0;
        int pMax = 100;
        System.out.println("Num length: " + numsLength);
        for( int i = 0; i < nums.length; i++ )
        {
            if( nums[i] > max )
            {
                max = nums[i];
                for( int n = sorted.length; n > -1; n-- )
                {
                    sorted[n] = max;
                }//end for
                nums[i] = -1;
            }
        }//end for
        return sort(sorted);
    }//end sort

    //multiplication
    public static int pow( int x, int n )
    {
        if( n == 0 )
        {
            return 1;
        }
        else
        {
            return pow(x,n-1) * x;
        }//end if-else
    }//end pow

    //addition
    public static int add( int x, int n )
    {
        if( n == 0 )
        {
            return 1;
        }
        else if( n == 1 )
        {
            return x;
        }
        else
        {            
            System.out.println(x);
            x = x + x + x;
            if( n > 0)
            {
                return add(x,n);
            }
            return 1;
        }//if - else if - else        
    }//end add

}//end class