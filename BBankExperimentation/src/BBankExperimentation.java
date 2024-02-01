import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class BBankExperimentation{

	public static void main(String[] args) throws FileNotFoundException{
		
		//Variable Declaration
		
		//WelcomePage
		
		//Selection 1:

		
		
		
		//Welcome Page
		System.out.println("Welcome to Burgundy Bank!");
		System.out.println("Please sign in or create an account.");
		System.out.println("[0] Log in");
		System.out.println("[1] Create New Account");
		System.out.println("[2] Change Password");
		
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();
		Files file = new Files();
		if (selection >= 0 && selection <= 2)
		{
			//switch statements in selections may be better / call selections
			if (selection == 0)
			{
				//run log in page
				System.out.println("Log in Page");

			}
			if (selection == 1)
			{
				//Files file = new Files()
				
				file.CreateUserFile();
				
			}
			if(selection == 2)
			{
				//run change password page
				System.out.println("Change Password Page");
			}
		}
		else
		{
			System.out.println("Please enter a valid interger selection from 0-2");
		}
		

	}

}
