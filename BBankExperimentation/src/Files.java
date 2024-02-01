 import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class Files {
	
	Scanner in = new Scanner(System.in);
	private String username = "";
	private String password = "";
	private String securityQuestion = "";
	private String securityAnswer = "";
	
	public void CreateUserFile() throws FileNotFoundException{

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
		
		
		PrintWriter userFile = new PrintWriter("user" + username + ".txt"); //reuse for bank account files but w/
		
		userFile.println("User:" + username);
		userFile.println("========================");
		userFile.println("Username: "+ username);
		userFile.println("Password: " + password);
		userFile.println("Security Question: " + securityQuestion);
		userFile.println("Security Answer: " + securityAnswer);
		userFile.println("========================");

		System.out.println("File Created!");
		System.out.println("Name: " + "user" + username + ".txt");
		System.out.println("Lol");
		//while (newFileName.equals(fileName))
		
		//fileExists = new File(fileName).exists();
		//while(increment <= prev)
		//while(fileExists)
		//{
		
		//increment++;
		//System.out.println(increment);
		//}
		//fileName = newFileName;
		//prev = increment;
		//System.out.println(prev);
		//System.out.println(increment);
		
		//PrintWriter userFile = new PrintWriter(newFileName + username + ".txt");
		userFile.close();
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
