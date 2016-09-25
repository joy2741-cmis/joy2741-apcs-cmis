
public class Person
{
    private int age;
    private boolean gender; //true = female || false = male
    private double yearsLeft = 0;
    private double mLifeEx = 80.5;
    private double fLifeEx = 86.8;

    public double getYears()
    {

        if ( gender ) //female
        {
            yearsLeft = fLifeEx - age;
        }
        else //male
        {
            yearsLeft = mLifeEx - age;
        }
        return yearsLeft; 
    }//end Person

}//end class Person

