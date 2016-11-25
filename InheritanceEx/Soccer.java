
public class Soccer extends Activity
{
    private boolean ball;
    private int player;
    private String output;

    public Soccer( String name, int x, int y, boolean ball, int player )
    {
        super(name, x, y);
        this.ball = ball;
        this.player = player;
    }//end constructor
    
    public String ballStr()
    {
        if( ball = true )
        {
            output = "is";
        }
        else
        {
            output = "isn't";
        }
        return output;
       }//end bookStr()

    public boolean getBall()
    {
        return ball;
    }//end getBall

    public int getPlayer()
    {
        return player;
    }//end getPlayer

    public String toString()
    {
        return String.format("There " + ballStr() + " a ball. There are " + player + " player(s).");
    }//end toString

}//end class
