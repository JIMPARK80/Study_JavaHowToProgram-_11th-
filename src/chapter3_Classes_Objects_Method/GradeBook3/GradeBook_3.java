package chapter3_Classes_Objects_Method.GradeBook3;
// GradeBook class with a constructor to initialize the course name.

public class GradeBook_3 
	{
	private String courseName; // course name for the this GradeBook

	// constructor initializes courseName with String argument
	public GradeBook_3( String name ) // declare GradeBook's constructor
	{ // indicates that the constructor has a String parameter called name
		courseName = name; // initializes courseName
	} // end constructor

	// method to set the course name
	public void setCourseName( String name )
	{
		courseName = name; // store the course name
	} // end method setCourseName

	// method to retrieve the course name
	public String getCourseName() 
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage() 
	{
		// this statement calls getCourseName to get the name of the course this
		// GradeBook represents
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
	} // end method displayMessage
} // end class GradeBook
