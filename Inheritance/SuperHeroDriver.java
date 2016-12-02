import java.util.List;
import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main( String[] args )
    {
      List<SuperHero> heroes = new ArrayList<SuperHero>();
      
      heroes.add(new AsteroidMan());
      heroes.add(new FriedEggMan());   
      heroes.add(new SilentMan());
      
      for( int i = 0; i < heroes.size(); i++ )
      {
          SuperHero H = heroes.get(i);
          System.out.println(H);
      }//end for
      
      //2D ARRAY
      
      
        
      
        
      
    }//end method
}//end class SuperHeroDriver
