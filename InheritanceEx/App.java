
public class App
{
    public static void main( String[] args )
    {
        Activity[] activities = new Activity[10];
        
        for( int i = 0; i < activities.length; i++ )
        {
            int random = (int)(Math.random()*2)+1;
            if( random % 2 == 0 )
            {
                activities[i] = new Reading( "name", 5, 6, true, 78, "fantasy" );
            }//end if
            else
            {
                activities[i] = new Soccer( "A", 8, 6, true, 11 );
            }//end else
            System.out.println(activities[i]);
        }//end for
        
    }//end main
}//end class
