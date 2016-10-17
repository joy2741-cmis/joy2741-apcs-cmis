import java.math.BigInteger;
public class Problem20
{
  public static void main( String[] args )
  {
      BigInteger factorial = BigInteger.valueOf(1);
      BigInteger i = BigInteger.valueOf(100);
      BigInteger zero = BigInteger.valueOf(0);
      BigInteger one = BigInteger.valueOf(1);
      int sum = 0;
      
      //calculate 100!
       
        while( i.compareTo(zero) > 0 )
        {
            factorial = factorial.multiply(i);
            System.out.println("factorial: " + factorial);
            i = i.subtract(one);
            System.out.println("i: " + i);
        }
        
       System.out.println("100! = " + factorial);
       
       //BigInteger to String to Char 
       String facString = factorial.toString();
       char[] facChar = facString.toCharArray();
              
       //Char to int and digit sum
       for( int index = 0; index < facChar.length; index++ )
       {
           System.out.println(facChar[index]);
           int facInt = Character.getNumericValue(facChar[index]);
           sum += facInt;
           System.out.println("Sum: " + sum);
        }//end for
       
       
    }//end method
}//end class