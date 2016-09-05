

public class Problem2
{
   public static void main( String[] args )
   {
            
       int a = 1;
       int b = 2;
       int i = a + b;
       int runtime = 0;
       int sum = 2;
       
        
            
          while (sum < 4000000)
       {
                 
           for(runtime = 0; runtime > 0; runtime++)
           {
               if (runtime == 1)
                  {
                     i = a + b;
                     System.out.println(i);
                  }
           }    
                
                 a = b;
                 b = i;
                 i = a + b;
                 
                 if( i % 2 ==0)
                 {
                     sum = sum + i;
                     //System.out.println(i);
                    }
                 
                 
                                                
            }
       
            System.out.println(sum);
             
              
        }
       
    }

   
  

