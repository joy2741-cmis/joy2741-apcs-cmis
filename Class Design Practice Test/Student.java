
public class Student
{
    private String name;
    private int gradeLevel;
    private int id;
    private Grade[] grades = new Grade[8];

    public Student( String name, int gradeLevel )
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }//end constructor

    public Grade[] getGrades() 
    {
        return grades;
    }//end getGrade

    public int getId()
    {
        return id;
    }//end getId

    public Grade[] minMaxGrades()
    {
        Grade[] minMaxGrades = new Grade[2];//0 = min, 1 = max
        //Find min and max
        for( int i = 0; i < grades.length; i++ )
        {
            double a = grades[i].getScore();
            for( int idx = 0; idx < grades.length; idx++ )
            {
                if ( a > grades[idx].getScore() )
                {
                    minMaxGrades[1].setScore(a);
                    idx = grades.length + 1;
                }
                else if ( a < grades[idx].getScore() )
                {
                    minMaxGrades[0].setScore(a);
                    idx = grades.length + 1;
                }//end if
                else if ( grades[idx].getScore() == -1 )
                {
                    minMaxGrades[0].setScore(-1);
                    minMaxGrades[1].setScore(-1);
                }
            }//end for

        }//end for

        return null;
    }//end minMaxGrades

    
}
