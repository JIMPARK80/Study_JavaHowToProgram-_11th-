package chapter3_Classes_Objects_Method.GradeBook3;
// GradeBook constructor used to specify the course name at the time each GradeBook object is created
public class GradeBookTest {
	// main method begins program execution
	public static void main (String[] args)
	{
		// create GradeBook object
		GradeBook_3 gradeBook1 = new GradeBook_3("CS101 Introduction to Java Programming ");
		
		GradeBook_3 gradeBook2 = new GradeBook_3("CS102 Data Structure in Java" );		
		// display initial value of courseName for each GradeBook
		System.out.printf( "gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
		System.out.printf( "gradeBook2 course name is: %s\n", gradeBook2.getCourseName());
	} // end main
} // end class GradeBookTest
