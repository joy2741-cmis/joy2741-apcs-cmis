
public class Soccer extends Activity
{
    private boolean ball;
    private int player;
    private String output;

    public Soccer( int x, int y )
    {
        super( x, y );
    }//end constructor
  
    public boolean getBall()
    {
        int random = (int)(Math.random()*10)+1;
        if( random % 2 == 0 )
        {
            ball = true;
        }
        else
        {
            ball = false;
        }//end if-else
        return ball;
    }//end getBall
          
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
       }//end ballStr()

    public int getPlayer()
    {
        int player = (int)(Math.random()*12)+2;
        return player;
    }//end getPlayer

    public String toString()
    {
        return String.format("%s There %s a ball. There are %d player(s).", super.toString(), ballStr(), getPlayer());
    }//end toString

}//end class
