
public class Test
{
    private int[][] nums;
    int runtime = 0;
    int[] nineCoordinates = new int[2];

    public Test(int d){
        nums = new int[d][d];
        this.nums = nums;
        
        //1pt --- loops over very item in 2d array
        for( int y = 0; y < nums.length; y++ )
        {
            for( int x = 0; x < nums[0].length; x++ )
            {
                //int number = nums[y][x];
                nums[y][x] = (int)(Math.random()*10);
                if( nums[y][x] == 9)
                {
                    if( runtime == 0)
                    {
                        //not on the edge
                        if( x == 0 )
                        {
                            //1pt ---- sets item to correct possible value
                            nums[y][x] = (int)((Math.random()*9)-1);
                        }//end edge x
                        else if ( y == 0 )
                        {
                            nums[y][x] = (int)((Math.random()*9)-1);
                        }//end edge y
                        else
                        {
                            nineCoordinates[0] = x;
                            nineCoordinates[1] = y;
                            runtime++;
                        }
                    }//end if runtime = 0
                     // 1pt ------ sets 9 in correct possible range (not in first or last row or column)
                    else if( runtime == 1 )
                    {
                        // 1pt ------ sets exactly 1 random item to 9
                        nums[y][x] = (int)(Math.random()*9);
                    }//end if runtime = 1
                }//end if number = 9
                //System.out.print(nums[y][x] + "   ");
            }//end for y
            //System.out.println("\n");
        }//end for x
        this.runtime = runtime;

        /**********************************************************************************************\
         * Modify this constructor method                                                             *
         * it must populate the 2D Array nums with digits from 0-9 inclusive -- DONE                         *
         * There must be ONE AND ONLY ONE 9 in the array.     -- DONE                                        *
         * The 9 must not be on the edge of the array (i.e. not in the first or last row or column) -- DONE  *
         * Everything should work for any positive value for d.  -- DONE                                     *
         **********************************************************************************************/
    }

    public void showArray(){
        for ( int y = 0; y < nums.length; y++ ){
            for ( int x = 0; x < nums.length; x++ ){
                int num = nums[y][x];
                System.out.print(nums[y][x] + "  ");
            }
            System.out.println();
        }  

        for( int i = 0; i < nineCoordinates.length; i++ )
        {
            System.out.println("Nine coordinates: " + nineCoordinates[i]);
        }//end for
    }

    public int[][] getNineAndFriends(){
        int[][] result = new int[3][3];
        int pX = nineCoordinates[0];
        int pY = nineCoordinates[1];
        int i = 0;
        int iX = 0;
        int iY = 0;
        //Modify this method so that it returns the 9 and the 8 digits surrounding it in column major order

        for ( int y = pY - 1; y < pY + 2; y++ ){
            for ( int x = pX - 1; x < pX + 2; x++ ){
                System.out.print(nums[x][y] + "  ");
            }
            System.out.println();
        }  

        for ( int y = pX - 1; y < pX + 2; y++ ){
            for ( int x = pY - 1; x < pY + 2; x++ ){
                int number = nums[x][y];
                //result[y][x] = nums[x][y];
                //System.out.print(result[y][x] + "  ");
            }
            System.out.println();
        } 
        return result;
    }

    public static void main(String[] args){   
        Test test = new Test(10);
        test.showArray();
        int[][] nine = test.getNineAndFriends();
        for( int y = 0; y < nine.length; y++){
            for( int x = 0; x < nine.length; x++){
                System.out.print(nine[y][x]);
            }
            System.out.println();
        }

    }

}//end class
