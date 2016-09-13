import javax.swing.JOptionPane;

public class BigProblem1
{
    public static void main( String[] args )
    {
        
        String input = JOptionPane.showInputDialog( "Type a number");
        int maxRuntime = Integer.parseInt(input);
        int runtime = 0;
        
       int[] nums = new int[maxRuntime];
       int i = 0;
       
              
        
       
        System.out.println("Histogram");
    
       
            for( runtime = 0; runtime < 100; runtime++)
            {
                
                for( runtime = 0; runtime < maxRuntime; runtime++ )
                {
                      nums[ i ] = (int)(Math.random()*100);
                      System.out.println( nums[ i ]);
                    }     
                     
                
                if (nums[ i ] == (runtime))
                {
                    System.out.println(runtime + ": " + "#");
                }
                else
                {
                    System.out.println(runtime + ": ");
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

