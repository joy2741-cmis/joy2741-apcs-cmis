
public class BinarySearch
{
    public static void main( String[] args )
    {
        int[] sortedArray = new int[100];
        // int randomNum = (int)(Math.random()*101);
        int randomNum = 43;
        for( int i = 0; i < sortedArray.length; i++ )
        {
            sortedArray[i] = i;
        }//end for       
        binarySearch(randomNum, sortedArray);

    }//end main

    public static int binarySearch( int randomNum, int[] sortedArray )
    {
        int num = 0;
        int limit = sortedArray.length/2; 
        while( randomNum != num )
        {
            if( randomNum == limit ) 
            {
                num = randomNum;
            }
            else if( randomNum <= limit ) //less than or equal to 50
            {
                limit = limit/2;
            }
            else if( randomNum > limit ) //more than 50
            {

            }
            else //number doesn't exist in the array
            {
                num = -1;
            }//end if-else
        }

        return num;
    }//end for
}//end BinarySearch
