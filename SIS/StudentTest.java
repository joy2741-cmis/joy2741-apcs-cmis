import javax.swing.JOptionPane;
public class StudentTest
{

    private String name;
    private int grade;
    private String[] courses = new String[100];
    private int i;

    public StudentTest()
    {
        this.name = JOptionPane.showInputDialog("Student Name: ");
        this.grade = (Integer.parseInt(JOptionPane.showInputDialog("Grade Level: ")));
    }//end constructor

    //name

    public String getName()
    {
        return name;
    }//end getName

    public void setName( String newName )
    {
        name = newName;
    }//end setName

    //grade

    public int getGrade()
    {
        return grade;
    }//end getGrade

    public void setGrade( int newGrade )
    {
        grade = newGrade;
    }//end setGrade
    
    
    //courses

    public String getCourses( int i )
    {
        return courses[i];
    }//end getCourses
    
    public void setCourses( int i, String newCourse )
    {
        courses[i] = newCourse;
    }//end setCourses
    
}//end class
