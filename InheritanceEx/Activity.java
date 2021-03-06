
public class Activity
{
    private String name;
    private int x;
    private int y;

    public Activity( int x, int y )
    {
        this.x = x;
        this.y = y;
    }//end constructor

    public String getName()
    {
        return name;
    }//end getName

    public void setName( String newName )
    {
        name = newName;
    }//end setName

    public int getX()
    {
        return x;
    }//end getX

    public void setX( int newX )
    {
        x = newX;
    }//end setX

    public int getY()
    {
        return y;
    }//end getX

    public void setY( int newY )
    {
        y = newY;
    }//end setX

    public String toString()
    {
        return String.format(" X: %d  Y: %d || ", getX(), getY());
    }//end toString

}//end class
