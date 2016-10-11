import javax.swing.JOptionPane;
public class Name
{
    private String name;
    private String[] names;
    private int index = 0;
    
    public Name()
    {
        this.name = JOptionPane.showInputDialog( "Type your name: " );
    }//end constructor
    
    //Method name
    
    public String[] getNames()
    {
        return names;
    }//end getNames
    
    public void setNames( String[] newNames )
    {
        names = newNames;
    }//end setNames
    
    public String getName( int index )
    {
        return names[index];
    }//end getName
    
    public void addName( String name )
    {
        names[ index ] = name;
        index++;
    }//end getName
    
    public String toString()
    {
        String output = "Student Name: " + name;
        return output;
    }
    
}