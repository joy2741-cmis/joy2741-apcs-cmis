public class ProblemA
{
    public static void main( String[] args )
    {
        int[] array = new int[1000000];
            
       
       for ( int index = 0; index < 1; index++)
       { 
           array[ index ] = (int)(Math.random()*array.length);
           
      
   if (index % 3 == 0 && index % 5 == 0 && index % 7 == 0 && index % 11 == 0)
   {
        System.out.println( array[ index ] );
    }
  
    else
    {
        System.out.println( "try again" );
    
   }
    
   
   }
   }
}