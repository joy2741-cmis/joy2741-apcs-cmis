
public class Reading extends Activity
{
    private boolean book; //true --> there is a book 
    private int page;
    private String genre;
    private String output;

    public Reading( String name, int x, int y, boolean book, int page, String genre )
    {
        super(name, x, y); 
        this.book = book;
        this.page = page;
        this.genre = genre;
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
        return page;
    }//end getPage

    public void setPage( int newPage )
    {
        page = newPage;
    }//end setPage

    public String getGenre()
    {
        return genre;
    }//end getGenre

    public void setGenre( String newGenre )
    {
        genre = newGenre;
    }//end setGenre

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
        return String.format("I " + bookStr() + " a book. There are " + page + " pages. The genre is " + genre + ".");
    }//end toString

}//end class
