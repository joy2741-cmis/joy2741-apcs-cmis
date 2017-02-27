
public class Recursive
{
    public static void main( String[] args )
    {
        System.out.println(add(2,4));
    }//end method

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
        else
        {
            return add(x, n*2) + x;
        }//end if-else
    }//end add

}//end class
/*
x   x^n 
2   2^1   2
2   4     2+2
2   8     2+2+2+2
2   16    2+2+2+2+2+2+2+2
 */