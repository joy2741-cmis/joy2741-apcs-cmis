import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Problem1APP
{
    public static void main( String[] args )
    {
        /*
        MyDevice a = new MyDevice(false, true, 18422.3);
        System.out.println(a);
        MyDevice b = new MyDevice(true, 5000.4);
        System.out.println(b);
        MyDevice c = new MyDevice(false, 46546.7);
        System.out.println(c);
        MyDevice d = new MyDevice();
        System.out.println(d);
        myPod e = new myPod();
        System.out.println(e);
        myPhone f = new myPhone();
        System.out.println(f);
        */
       
       List<MyDevice> devices = new ArrayList<MyDevice>();
       System.out.println(devices.size());
       
       for( int i = 0; i < 5; i++ )
       {
           int random = (int)(Math.random()*10)+1;
           if( random % 2 == 0 )
           {
               myPhone a = new myPhone();
               devices.add(a);
            }
            else
            {
                myPod b = new myPod();
                devices.add(b);
            }//end if-else
        }//end for
        
        System.out.println(devices.size());
        
        for( int i = 0; i < devices.size(); i++ )
        {
            MyDevice c = devices.get(i);
            System.out.println(c);
        }//end for
       
       

    }//end main
}//end class APP
