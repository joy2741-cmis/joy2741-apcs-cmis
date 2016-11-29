
public class APP
{
    public static void main( String[] args )
    {
        MyDevice a = new MyDevice(false, true, 18422.3);
        System.out.println(a);
        
        MyDevice b = new MyDevice(true, 5000.4);
        System.out.println(b);
        
        MyDevice c = new MyDevice(false, 46546.7);
        System.out.println(c);
        
        MyDevice d = new MyDevice();
        System.out.println(d);
        
        
    }//end main
}//end class APP
