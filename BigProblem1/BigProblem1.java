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
      
       
        while(runtime < maxRuntime)
        {
          
            for( i = 0, runtime = 0; runtime < maxRuntime; runtime++ )
                {
                    nums[i] = (int)(Math.random()*100);
                    System.out.println(nums[i]);
                    
                }
                 
           
            for( order = 0; order < 100; order++ )
            {
                
                /*
                 * ex. maxRuntime = 5;
                 * Generate 5 numbers into an array
                 * ex. nums[i] = {3, 84, 2, 11, 14};
                 * for loop: print order from 0-99, order++
                 *      print "order + : "
                 *          for loop: run through nums[i] (i = 0; i<nums.length; i++)
                 *               if (nums[i] is equal to order)
                 *                       --> print "#"
                 *           ex. nums[1] = 3, which is equals to order[4] --> print # 
                 *           
                 * 
                 */
                
                    System.out.println(order + ": ");  
                    
                        
            }
               
        
        }
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

