
public class Test
{
    private int[][] nums;
    int runtime = 0;
    int[] nineCoordinates = new int[2];

    public Test(int d){
        nums = new int[d][d];
        this.nums = nums;
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
                    else if( runtime == 1 )
                    {
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
        //Modify this method so that it returns the 9 and the 8 digits surrounding it in column major order
         for ( int y = 0; y < nums.length; y++ ){
            for ( int x = 0; x < nums.length; x++ ){
                int num = nums[y][x];
                if( x == (nineCoordinates[0] - 1) && y > (nineCoordinates[0] + 3))//Y left
                {
                    System.out.println("Y-: " + nums[y][x] + "  ");
                }
                else if( x == (nineCoordinates[0] + 1) )
                {
                    System.out.println("Y+: " + nums[y][x] + "  ");
                }
                else if( y == (nineCoordinates[0] - 1) )
                {
                    System.out.println("X-: " + nums[y][x] + "  ");
                }
                else if( y == (nineCoordinates[0] + 1) )
                {
                    System.out.println("Y-: " + nums[y][x] + "  ");
                }
                //System.out.print(nums[y][x] + "  ");
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
