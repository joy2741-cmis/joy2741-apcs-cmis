
public class Problem1
{
    public static void main( String[] args )
    {
        int num = 0;
        int sum = 0;
        for( num = 0; num < 1000; num++ )
        {
                        
            if( (num % 3 == 0) || (num % 5 == 0))
            {
                //System.out.println(num);
                sum = sum + num;
            }
    
        }
        
        System.out.println(sum);
   }
}
