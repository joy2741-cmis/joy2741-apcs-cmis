import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main( String[] args )
    {
        BWTV bwTV = new BWTV();
        HDTV hdTV = new HDTV();

        ArrayList<TV> televisions = new ArrayList<TV>();
        televisions.add( bwTV );
        televisions.add( hdTV );
        
        for( int i = 0; i < televisions.size(); i++ )
        {
            TV x = televisions.get(i);
            //System.out.println(x.tvType());            
            System.out.println(x.tvType() + "...Am I on? " + x.getTvON());
        }//end for 
        
        System.out.println("\n");
        
        for( int i = 0; i < televisions.size(); i++ )
        {
            TV x = televisions.get(i);
            x.setTvON( true );
            System.out.println(x.tvType() + "...Am I on? " + x.getTvON());            
        }//end for
        
        System.out.println(bwTV.rotateRabbitEars());
        System.out.println(hdTV.connectHDMI());
        
    }//end main
}//end class AnalogDigitalDriver
