
public class FundamentalsP0{
    public static void main( String[] args)
    {
      byte byte1 = 56;
      byte byte2 = 7;
      
      short short1 = 10000;
      short short2 = 5720;
      
      int int1 = 7;
      int int2 = -59;
      
      long long1 = 953154872L;
      long long2 = -235457L;
      
      float float1 = 842f;
      float float2 = 57f;
      
      double double1 = 568.1d;
      double double2 = 35.2d;
      
      boolean boolean1 = true;
      boolean boolean2 = false;
      
      char char1 = '\u00ff';
      char char2 = '\u0001';
      
      System.out.println( "Byte: an 8-bit signed two's complement integer used to save space. It is often use in place of an integer (four times smaller). ");
      System.out.println( "Short: a 16-bit signed two's complement integer, which is also used to save memory. Unlike byte, it is two times smaller than int. ");
      System.out.println( "Int: a 32-bit signed two's complement integer. It is typically used to store numerical value in memory. ");
      System.out.println( "Long: a 64-bit signed two's complement integer. It is used when the value exceeds the range of int. ");
      System.out.println( "Float: a single-precision 32-bit IEEE 754 floating point. Meaning, it saves memory in large arrays of floating point numbers. Thus, it should not be used with data that are precise such as currency. ");
      System.out.println( "Double: a double-precision 64-bit IEEE 754 floating point. Its function is similar to Float; however, Double is a default data type for decimal values. ");
      System.out.println( "Boolean: there are two possible values: true and false. It is commonly used in conditions. ");
      System.out.println( "Char: a single 16-bit Unicode character. It can be used to store any kind of character. ");
      
        
}
}
