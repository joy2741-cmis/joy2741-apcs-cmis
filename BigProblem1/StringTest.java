
public class StringTest
{
    public static void main( String[] args)
    {
        int maxRuntime = 5;
        int[] array = new int [maxRuntime];
        int i = 0;
        int runtime = 0;
        int order = 0;

        String test = "";

        for( order = 0; order < 5; order++)
        {
            System.out.println(order + ": ");
            for( runtime = 0; runtime < maxRuntime; runtime++ )
            {

                array[i] = (int)(Math.random()*5);
                System.out.println("Num: " + array [ i ]);
                test = test + array[i];
                System.out.println("#");

            }
        }

      
    }
}

/*
 * Empty string
 * Random numbers --> add to string
 * 
 */