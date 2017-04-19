
public class BinarySearch
{
    public static void main( String[] args )
    {
        int[] sortedArray = new int[100];
        int randomNum = (int)(Math.random()*101);
        for( int i = 0; i < sortedArray.length; i++ )
        {
            sortedArray[i] = i;
        }//end for       
        binarySearch(randomNum, sortedArray);
        System.out.println("Random num: " + randomNum);
    }//end main

    public static int binarySearch( int randomNum, int[] sortedArray )
    {
        int num = 0;
        int limit = sortedArray.length; 
        int min = 0;
        System.out.println("limit: " + limit);
        while( randomNum != num )
        {
            if( randomNum == limit ) 
            {
                num = randomNum;
            }
            else if( randomNum <= limit )
            {
                limit = sortedArray[limit - (limit-min)/2];
                System.out.println("limit: " + limit);
            }
            else if( randomNum > limit ) 
            {
                min = limit;
                limit = sortedArray[limit + ((sortedArray.length - min)/2)];                
                System.out.println("limit: " + limit);
            }
            else //number doesn't exist in the array
            {
                num = -1;
            }//end if-else
        }//end while
        System.out.println("Num: " + num);
        return num;
    }//end for
}//end BinarySearch


