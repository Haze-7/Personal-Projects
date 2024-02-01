
public class Interface {

	//instance variable roundup
	private int selection; // find way to link to # of bank accounts for each user
	
	/*
	 * Display Welcome screen
	 * Utilize necessary data when needed
	 */
	public static void WelcomePage() {
		System.out.println("Welcome to Burgundy Bank!");
		System.out.println("Please sign in or create an account.");
		System.out.println("[0] Log in");
		System.out.println("[1] Create New Account");
		System.out.println("[2] Change Password");
	}
	
	
	/*
	 * happens when you select 0 (log in)
	 * Display login Screen
	 */
	public static void LoginScreen() {
		System.out.println("Please Enter your Username and Password");
		System.out.println("Username: "); // need to be able to input and then click enter
		System.out.println("Password: "); //need to be able to input and then click enter
	}
	
	/*
	 * 
	 */
	public static void UserPage() {
		//System.out.println("Welcome " + user + "! Please select a Bank Account to access:);
		//for (int i = 0; i <= selection; i++)
		//{
			//System.out.println("[" + selection + "] " + accountName);
		//}
		//at n + 1, have [n+1] selection to Log Out and return to login page
		
	}
	/*
	 * Display bank account action screen to make selections
	 * Selections:
	 * 0. Check Balance
	 * 1. Deposit
	 * 2. Withdraw
	 * 3. Transfer
	 * 4. View Past Transcations/History
	 * 5. Go back/Return
	 */
	public static void BankAccountActions() {
		System.out.println("[0] Check Balance");
		System.out.println("[1] Deposit");
		System.out.println("[2] Withdraw");
		System.out.println("[3] Transfer");
		System.out.println("[4] View Past Transactions / History");
		System.out.println("[5] Go back / Return");
	}
	/*
	 * varaible: transactionselect: holds whatever selection was made in previous section between withdraw/ deposit
	 * this ^^ is also how we determine which to run
	 */
	public static void TransactionSelect() {
		//System.out.println("Sounds good, how much would you like to " + transactionSelection + "?");
		System.out.println("[0] $10");
		System.out.println("[1] $20");
		System.out.println("[2] $50");
		System.out.println("[3] $100");
		System.out.println("[4] Custom Ammount...");
		
	
		
	}
	//make Selections() method to handle selecting items (scanner for certain keys/ case set / breaks
}


