
public class Textbook extends Reading
{
    private String course;
    private boolean homework;
    private String output;
    private String[] courses = { "Chemistry", "Art", "Computer Science", "Physics", "English", "Spanish", "Economics" };
    
    public Textbook( int x, int y, boolean book, int page, boolean homework )
    {
        super( x, y, book );
        this.homework = homework;
    }//end constructor
    
    public String textbookStr()
    {
        if( homework = true )
        {
            output = "is";
        }
        else
        {
            output = "is no";
        }
        return output;
       }//end bookStr()
    
    public boolean getHomework()
    {
        return homework;
    }//end getHomework
    
    public void setHomework( boolean newHomework )
    {
        homework = newHomework;
    }//end setHomework
    
    public String getCourse()
    {
        int random = (int)(Math.random()*7);
        course = courses[random];
        return course;
    }//end getCourse
    
    public String toString()
    {
        return String.format("%s There %s homework. The textbook is for %s.", super.toString(), textbookStr(), getCourse());
    }//end string
    
}//end class
