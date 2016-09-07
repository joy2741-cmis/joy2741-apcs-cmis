
public class DectoBin
{
   public static void main( String[] args )
   {
       int dec = 56;
       
            
           if( dec % 2 == 0)
           {
             System.out.println("0");
              dec = dec/2;
              System.out.println(dec);
            }
            else if ( dec % 2 == 1)
            {
                System.out.println("1");
                dec = dec/2;
                System.out.println(dec);
            }
        
       
       
       
    }
}

/*check if 56 % 2 == 0 or == 1
 * if 0 --> printout zero and set value of dec to dec/2
 * 
 * 
 * 
 */