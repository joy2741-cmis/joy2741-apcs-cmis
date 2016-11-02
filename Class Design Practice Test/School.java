
public class School
{
    private Student[] students;
    private Course[] catalog;

    public Student getStudentById( int searchId )
    {              
        for( int i = 0; i < students.length; i++ )
        {
            if( searchId == students[i].getId() && students[i] != null )
            {
                return students[i];   
            }//end if
            else
            {
                return null;
            }
        }//end for  
        return null;
    }//end getStudentById

    /*
    public double gpaForCourse( Course course )
    {

    }//end gpaForCourse
     */
}
