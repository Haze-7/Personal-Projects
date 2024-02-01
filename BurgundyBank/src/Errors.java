
public class Errors {

	//handle/ do error messages any time something is incorrectly done
	/*
	Default Constructor
	*/
	public Errors()
	{
		super();
	}
	
	/*
	 * Method for handling/ explaining to user that they have entered a selection that is not available
	 * Message: That is not an available selection, please try again.
	 * Act as accessor method/ "get:
	 */
	public static void SelectionNotAvailable()
	{
		System.out.println("That is not an available selection, please try again.");
	}
	
	
	/*
	 * Method for handling when user does not enter an integer
	 * Message: Please enter an integer.
	 */
	
}
