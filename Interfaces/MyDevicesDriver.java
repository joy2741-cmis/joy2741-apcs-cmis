import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyPod pod = new MyPod( 32, "Black" );
      MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
      MyCar car = new MyCar();
      
      ArrayList<Connectable> connectables = new ArrayList<Connectable>(); 
      connectables.add( pod );
      connectables.add( phone );
      connectables.add( car );
      
      for( Connectable device : connectables ) 
         {
         device.connectToBluetooth();              
         } // end for each
         
      } // end method main
   } // end class MyDevicesDriver
   