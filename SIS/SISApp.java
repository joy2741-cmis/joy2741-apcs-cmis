import javax.swing.JOptionPane;
public class SISApp
{

    public static void main(String [] arg){

        int output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
        //Name[] names = new Name[3];
        //Grade[] grades = new Grade[3];
        Name[] names = new Name[1000];
        Grade[] grades = new Grade[1000];
        Course[] courses = new Course[1000];
        int index = 0;
        int index2 = 0;

        while( output > 0 )
        {
            if( output == 1 ) //View Student List
            {
                for( int i = 0; i < names.length; i++ )
                {
                    if( names[i] != null )
                    {
                        System.out.println(names[i]);
                        System.out.println(grades[i]);
                    }
                    else
                    {                        
                        i = names.length+1;                       
                    }
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));  
            }
            else if( output == 2 ) //View Course List
            {
                for( int i = 0; i < courses.length; i++ )
                {
                    if( courses[i] != null )
                    {
                        System.out.println(courses[i]);
                    }
                    else
                    {                        
                        i = courses.length+1;                       
                    }
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 3 ) //Add a Student
            {
                for( int start = 0; start < 1 && index < names.length; start++ )
                {
                    names[index] = new Name();
                    grades[index] = new Grade();   
                    index++;
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 4 ) //Add a Course
            {
                for( int start = 0; start < 1 && index2 < courses.length; start++ )
                {
                    courses[index2] = new Course();
                    index2++;
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 0 ) //Quit
            {
                return;
            }
            else
            {
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }//end if
        }//end while
    }	
}//end main

