
public class App
{
    public static void main( String[] args )
    {
        Activity[] activities = new Activity[10];
        
        for( int i = 0; i < activities.length; i++ )
        {
            int random = (int)(Math.random()*3);
            if( random == 0 )
            {
                activities[i] = new Reading( 5, 6, true );
            }//end if
            else if( random == 1 )
            {
                activities[i] = new Soccer( 8, 6 );
            }
            else if( random == 2 )            
            {
                activities[i] = new Textbook( 7, 3, true, 700, true );
            }//end else
            System.out.println(activities[i]);
        }//end for
        
    }//end main
}//end class
