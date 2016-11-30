
public class myPod extends MyDevice
{
    private int music;
    private String playlist;
    private String[] playlists = {"Playlist 1", "Playlist 2", "Playlist 3"};
    private int volume;

    public myPod()
    {
        super();
        this.music = (int)(Math.random()*50)+30;
        this.volume = (int)(Math.random()*20)+5;
        int num = (int)(Math.random()*3);
        this.playlist = playlists[num];
    }//end constructor 1

    public String toString()
    {
        return String.format("%s There are %d songs. The playlist playing now is called %s. The volume is %d", super.toString(), music, playlist, volume);     
    }//end toString()

}//end class Mypod
