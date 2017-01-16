import java.lang.Math;
public class Problem9
{
    public static void main( String[] args )
    {
        /*
        int a = 3;
        int b = 4;
        System.out.println("a " + a);
        System.out.println("b " + b);
        int sum = (int)((Math.pow(a,2)) + (Math.pow(b,2)));
        System.out.println(a + " + " + b + " = " + sum);
        double c = (Math.sqrt(sum));
        System.out.println(c);
         */

        int a = 3;
        int b = 4;
        /*
        for( int a = 3; a < 10; a +2 )
        {
        double c = 0;
        for( int b = 4; b < 10; b++ )
        {
        int sum = (int)((Math.pow(a,2)) + (Math.pow(b,2)));
        System.out.println(a + " + " + b + " = " + sum);
        c = (Math.sqrt(sum));
        }//end for b
        System.out.println(c);
        }//end for a
         */
        for( a = 3, b = 4; b < 1000 && a < 1000; b++ )
        {
            double c = 0;
            int sum = (int)((Math.pow(a,2)) + (Math.pow(b,2)));
            //System.out.println(a + " + " + b + " = " + sum);
            System.out.println("C^2: ");
            c = (Math.sqrt(sum));
            //System.out.print(" C: " + c + "\n");
            double sum2 = (a + b + c);
            System.out.println("Sum of abc " + a + " + " + b + " + " + c + " = " + sum2);
            System.out.println("\n\n");
            
            if( sum2 == 1000 )
            {
                b = 1001;
            }
            a++;
        }

    }//end main
}//end class
