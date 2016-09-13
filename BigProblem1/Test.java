
public class Test {       

    public static void main(String[] args) {   

        int array[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};

        String output = "Element\tValue\tHistogram";

        for ( int counter = 0; counter < array.length; counter++ ) {

            output += "\n" + counter + "\t" + array[ counter ] + "\t";

            for ( int stars = 0; stars < array[ counter ]; stars++ ) {

                output += "*";  

            }
        }

        System.out.println(output);

    } // End of method main

 

} // End of class Histogram