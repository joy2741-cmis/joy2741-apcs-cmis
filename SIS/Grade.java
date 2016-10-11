import javax.swing.JOptionPane;

public class Grade
{
    private int grade;  
    private int[] grades;
    private int index = 0;

    public Grade()
    {
        this.grade = Integer.parseInt(JOptionPane.showInputDialog( "Type your grade: " ));
    }//end constructor
    
    public int[] getGrades()
    {
        return grades;
    }//end getGrades
    
    public void setGrades( int[] newGrades )
    {
        grades = newGrades;
    }//end setGrades
    
    public int getGrade( int index )
    {
        return grades[index];
    }//end getGrade
    
    public void addGrade( int grade )
    {
        grades[ index ] = grade;
        index++;
    }//end getGrade
    
       
    public String toString()
    {
        String output = "Grade: " + grade;
        return output;
    }
    

}//end class
