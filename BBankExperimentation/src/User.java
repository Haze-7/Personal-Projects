
public class User {
	
	private String username;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	private int numOfBankAccounts;
	
	
	
	
	public User(String username, String password, String securityQuestion, String securityAnswer, int numOfBankAccounts)
	{
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.numOfBankAccounts = numOfBankAccounts;
	}
	
	public User()
	{
		username = "haze7";
		password = "Zebra25";
		securityQuestion = "What is this?";
		securityAnswer = "It is that";
		numOfBankAccounts = 3;
	}
	
	public void setUser() {
		
	}
	
	public void getUser() {
		
	}
	
	

}
