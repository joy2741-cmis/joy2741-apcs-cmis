public class APP
{
    public static void main( String[] args )
    {
        Jukebox J1 = new Jukebox();
        System.out.println(J1);
        J1.randomSong();
        J1.playSongOfRating(5);
    }//end main
}//end class
