import java.math.BigDecimal;
public class Problem16
{
    public static void main( String[] args )
    {
        double num = Math.pow(2,1000);
        System.out.println(num);
        BigDecimal result = new BigDecimal(num);
        System.out.println(result.toString());
        int sum = 0;
        String test1 = "9425947759838359420851623124482936749562312794702543768327889353416977599316221476503087861591808346911623490003549599583369706302603264000000000000000000000000";


        String test2 = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
        
        if (test1.equals(test2))
        {
            System.out.println("Well Done, Joy!");
        }
        else
        {
            System.out.println("Just give up");
        }
        
       
        char[] stringToCharArray = test1.toCharArray();
        for( int i = 0; i < stringToCharArray.length; i++ )
        {
            System.out.println(stringToCharArray[i]);
            int a = Character.getNumericValue(stringToCharArray[i]);
            sum += a;
            System.out.println("Sum: " + sum);
        }//end for
        
        
    }
}
