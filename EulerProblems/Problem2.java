

public class Problem2
{
   public static void main( String[] args )
   {
       /*String sequence = "123";
       char[] seqArray = sequence.toCharArray();*/
       
      
       int a = 1;
       int b = 2;
       int i = a + b;
            
            while (i < 4000000)
       {
                   
                for( a = 1; a < 4000000; a++ )
                {
                    System.out.println(a);
                    a = b;
                    System.out.println(a);
                }
             
                for( b = 2; b < 4000000; b++ )
                {
                    System.out.println(b);
                    b = i;
                    System.out.println(b);
                }
             
           
        }
       
        /*
         * a + b = i
         * a then has the same value as b --> a2 = b1
         * b then has the same value as i --> b2 = i1
         * a2 + b2 = i2 
         * 
         * 
         * 
         * 
         * 
         * 
         */
       
       
       
      
       
       
       
    }
   
  
}
