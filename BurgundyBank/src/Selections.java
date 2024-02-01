import java.util.Scanner;

public class Selections {

	//handles selections for each page
	
	//instance variables/ members
	//int welcomeSelection = 0;
	
	
	Scanner in = new Scanner(System.in);
	
	public Selections()
	{
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();
		int numberOfSelections = 0;
		
		if (0 <= selection && selection <= numberOfSelections)
		{	
			switch (selection) {
			
			case 1: 
				System.out.println("Login");
				break;
			case 2: 
				System.out.println("New Account");
				break;
			case 3: 
				System.out.println("Change Password");
				break;
		}
		}
		else
		{
			//Errors outside = new Errors();
			Errors.SelectionNotAvailable();
		}
		in.close();
	}
	
	int welcomeSelection = in.nextInt();
	/*
	 * Handles Selection Options for Welcome Page
	 */
	public void WelcomeSelections() {
		
		int numberOfSelections = 3;

		if (0 <= numberOfSelections  && numberOfSelections <= 2)
		{
		switch (welcomeSelection) {
		
			case 1: 
				System.out.println("Login");
				break;
			case 2: 
				System.out.println("New Account");
				break;
			case 3: 
				System.out.println("Change Password");
				break;
		}
		}
		else
		{
			//Errors outside = new Errors();
			Errors.SelectionNotAvailable();
		}

	}
}
