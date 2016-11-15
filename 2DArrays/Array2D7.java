import javax.swing.JOptionPane;
public class Array2D7
{
    public static void main( String[] args )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        int[][] gameBoard = new int[input][input];

        int randomRow = (int)(Math.random()*input);
        int randomColumn = (int)(Math.random()*input);

        boolean correctRow = false;
        boolean correctColumn = false;

        for( int x = 0; x < gameBoard.length; x++ )
        {
            for( int y = 0; y < gameBoard[0].length; y++ )
            {
                gameBoard[x][y] = ((int)(Math.random()*99)+1);
                //System.out.print("X   ");
                gameBoard[randomRow][randomColumn] = 0;
                System.out.print(gameBoard[x][y] + "   ");
            }//end inner for
            System.out.println("\n");
        }//end outer for                   
        
        System.out.println("Zero: " + (randomRow + 1)  + ", " + (randomColumn + 1));
        
        int rowZero = Integer.parseInt(JOptionPane.showInputDialog("Guess the row"));
        int columnZero = Integer.parseInt(JOptionPane.showInputDialog("Guess the column"));

        if ( rowZero == randomRow + 1  )
        {
            correctRow = true;
        }
        else
        {
            int output = 0;
            if( rowZero > randomRow + 1  )
            {
                output = rowZero - (randomRow + 1 );
            }
            else
            {
                output = randomRow - (rowZero + 1 );
            }
            System.out.println("You are off by " + output + " rows");
        }//end if

        if ( columnZero == randomColumn + 1  )
        {
            correctColumn = true;
        }
        else
        {
            int output = 0;
            if( columnZero > randomColumn + 1  )
            {
                output = columnZero - (randomColumn + 1 );
            }
            else
            {
                output = randomColumn - (columnZero + 1);
            }
            System.out.println("You are off by " + output + " columns");
        }//end if

        if( correctRow == true && correctColumn == true )
        {
            System.out.println("BAM! You found the number 0!");
        }//end if

    }//end main
}//end class
