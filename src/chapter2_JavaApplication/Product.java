// Ex.2.6 Product.java // Calculate the product of three integers.
package chapter2_JavaApplication;
import java.util.Scanner; // program uses Scanner

public class Product 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int x; // first number input by user
		int y; // second number input by user
		int z; // third number input by user
		int result; // product of numbers
		
		
		System.out.print( "Enter first integer: "); // prompt for input
		x = input.nextInt(); // read first integer
		 
		System.out.print( "Enter second integer: "); // prompt for input
		y = input.nextInt(); // read second integer
		
		System.out.print( "Enter third integer: "); // prompt for input
		z = input.nextInt(); // read third integer
		
		result = x * y * z; // calculate product of numbers
		
		System.out.printf( "Product is %d\n", result);
	} // end method main
} // end class Product



//Using the statements you wrote in Exercise 2.5, write a complete program that calculates
//and prints the product of three integers.

//a) State that a program will calculate the product of three integers.
// -> // Calculate the product of three integers
//b) Create a Scanner called input that reads values from the standard input.
// -> Scanner input = new Scanner(System.in);
//c) Declare the variables x, y, z and result to be of type int.
// -> int x, y, z, result; or
// -> int x;
// -> int y;
// -> int z;
// -> int result;
//d) Prompt the user to enter the first integer.
// -> System.out.print( "Enter first integer: ");
//e) Read the first integer from the user and store it in the variable x.
// -> x = input.nextInt();
//f) Prompt the user to enter the second integer.
// -> System.out.print( "Enter second integer: ");
//g) Read the second integer from the user and store it in the variable y.
// -> y = input.nextInt();
//h) Prompt the user to enter the third integer.
// -> System.out.print( "Enter third integer: ");
//i) Read the third integer from the user and store it in the variable z.
// -> z = input.nextInt();
//j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.
// -> result = x * y * z 
//k) Display the message "Product is" followed by the value of the variable result.
// -> System.out.printf( "Product is %d\n", result);