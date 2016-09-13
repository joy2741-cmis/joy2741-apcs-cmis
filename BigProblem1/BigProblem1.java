import javax.swing.JOptionPane;

public class BigProblem1
{
    public static void main( String[] args )
    {
        
        String input = JOptionPane.showInputDialog( "Type a number"  );
        int maxRuntime = Integer.parseInt(input);
        int runtime = 0;
        
       int[] nums = new int[maxRuntime];
       int i;
       int order = 0;
       
       int sum = 0;
       int avg = 0;
      
       //histogram
       for( i = 0, runtime = 0; runtime < maxRuntime; runtime++ )
       {
           nums[i] = (int)(Math.random()*100);
           System.out.print(nums[i] + " ");
           sum = sum + nums[i];
           
           
           
        }
       
        System.out.print("Test" + nums[i] + " ");
        
        /*
       while( runtime < maxRuntime)
            {
                nums[i] = (int)(Math.random()*100);
                runtime++;
                         
            }
            
          System.out.println( nums[i] );
                    
                       
                 for( order = 0; order < 100; order++ )
                            {
                                System.out.println(order + ": ");
                 
                            }
      */
     
     
            }
               
        
         
    }


/* ask the user to type a number (num)
 * generate (num) amount of random numbers between 0 and 99
 * printout every number from 0-99 with #  
 * minimum
 * maximum
 * sum
 * avg
 * mode
 * 
 * 
 */

