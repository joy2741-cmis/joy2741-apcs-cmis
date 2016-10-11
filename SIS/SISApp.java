import javax.swing.JOptionPane;
public class SISApp
{

    public static void main(String [] arg){
        int output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
        //Name[] names = new Name[3];
        //Grade[] grades = new Grade[3];
        Name[] names = new Name[1000];
        Grade[] grades = new Grade[1000];
        int i = 0;
        while( output > 0 )
        {
            if( output == 1 ) //View Student List
            {
                for( i = 0; i < names.length; i++ )
                {
                    if( names[i] != null )
                    {
                        System.out.println(names[i]);
                        System.out.println(grades[i]);
                    }
                    else
                    {                        
                        i = 1001;                       
                    }
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));  
            }
            else if( output == 2 ) //View Course List
            {
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 3 ) //Add a Student
            {
                for( int start = 0; start < 1 && i < names.length; start++ )
                {
                    names[i] = new Name();
                    grades[i] = new Grade();   
                    i++;
                }
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 4 ) //Add a Course
            {
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 0 ) //Quit
            {
                return;
            }//end if
        }//end while
    }//end main
}//end class

