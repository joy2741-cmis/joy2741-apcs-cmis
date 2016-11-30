
public class myPhone extends MyDevice
{
    private double width;
    private double height;
    private double depth;
    private String brand;
    private String[] brands = {"Apple", "Nokia", "Samsung", "Oppo"};
    private String carrier;
    private String[] carriers = {"DTAC", "AIS", "TRUE"};

    public myPhone()
    {
        super();
        this.width = (Math.random()*7)+1;
        this.height = (Math.random()*15)+1;
        this.depth = (Math.random()*2)+1;
        int numB = (int)(Math.random()*4);
        this.brand = brands[numB];
        int numC = (int)(Math.random()*3);
        this.carrier = carriers[numC]; 
    }//end constructor 1
    
    public double volume()
    {
        double volume = width * height * depth;
        return volume;
    }//end size
    
    public String toString()
    {
        return String.format("%s The brand is %s and the carrier is %s. The volume is %f", super.toString(), brand, carrier, volume());
    }//end toString()

    
}//end class myPhone
