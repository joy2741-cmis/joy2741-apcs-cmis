
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

        public double gpaForCourse( Course course )
    {
        //get students in that course
        for( int i = 0; i < students.length; i++ )//student list
        {
            for( int idx = 0; idx < students[i].getGrades().length; idx++ )//courses
            {
                students[i].getGrades().getCourse;
            }//end for
        }//end for
        return null;
    }//end gpaForCourse
         
}
