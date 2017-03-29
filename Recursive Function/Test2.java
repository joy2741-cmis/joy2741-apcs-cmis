
public class Test2
{
    public static void main( String[] args )
    {
        int[] nums = new int[] { 3, 7, 1, 9, 5, 8, 6, 2, 4, 0, 0, 99, 7 };  
        int l = nums.length / 3;
        int[] left = new int[l];
        int[] mid = new int[l];
        int[] right = new int[nums.length - l];
        for(int i = 0; i < nums.length; i++){
            int v = nums[i];
            if( i < l ){
                left[i] = v;
            } 
            else if( i > l && i < (l+l) )
            {
                mid[i] = v;
            }
            else            
            {
                right[i-l] = v;
            }
        }
        
        System.out.print("LEFT");
        for( int i = 0; 
    }
}
