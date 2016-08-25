

public class FundamentalsP6
{

    public static void main( String[] args )
    {
        int[] nums = new int[50];
        
        for( int index = 0; index < nums.length; index++ )
        {
            nums[ index ] = (int)(Math.random()*100);
        }
        
        for( int index = 0; index < nums.length; index++ )
        {
            System.out.print( nums[ index ] + " ");
    }
}
}
