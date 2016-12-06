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
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        for( int y = 0; y < capedHeroes.length; y++ )
        {
            for( int x = 0; x < capedHeroes.length; x++ )
            {
                for( int i = 0; i < heroes.size(); i++ )
                {       
                    SuperHero H = heroes.get(i);    
                    if( H != null )
                    {
                        if( H.isCaped() == true )
                        {
                            capedHeroes[y][x] = H;
                            heroes.remove(H);
                        }                        
                        else
                        {
                            capedHeroes[y][x] = null;                        
                        }//end if-else
                    }
                    else
                    {
                        capedHeroes[y][x] = null;  
                    }//end if-else
                }//end for i
            }//end x
            //System.out.println();
        }//end y

        for( int y = 0; y < capedHeroes.length; y++ )
        {
            for( int x = 0; x < capedHeroes.length; x++ )
            {
                if( capedHeroes[y][x] != null )
                {
                    System.out.print(capedHeroes[y][x].getName() + "\t");
                }
                else
                {
                    System.out.print("null\t\t");
                }//end if-else
            }//end for x
            System.out.println();
        }//end for y

    }//end method
}//end class SuperHeroDriver
