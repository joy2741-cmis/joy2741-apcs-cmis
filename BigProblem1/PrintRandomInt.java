
public class PrintRandomInt
{
  
    public static void main( String[] args )
    {
        int[] nums = new int[30];
        
        for( int index = 0; index < nums.length; index++ )
        {
            nums[ index ] = (int)(Math.random()*100);
            if( index == 100 )
            {
                System.out.println("STOP");
            }
           
        }
        
         for(int index = 0; index < nums.length; index++ )
            {
                System.out.println( nums[ index ] );
            }
    }
}
