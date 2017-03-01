
public class Recursive
{
    public static void main( String[] args )
    {
        System.out.println(add(10,3));
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