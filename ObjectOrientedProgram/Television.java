
public class Television
{
    private String brand = "";
    private int size = 25;
    private boolean network = true; //female --> true, male --> false
    //private String color = "black";
    private int maxVolume = 30;
    //private String[] color = {"Red", "Black", "Grey", "Orange"};
    
    
    public Television( String brand, int size, boolean network){
        this.brand = brand;
        for(int i = 0; i < 7; i++)
        {
            
        }
        
        this.size = size * 2;
        this.network = network;
        
        /*
        if (network = true )
        {
            System.out.println("Connected to the network ");
        }
        else
        {
            System.out.println("You are not connected to the network");
        }
        */
       
        //this.color = color;
        this.maxVolume = maxVolume;
        if (size > 30){
            maxVolume = 50;
        }
        else
        {
            maxVolume = 30;
        }
       
    }
   
    public static void main( String[] args)
    {
        Television T1 = new Television("Samsung", 50, true);
        
        System.out.println(T1);
        System.out.println(T1.brand);
        System.out.println(T1.size);
        System.out.println(T1.network);
        //System.out.println(T1.color);
        System.out.println(T1.maxVolume);
    }//end method
}
