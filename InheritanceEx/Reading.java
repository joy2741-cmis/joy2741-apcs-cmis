
public class Reading extends Activity
{
    private boolean book; //true --> there is a book 
    private int page;
    private String output;

    public Reading( int x, int y, boolean book )
    {
        super( x, y ); 
        this.book = book;
    }//end constructor

    public String bookStr()
    {
        if( book = true )
        {
            output = "have";
        }
        else
        {
            output = "do not have";
        }
        return output;
       }//end bookStr()
       
    public String getName()
    {
        return super.getName();
    }//end getName

    public boolean getBook()
    {
        return book;
    }//end getBook

    public void setBook( boolean newBook )
    {
        book = newBook;
    }//end setBook

    public int getPage()
    {
        page = (int)(Math.random()*500)+1;
        return page;
    }//end getPage

    public void setPage( int newPage )
    {
        page = newPage;
    }//end setPage

    public void setName( String newName )
    {
        super.setName(newName);
    }//end setName

    public void setX( int newX )
    {
        super.setX(newX);
    }//end setX

    public void setY( int newY )
    {
        super.setY(newY);
    }//end setX

    public String toString()
    {
        return String.format("%s I  %s  a book. There are %d pages.", super.toString(),bookStr(), getPage());
    }//end toString

}//end class
