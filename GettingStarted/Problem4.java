
import javax.swing.JOptionPane;

public class Problem4
{
    public static void main( String[] args )
    {
        int sum1 = 0;
        int sum2 = 0;
        
        int substract1 = 0;
        int substract2 = 0;
        
        int multiply1 = 0;
        int multiply2 = 0;
        
        int divide1 = 0;
        int divide2 = 0;
        
        int module1 = 0;
        int module2 = 0;

        
        String input1 = JOptionPane.showInputDialog( "Pick a number" );
        String input2 = JOptionPane.showInputDialog( "Pick another number" );
        
        int num1 = Integer.parseInt( input1 );
        int num2 = Integer.parseInt( input2 );
        
        sum1 = num1 + num2;
        System.out.println( input1 + " + " + input2 + " = " + sum1);
        sum2 = num2 + num1;
        System.out.println( input2 + " + " + input1 + " = " + sum2);
        
        substract1 = num1 - num2;
        System.out.println( input1 + " - " + input2 + " = " + substract1);
        substract2 = num2 - num1;
        System.out.println( input2 + " - " + input1 + " = " + substract2);
        
        multiply1 = num1 * num2;
        System.out.println( input1 + " * " + input2 + " = " + multiply1);
        multiply2 = num2 + num1;
        System.out.println( input2 + " * " + input1 + " = " + multiply2);
        
        divide1 = num1 / num2;
        System.out.println( input1 + " / " + input2 + " = " + divide1);
        divide2 = num2 + num1;
        System.out.println( input2 + " /" + input1 + " = " + divide2);
        
        module1 = num1 % num2;
        System.out.println( input1 + " % " + input2 + " = " + module1);
        module2 = num2 % num1;
        System.out.println( input2 + " % " + input1 + " = " + module2);
        
        
    }
} //end class problem4