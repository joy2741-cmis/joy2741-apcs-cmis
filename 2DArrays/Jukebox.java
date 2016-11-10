
public class Jukebox
{
    MySong[][] songList = new MySong[3][4]; 

    public MySong[][] getSongList()
    {
        return songList;
    }//end getter

    public void setSongList( MySong newSongList )
    {
        MySong[][] songList = new MySong[3][4]; 
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );              
    }//end setter

    public String toString()
    {
        for ( int y = 0; y < songList.length; y++ )
        {
            for( int x = 0; x < songList[y].length; x++ )
            {
                String output = songList[y][x];
            }//end for x
        }//end for y
        return output;
    }//end toString

}//end class
