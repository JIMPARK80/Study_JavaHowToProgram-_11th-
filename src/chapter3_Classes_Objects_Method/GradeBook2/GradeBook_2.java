package chapter3_Classes_Objects_Method.GradeBook2;
// GradeBook class that contains a courseName instance variable
// and methods to set get its value

public class GradeBook_2 
{
	private String courseName; // course name for this GradeBook
	
	// method to set the course name
	public void setCourseName( String name ) // method-1
	{
		courseName = name; // store the course name
	} // end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName() // method-2
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage() // method-3
	{
		System.out.printf( "Welcome to the grade book for \n%s!\n",
				getCourseName());
	} //end method displayMessage
} // end class GradeBook_2

