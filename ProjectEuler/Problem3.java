
public class Problem3
{
    public static void main ( String[] args )
    {
        //long i = 0L;
        //long num = 600851475143L;
        String factors = "";
        long i = 0L;
        long num = 100L;
        for( i = 1; i <= num; i++ )
        {
            int counter = 0;
            for( num =  i; num >= 1; num-- )
            {
                if ( i % num == 0 )
                {
                    counter = counter + 1;
                }
                
        }//end for
        if (counter == 2 )
        {
            factors = factors + i + " ";
        }
    }//end for
    System.out.println(factors);
    }//end method
}//end class
