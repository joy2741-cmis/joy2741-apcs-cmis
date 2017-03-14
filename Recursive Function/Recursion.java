
public class Recursion
{

    public static void main( String[] args )
    {       
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99 };
        //bubbleSort(nums);
        bubbleSortNotRecursive(nums);
        for( int i = 0; i < nums.length; i++ )
        {
            System.out.print( nums[i] + " ");
        }//end for
    }//end method

    public static int[] bubbleSort( int[] nums )
    {
        int stored = 0;
        int counter = 0;
        boolean sorted = true;

        for( int j = 1; j < nums.length; j++ )//run through array
        {
            for( int i = j; counter < 2; counter++ )//two numbers
            {
                if( nums[i-1] > nums[i] )//compare nums[i] to the previous number
                {
                    stored = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = stored;
                }//end if
            }//end for

            for( int n = 0; n < nums.length; n++ )
            {
                System.out.print(nums[n] + " ");
            }//end for
            counter = 0;
            System.out.println();
        }//end for

        return bubbleSort(nums);
    }//end bubbleSort

    public static int[] bubbleSortNotRecursive( int[] nums )
    {
        int stored = 0;
        for( int j = 0; j < nums.length; j++ )
        {
            for( int i = 1; i < nums.length-j; i++ )
            {
                if( nums[i-1] > nums[i] )
                {
                    stored = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = stored;
                }//end if
            }//end for
        }//end for
        return nums;
    }//end bubbleSortNotRecursive

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