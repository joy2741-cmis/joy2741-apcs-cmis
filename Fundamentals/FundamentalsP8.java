

public class FundamentalsP8
{
   public static void main( String[] args )
   {
       String[] favArtist = { "Artist1", "Artist2", "Artist3" };
       
       for( int index = 0; index < favArtist.length; index++)
       {
           System.out.println( favArtist[ index ] );
        }
        
        favArtist[(int)(Math.random()*3)]= "Michael Jackson";
        
       System.out.println( "\n" ); 
             
        for( int index = 0; index < favArtist.length; index++)
        {
            System.out.println( favArtist[ index ]);
        }
        
        System.out.println( "\n" );
        
        for (int index = 0; index < favArtist.length; index++ )
        {
            if (favArtist [index ].equals("Michael Jackson"))
            {
                System.out.println("We found Michael!");
            }
            else
            {
                System.out.println("No Michael in music");
           }
      }
    }
}
       