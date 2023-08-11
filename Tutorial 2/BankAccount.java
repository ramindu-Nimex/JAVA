public class BankAccount {
   private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	// create an default constructor
	public BankAccount() {
		this.accountNumber = null;
		this.accountHolderName = null;
		this.balance = 0.0;
	}
	
	// create an overloaded constructor
	public BankAccount(String paccountNumber, String paccountHolderName, double balance) {
		this.accountNumber = paccountNumber;
		this.accountHolderName = paccountHolderName;
		this.balance = balance;
	}
	
	// setter and Getter for balance
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public double getbalance() {
		return balance;
	}
	
	// Method to deposit funds
   public void deposit(double amount) {
      balance += amount;
   }
    
   // Method to withdraw funds
   public void withdraw(double amount) {
      if (amount <= balance) {
         balance -= amount;
      } else {
         System.out.println("currently balance is " + balance + " Pleace withdraw minimum balanace");
      }
    }
    
   // Method to display account details
   public void displayinfo() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Account Holder's Name: " + accountHolderName);
      System.out.println("Balance: " + balance);
   }
}
