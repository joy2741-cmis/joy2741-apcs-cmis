public class AppTest
{
    public static void main( String[] args )
    {
        Name[] names = new Name[5];
        Grade[] grades = new Grade[5];
        for ( int i = 0; i < names.length; i++ )
        {
            names[i] = new Name();
            System.out.println(names[i]);
            grades[i] = new Grade();
            System.out.println(grades[i]);
        }//end for
    }//end main
}//end class
