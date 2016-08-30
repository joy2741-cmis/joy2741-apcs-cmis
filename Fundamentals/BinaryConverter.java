public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "101101";
        int dec1 = bin2dec(bin1);
        //assert dec1 == 45;
        
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        //assert bin2.equals("1000010110111010");
    }
    
    public static int bin2dec(String bin){
        
        char[] binArray = bin.toCharArray();
        int total = 0;
        for (int index = binArray.length - 1; index >= 0; index--)
        {
            int num = 1;
            if (index == binArray.length - 1)
            {
                if ( binArray[ index ] == 1)
                {
                    total = total + 1;
                }
            }
            
            else if ( true)
            {
                int counter = binArray.length - index;
                while(counter > 1)
                {
                    num = num * 2;
                    counter--;
                }
                System.out.println(num + " ");
            }
        }
        return total;
    }

    public static String dec2bin(int dec){
        return "";
    }
        
}