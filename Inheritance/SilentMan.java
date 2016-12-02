
public class SilentMan extends SuperHero
{
    String[] colors = {"red", "blue", "green", "pink", "black", "purple"};
    
    public SilentMan()
    {
        super();
        int randomColor = (int)(Math.random()*colors.length);
        super.setSuitColor(colors[randomColor]);
        int randomCape = (int)(Math.random()*1);
        if( randomCape == 0 )
        {
            super.setCape(true);
        }
        else
        {
            super.setCape(false);
        }//end if-else        
    }//end zero-arg constructor
    
    public String motto()
    {
        return "...";
    }//end method motto
    
    public String toString()
    {
        return String.format("%-15s %-11s %-11s %-9s \n", getClass().getName(), super.isCaped(), super.getSuitColor(), motto());
    }//end toString
}//end class SilentMan
