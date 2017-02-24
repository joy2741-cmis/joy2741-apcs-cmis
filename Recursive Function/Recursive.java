
/**
 * Write a description of class Recusive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursive
{

    public int pow( int x, int n )
    {
        if( x < 10 )
        {
            x = x * n;
        }
        else
        {
            x = x/3;
        }
        
        return pow(5,2);        
    }//end pow

}//end class
/*
x   n   x^n
1   2   2
2   2   4
4   2   16
*/