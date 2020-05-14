import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "GitHub Welcome's you ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/

        System.out.print("Eneter any integer number :- ");
        int num_i = scan.nextInt();
        
        System.out.print("Eneter any decimal number :- ");
        double num_d = scan.nextDouble();
        scan.nextLine();
        
        System.out.print("Eneter your Name :- ");
        String str = scan.nextLine();

        num_i = num_i + i;
        num_d = num_d + d;
        str = s.concat(str);

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
          
        System.out.println(num_i);
        System.out.println(num_d);
        System.out.println(str);

        scan.close();
    }
}
