

public class Grade
{
    private Course course;
    private double score;
    
    public Grade()
    {
        this.score = (int)(Math.random()*4);
    }//end constructor
    
    public double getScore()
    {
        return score;
    }//end getScore
    
    public void setScore ( double newScore )
    {
        score = newScore;
    }//end setScore
    
    public Course getCourse()
    {
        return course;
    }//end getCourse
    
}//end class
