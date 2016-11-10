import javax.swing.JOptionPane;
public class Test1Fundamentals
{
    public static void main( String[] args )
    {
        String numinput = JOptionPane.showInputDialog( "Type a number: ");
        int input = Integer.parseInt( numinput );
        double[] array = new double [input];
        int runtime = 0;
        int i = 0;
        String even = "";
        String odd = "";
        int num = 0;

        for( runtime = 0, i = 0; runtime < array.length; runtime++, i++)
        {

            array[i] = (double)(Math.random()*50); //need to take out zero
            System.out.println(i + ": " + array[i]);

        }//end for 

        
        for( runtime = array.length-1, i = array.length - 1; runtime > -1; runtime--, i--)
        {
            array[i] = (int)(array[i]);
            //System.out.println(runtime + ": " + array[i]);
            //array[i] = num;

            if( array[i] % 2 == 0 )
            {

                while( array[i] > -1 )
                {
                    even  = even + "E";
                    array[i] = array[i] - 1;
                    if( array[i] == 0)
                    {
                        System.out.println(runtime + ": " + even + " " + array[i]);
                        even = "";
                    }//end if
                }//end while

                //System.out.println(runtime + ": " + "Even " + array[i]);
            }//end if

            if( array[i] % 2 != 0)
            {
                /*for( i = num; 0 < num; num--)
                {
                odd  = odd + "O";
                System.out.println(runtime + ": " + odd + " " + num);
                }//end for
                 */
                System.out.println(runtime+ ": " + "Odd " + array[i]);
            }//end if

        }//end for
    }//end method
}//end class

