

public class Array2D4
{
  public static void main( String[] args )
  {
      char[][] alphabet = new  char[6][5];
      
      for ( int x = 0; x < alphabet.length; x++ )
      {
          for( int y = 0; y < alphabet[0].length; y++ )
          {
              System.out.println(alphabet[x][y]);
            }//end inner for
        }//end outer for
    }//end main
}//end class
