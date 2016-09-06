
public class Problem6
{
   public static void main( String[] args )
   {
       int i = 0;
       int num1 = 0;
       int sum1 = 0;
       int sum2 = 0;
       int sum2Squared = 0;
       int difference = 0;
       
       
       //Sum of the squares of the first one hundred natural numbers
           for(i = 1; i < 101; i++)
           {
               //System.out.println(i);                 
               num1 = i*i;
               //System.out.println("Squared" + num1);
               sum1 = sum1 + num1;
               
                                                 
            }
        System.out.println(sum1);  
       
       
            for(i = 1; i < 101; i++ )
            {
               //System.out.println(i);
               sum2 = sum2 + i;
               //System.out.println("Sum " + sum2);
               
            }
       //System.out.println(sum2);
       
       sum2Squared = sum2 * sum2;
       System.out.println(sum2Squared);
       
       difference = sum2Squared - sum1;
       System.out.println(difference);
            
            
   }
 }


