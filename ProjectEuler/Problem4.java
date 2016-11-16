//import javax.swing.JOptionPane;
public class Problem4
{
    public static void main( String[] args )
    {
        //int input = Integer.parseInt(JOptionPane.showInputDialog("Number: "));

        int table[][] = new int[999][999];
        int pNums[] = new int [100000];
        int i = 0;

        for( int x = 0; x < table.length; x++ )
        {
            for( int y = 0; y < table[0].length; y++ )
            {
                table[x][y] = x * y;

                int a = table[x][y];
                char[] num = ("" + a).toCharArray();

                if( num.length > 5 )
                {
                    //System.out.print(table[x][y] + "  ");
                    if( num[0] == num[num.length-1] )
                    {
                        if( num[1] == num[num.length-2] )
                        {
                            if( num[2] == num[num.length-3] )
                            {
                                //System.out.println(table[x][y] + "  ");
                                pNums[i] = table[x][y];
                                i++;
                            }
                        }
                    }//end if
                }

            }//end inner for
            //System.out.println("\n");
        }//end outer for

        int max = 0;

        for( int idx = 0; idx < pNums.length; idx++ )
        {
            if( pNums[idx] > max )
            {
                max = pNums[idx];
            }
        }//end for

        System.out.println("Max: " + max);
    }//end main
}//end class

