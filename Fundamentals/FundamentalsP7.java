

public class FundamentalsP7
{
    
    public static void main( String[] args )
    
    {
    int[] array = new int[10];
    
    for( int index = 0; index < array.length; index++ )
    {
        array[ index ] = (int)(Math.random()*201)-100;
    }
    
    /*
    for( int index = 0; index < array.length; index++ )
    {
        array[ index ] = (int)(Math.random()*-1);
    }
    */
    for( int index = 0; index < array.length; index++ )
    {
        System.out.println( array[ index ] );
    }
}
}