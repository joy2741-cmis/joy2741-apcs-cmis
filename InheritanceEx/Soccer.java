
public class Soccer extends Activity
{
    boolean ball;
    int player;
    String teamAName;
    String teamBName;

    public Soccer( String name, int x, int y, int player, String teamAName, String teamBName )
    {
        super(name, x, y);
        this.player = player;
        this.teamAName = teamAName;
        this.teamBName = teamBName;
    }//end constructor
    
    

    
}//end class
