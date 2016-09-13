import javax.swing.JOptionPane;
public class ArrayTest
{
   public static void main( String[] args)
   {
       
        String input = JOptionPane.showInputDialog( "Type a number"  );
        int maxRuntime = Integer.parseInt(input);
        int runtime = 0;
        
        int[] nums = new int[maxRuntime];
        
        int order = 0;
        
        for(runtime = 0, order = 0; runtime < maxRuntime; runtime++, order++)
        {
            nums[order] = (int)(Math.random()*100);
           System.out.println("order " + order + "Value " + nums[order]);
        }
        System.out.println("Nums " + nums);
    }
    
}
