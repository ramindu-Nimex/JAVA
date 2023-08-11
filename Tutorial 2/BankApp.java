import java.util.Scanner;

public class BankApp {
   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Create two BankAccount objects and assign values
		BankAccount account1 = new BankAccount("123456v", "Nimesh Ramindu", 1000.0);
      BankAccount account2 = new BankAccount("789101v", "Ramindu Nimesh", 10000.0);
        
      // Call the display method to print account details
      System.out.println("Account 1 Details : ");
      account1.displayinfo();
      account1.deposit(500.0);
      System.out.println();
        
      System.out.println("Account 2 Details:");
      account2.displayinfo();
      account2.withdraw(1000.0);
		
		sc.close();
	}
}
