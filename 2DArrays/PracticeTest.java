
public class PracticeTest
{
    public static void main( String[] args )
    {
        int[][] nums = new int[20][20];
        int[] sumRow = new int[20];
        int[] sumColumn = new int[20];

        int i = 0;
        int max = 0;
        int maxRow = 0;
        int maxColumn = 0;
        int idx = 0;

        //row major
        System.out.println("Row Major");
        for( int x = 0; x < nums.length; x++ )
        {
            int sum = 0;
            for( int y = 0; y < nums[0].length; y++ )
            {
                nums[x][y] = (int)(Math.random()*10);
                System.out.print(nums[x][y] + "  ");
                sum += nums[x][y]; 
            }//end for y                       
            sumRow[i] = sum;
            System.out.print("Sum: " + sumRow[i] + " i: " + i);
            System.out.print("\n");
            i++;
        }//end for x

        //column major
        System.out.println("\nColumn Major");       
        for( int y = 0; y < nums[0].length; y++ )
        {
            int sum = 0;
            for( int x = 0; x < nums.length; x++ )
            {
                System.out.print(nums[x][y] + "  ");
                sum += nums[x][y];                
            }//end for x                     
            sumColumn[idx] = sum;
            System.out.print("Sum: " + sumColumn[idx] + " i: " + idx + "\n");
            idx++;
        }//end for y

        //sum row
        System.out.println("\nSumRow Array");
        for( i = 0; i < sumRow.length; i++ )
        {
            //System.out.println(sumRow[i]);
            if( sumRow[i] > max )
            {
                max = sumRow[i];
                maxRow = i;
            }                                    
        }//end for 
        System.out.println("Max row: " + maxRow);

        //sum column
        System.out.println("\nSumColumn Array");
        for( i = 0; i < sumColumn.length; i++ )
        {
            //System.out.println(sumColumn[i]);
            if( sumColumn[i] > max )
            {
                max = sumColumn[i];
                maxColumn = i;
            }                                    
        }//end for 
        System.out.println("Max column: " + maxColumn);
    }//end main
}//end class
