
public class MyDevice
{
    private double price;
    private boolean portable; 
    private boolean battery;
    private String output;
   
    public MyDevice( boolean portable, boolean battery, double price )
    {
        this.portable = portable;
        this.battery = battery;
        this.price = price;
    }//end constructor

    public MyDevice( boolean portable, double price )
    {
        this.portable = portable;
        if( portable = true )
        {
            this.battery = true;
        }
        else if( portable = false )
        {
            this.battery = false;
        }//end if-else
        this.price = price;
    }//end constructor 2

    public MyDevice()
    {
        int num = (int)(Math.random()*2)+1;
        if( num == 1 )
        {
            this.portable = true;
            this.battery = true;
        }
        else if( num == 2 )  
        {
            this.portable = false;
            this.battery = false;
        }//end if-else
        this.price  = (Math.random()*5000)+10000;
    }//end constructor 3

    //Methods

    public String portableStr()
    {
        //String output = "";
        if( portable = true )
        {
            output = "is";
        }
        else
        {
            output = "is not";
        }//end if-else
        return output;
    }//end portableStr()
    
     public String batteryStr()
    {
       // String output = "";
        if( battery = true )
        {
            output = "uses";
        }
        else     
        {
            output = "does not use";
        }//end if-else
        return output;
    }//end batteryStr()

    //getter-setter

    public boolean getPortable()
    {
        return portable;
    }//end getPortable

    public void setPortable( boolean newPortable )
    {
        portable = newPortable;
    }//end setPortable

    public boolean getBattery()
    {
        return battery;
    }//end getBattery

    public void setBattery( boolean newBattery )
    {
        battery = newBattery;
    }//end setBattery

    public double getPrice()
    {
        return price;
    }//end getProce

    public void setPrice( double newPrice )
    {
        price = newPrice;
    }//end setPrice

    public String toString()
    {
        return String.format("The device %s portable. It %s battery. The price is %f ", portableStr(), batteryStr(), price );
    }//end toString

}//end class MyDevice
