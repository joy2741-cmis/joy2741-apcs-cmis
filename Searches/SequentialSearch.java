
public class SequentialSearch
{
    public static void main( String[] args )
    {
        int[] sortedArray = new int[100];
        int randomNum = (int)(Math.random()*101);
        for( int i = 0; i < sortedArray.length; i++ )
        {
            sortedArray[i] = i;
        }//end for       
        sequentialSearch(randomNum, sortedArray);
        System.out.println("Random num: " + randomNum);
    }//end main

    public static int sequentialSearch( int randomNum, int[] sortedArray )
    {
        int num = 0;
        for( int i = 0; i < sortedArray.length; i++ )
        {
            if( sortedArray[i] == randomNum )
            {
                num = sortedArray[i];
            }
        }//end for        
        System.out.println("Num: " + num);
        return num;
    }
}
