import javax.swing.JOptionPane;
public class CourseTest
{
    private String courseName;
    private int courseGrade;
    
    public CourseTest()
    {
        this.courseName = JOptionPane.showInputDialog("Course Name: ");
    }//end constructor
    
    public String getCourseName()
    {
        return courseName;
    }//end getCourseName
    
    public void setCourseName ( String newCourseName )
    {
        courseName = newCourseName;
    }//end setCourseName
    
    public int getCourseGrade()
    {
        return courseGrade;
    }//end getCourseGrade
    
    public void setCourseGrade ( String newCourseGrade )
    {
        courseName = newCourseGrade;
    }//end setCourseGrade
    
    public String toString()
    {
        String output = "Course Name: " + courseName;
        return output;
    }//end toString
    
}
