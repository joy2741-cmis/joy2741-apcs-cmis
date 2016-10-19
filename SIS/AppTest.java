import javax.swing.JOptionPane;

public class AppTest
{
    public static void main( String[] args )
    {
        String options = "1: View Student List \n2: View Course List \n3: Add a Student \n4: Add a Course \n0: Quit";
        int input = (Integer.parseInt(JOptionPane.showInputDialog(options)));

        String studentOptions = "Choose a student from the list";     
        int studentInput = 0;

        String individualSInput = "1: Add a course \n2: Change the grade";
        int individualSInput = 0;

        StudentTest[] students = new StudentTest[1000];
        CourseTest[] courses = new CourseTest[1000];
        int i = 0;
        int runtime = 0;

        while( input > 0 )
        {
            if( input == 1 ) //view student list
            {
                //System.out.println("Choose a student from the list");
                for( i = 0; i < students.length; i++ )
                {
                    if( students[i] != null )
                    {
                        System.out.println("#" + i + " " + students[i]);
                        studentOptions = "#" + i + " " + students[i] + "\n";                           
                    }
                    else
                    {
                        i = students.length + 1;
                    }//end if
                }//end for
                studentInput = (Integer.parseInt(JOptionPane.showInputDialog(studentOptions)));
                if( studentInput == 1 )
                {
                    System.out.println(students[0]);
                    individualSInput = (Integer.parseInt(JOptionPane.showInputDialog("")));
                }
                //add a course
                //change gpa
                //change course grade

            }
            else if ( input == 2 ) //view course list
            {
                for( i = 0; i < courses.length; i++ )
                {
                    if( courses[i] != null )
                    {
                        int order = i + 1;
                        System.out.println("#" + order + " " + courses[i]);
                    }
                    else
                    {
                        i = courses.length + 1;
                    }//end if
                }//end for
                input = (Integer.parseInt(JOptionPane.showInputDialog(options)));
            }
            else if ( input == 3 ) //add a student
            {
                for( runtime = 0; runtime < 1; runtime++ )
                {
                    StudentTest student = new StudentTest();
                    students[i] = student;
                    i++;
                }//end while
                input = (Integer.parseInt(JOptionPane.showInputDialog(options)));
            }
            else if ( input == 4 ) //add a course
            {
                for( runtime = 0; runtime < 1; runtime++ )
                {
                    CourseTest course = new CourseTest();
                    courses[i] = course;
                    i++;
                }//end while
                input = (Integer.parseInt(JOptionPane.showInputDialog(options)));
            }
            else if ( input == 0 ) //quit
            {

            }
        }//end while

    }//end method
}//end class
