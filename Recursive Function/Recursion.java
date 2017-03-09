
public class Recursion
{

    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0 };
        for( int i = 0; i < nums.length; i++ )
        {
            System.out.print( nums[i] + " ");
        }//end for
    }//end method

    /*
    public static int[] sort( int[] nums )
    {
    int[] sorted = new int[nums.length-1];
    int min = 100;
    for( int i = 0; i < nums.length; i++ ) //find min
    {
    int num = nums[i];
    if( num != -1 )
    {
    if( num < min )
    {
    min = num;
    num = -1;
    }//end if
    }//end if
    }//end for

    for( int idx = 0; idx < nums.length; idx++ ) //add to array
    {
    if( sorted[idx] == 0 )
    {

    }//end if
    }//end for
    return sort(nums);
    }//end sort

     */

    public static int[] bubbleSort( int[] nums )
    {
        int stored = 0;
        for( int i = 0; i < 2; i++ )
        {
            if( nums[i] < nums[i+1] )
            {
                stored = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = stored;
            }//end if
        }//end for
        return bubbleSort(nums);
    }//end bubbleSort

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