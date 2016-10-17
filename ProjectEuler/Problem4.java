
public class Problem4
{
    public static void main( String[] args )
    {
        int product = 0;
        int[] numbers1 = new int[999];
        int[] numbers2 = new int[999];
        int a = 0;
        int i = 999;
        int[] result = new int[999];
        String[] resultS = new String[999];
        char[] checkNums = new char[5];

        /*
        for ( a = 0; a < checkNums.length; a++ )
        {
        System.out.println("CharArray" + checkNums[a]);
        }
         */

        for ( a = 0, i = 999; a < numbers1.length && i > 0; a++, i-- )
        {
            numbers1[a] = a + 1;
            System.out.println( "numbers1[a]: " + numbers1[a] );
            numbers2[a] = i;
            System.out.println( "numbers2[a]: " + numbers2[a] );

            if ( a == 500 )
            {
                System.out.println("MAX");
            }

            result[a] = numbers1[a] * numbers2[a]; 
            resultS[a] = result[a] + " ";

            System.out.println("Result: " + resultS[a] );
    
            checkNums = resultS[a].toCharArray();

        }

    }
}

