import javax.swing.JOptionPane;
public class Course
{
    
    private String course;
    private String[] courses;
    private int index = 0;
    
    public Course()
    {
        this.course = JOptionPane.showInputDialog( "Type your course: " );
    }//end constructor
        
    public String[] getCourses()
    {
        return courses;
    }//end getNames
    
    public void setCourses( String[] newCourses )
    {        
        courses = newCourses;
    }//end setNames
    
    public String getCourse( int index )
    {
        return courses[index];
    }//end getName
           
    public String toString()
    {
        String output = "Course Name: " + course;
        return output;
    }
    
}