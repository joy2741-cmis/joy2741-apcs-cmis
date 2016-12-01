import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Problem2APP
{
   public static void main( String[] args )
   {
       List<Television> televisions = new ArrayList<Television>();
       
       televisions.add(new Television());
       televisions.add(new DLP());             
       televisions.add(new LCD());
       televisions.add(new LED());
       televisions.add(new Plasma());
       
       for( int i = 0; i < televisions.size(); i++ )
       {
           Television t = televisions.get(i);
           System.out.println(t);
        }//end for
  
       
       
       
       
       
      
    }//end main
}//end class Problem2APP
