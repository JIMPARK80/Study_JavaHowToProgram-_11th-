package chapter3_Classes_Objects_Method.GradeBook2;
import java.util.Scanner; // program uses Scanner

public class GradeBookTest_2 
{
	public static void main( String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		GradeBook_2 myGradeBook = new GradeBook_2();
		
		System.out.printf( "Initial course name is : %s\n\n", 
				myGradeBook.getCourseName() );
		
		System.out.println( "Please enter the course name: ");
		String theName = input.nextLine(); // read a line of text
		
		myGradeBook.setCourseName(theName); // set the course name
		System.out.println();
		
		myGradeBook.displayMessage();
	}
}
