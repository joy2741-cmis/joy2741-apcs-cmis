 

public class ProblemA
{
    public static void main( String[] args )
    {
        double[] array = new double[1000000];
        
       /* for( int index = 0; index < 1; index++ )
        {
            array[ index ] = (int)(((((Math.random()*1000000)/3)/5)/7)/11);
            
            for( index = 0; index < array.length; index++ )
            {
                System.out.println( array[index] );
        }
        */
       
       
       for (double i = 0; i < 1; i++)
       { 
           array[ i ] = (int)(Math.random()*1000000);
           
      
    if (index % 3 == 0)
    {
        System.out.println( i );
    }
    else if (index % 5 == 0)
    {
        System.out.println( i );
    }
    else if (index % 7 == 0)
    {
        System.out.println( i );
    }
    else if (index % 11 == 0)
    {
        System.out.println( i );
    }
    
   }
    
    //% == 0?
    //if divisible by # print " "
   }
}