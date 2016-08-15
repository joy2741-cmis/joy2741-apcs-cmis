
public class FundamentalsP0
{
    public static void main( String[] args)
    {
        int numberOfChair = 15;
        
        System.out.println( "int numberOfChair = 15;" );
        System.out.println( "   Int is the default data type for integral values, \n" + 
                            "which is automatically set to 0. Using int, the numberOfChair \n" +
                            "is used as an integer. In this case, int numberOfChair = 15; means \n" +
                            "there are fifteen chairs. ");
        System.out.println( "   Boolean data type has two possible values: true and false. \n" +
                            "Below is a program that checks if the number of chairs exceed \n" +
                            "10. Due to numberOfChair being 15 (int numberOfChair = 15;), \n" +
                            "the statement is true." );
        
        
        if( numberOfChair > 10 )
        {
            System.out.println( "Result: too many chairs! ");
            System.out.println( "The numberOfChair exceeds 10; therefore, this statement is true ");
        }
        else
        { 
            System.out.println( "Result: get more chairs! ");
            System.out.println( "The numberOfChair does not exceed 10; therefore, this statement is false ");
        }
        
        
        
        
}
}
