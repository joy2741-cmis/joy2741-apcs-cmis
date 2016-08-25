public class FundamentalsP5
{
    public static void main( String[] args )
    {
        String[] favoriteMovies = { "Movie1", "Movie2", "Movie3" };
      
  
    for( int i = 0; i < favoriteMovies.length; i++)
    {
      System.out.println( favoriteMovies[i] );
    
  
}

        System.out.println( "\n" + "\n" );

    
    String[] favoriteSongs = { "Song1", "Song2", "Song3" };
    int x = 0;
    while( x < favoriteSongs.length-1)
    {
                System.out.print( favoriteSongs[ x ] + " , " ); x++;
        
    }
    
    System.out.print( favoriteSongs[ favoriteSongs.length-1]);
}
}