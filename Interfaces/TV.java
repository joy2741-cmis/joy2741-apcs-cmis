
public abstract class TV
{
    private boolean tvON;
    
    public TV()
    {
        this.tvON = false;
    }//end constructor
    
    public boolean getTvON()
    {
        return tvON;
    }//end getTvOn
    
    public void setTvON( boolean newTvON )
    {
        tvON = newTvON;
    }//end setTvON
    
    public abstract String tvType();
    
}//end abstract TV
