import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class Files {
	
	public void CreateUserFile() throws FileNotFoundException{
		
		
		String username = "";
		String password = "";
		String securityQuestion = "";
		String securityAnswer = "";
		
		int prev = 0;
		int increment = 1;
		String fileName = ("UserData" + prev);		
		String newFileName = ("UserData" + increment);
		
		Scanner in = new Scanner(System.in);
		
		//run account creation page
		System.out.println("We're happy to have you! Please provide your information.");
		
		System.out.println("Username: ");
		username = in.nextLine();
		
		System.out.println("Password: ");
		password = in.nextLine();
		
		System.out.println("Security Question");
		securityQuestion = in.nextLine();
		
		System.out.println("Security Answer");
		securityAnswer = in.nextLine();
		
		//while (newFileName.equals(fileName))
		while(increment <= prev)
		{
		
		increment++;
		System.out.println(increment);
		}
		//fileName = newFileName;
		prev = increment;
		System.out.println(prev);
		System.out.println(increment);
		/*
		PrintWriter userFile = new PrintWriter(newFileName + increment + ".txt");
		
		
		userFile.println("User:" + increment);
		userFile.println("========================");
		userFile.println("Username: "+ username);
		userFile.println("Password: " + password);
		userFile.println("Security Question: " + securityQuestion);
		userFile.println("Security Answer: " + securityAnswer);
		userFile.println("========================");

	userFile.close();
	*/
	}
	
	public void WriteFile() {

	}
	
	public void ReadFile() {
		
		
		int increment = 1;
		
		File userFile = new File("userData0" + ".txt");
		
		while (userFile.exists())
		{
			increment++;
			userFile = new File("userData" + increment + ".txt");
			System.out.println("file creation ran: " + increment);
		}
	}
	
	public void CreateBankAccFile()
	{
		
	}

	
}
