import javax.swing.JOptionPane;

public class AppTest
{
    public static void main( String[] args )
    {
        String options = "1: View Student List \n2: View Course List \n3: Add a Student \n4: Add a Course \n0: Quit";
        int input = (Integer.parseInt(JOptionPane.showInputDialog(options)));

        StudentTest[] students = new StudentTest[1000];
        int i = 0;
        int runtime = 0;

        while( input > 0 )
        {
            if( input == 1 ) //view student list
            {
                //test
                for( i = 0; i < 3; i++ )
                {
                    System.out.println("Student #" + i + ": " + students[i]);
                }//end for test
            }
            else if ( input == 2 ) //view course list
            {

            }
            else if ( input == 3 ) //add a student
            {
                while ( runtime < 1 )
                {
                    StudentTest student = new StudentTest();
                    students[i] = student;
                    i++;
                    runtime++;
                }//end while
            }
            else if ( input == 4 ) //add a course
            {

            }
            else if ( input == 0 ) //quit
            {

            }
        }//end while

      
    }//end method
}//end class
