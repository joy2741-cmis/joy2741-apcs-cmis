
public class Problem7
{
    public static void main( String[] args )
    {
        int i = 0;
        int order = 0;
        
        for(i = 7; order < 9998; i++)
        {
            
            
           if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 )
           {
               order++;
               System.out.println("Order " + order);
               System.out.println(i);
             
                  
           }
            
            }
            
        }
            
        
        
    }



/*
 * i is not divisible by 2, 3, 5
 * make i = 7;
 * 10 001 - 3 = 9998
 * 
 */