
public class myPhone
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
        this.width = (Math.random()*7)+1;
        this.height = (Math.random()*15)+1;
        this.depth = (Math.random()*2)+1;
        int numB = (int)(Math.random()*4);
        this.brand = brands[numB];
        int numC = (int)(Math.random()*5);
        this.carrier = carriers[numC]; 
    }//end constructor 1
    
    public double size()
    {
        double size = width * height * depth;
        return size;
    }//end size
    
    public String toString()
    {
        return String.format("%s The brand is %s and the carrier is %s. The size is %f", super.toString(), brand, carrier);
    }//end toString()

    
}//end class myPhone
