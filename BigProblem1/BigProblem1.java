import javax.swing.JOptionPane;
public class BigProblem1
{
    public static void main( String[] args)
    {
        String input = JOptionPane.showInputDialog( "Type a number"  );
        int maxRuntime = Integer.parseInt(input);
        int[] array = new int [maxRuntime];
        int i = 0;
        int runtime = 0;
        int order = 0;

        String counter = "";
        int sum = 0;

        

        for( runtime = 0, i = 0; runtime < maxRuntime; runtime++, i++)
        {
            array[ i ] = (int)(Math.random()*100);
            System.out.println("i = " + i + " " + "|| RandomNum = " + array[ i ]);
            sum = sum + array[ i ];
        }//end for

        System.out.println("HISTOGRAM");
        

        for( order = 0; order < 100; order++)
        {

            for( i = 0; i < maxRuntime; i++)
            {
                if (array[ i ] == order)
                {
                    counter = counter + "#";

                }

            }//end for

            System.out.println(order + ": " + counter);
            counter = "";
        }//end for

        int avg = sum/maxRuntime;

        //Minimum
        
        
        //Maximum
        
        
        //Mode
        
        System.out.println("\n");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }//end method
}//end class

/*
 * Empty string
 * Random numbers --> add to string
 * 
 */
