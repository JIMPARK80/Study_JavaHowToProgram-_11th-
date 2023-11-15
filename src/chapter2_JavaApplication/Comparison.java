// Fig 2.15 Comparison.java // Compare integers using if statements, relational operators 
// and equality operators.
package chapter2_JavaApplication;
import java.util.Scanner;

public class Comparison 
{
	// main method begins execution of java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print( "Enter first integer: "); //prompt
		number1 = input.nextInt();
		
		System.out.print( "Enter second integer: "); // prompt
		number2 = input.nextInt();
		
		if ( number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if ( number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if ( number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if ( number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if ( number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if ( number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
	} // end method main
} // end class Comparison
