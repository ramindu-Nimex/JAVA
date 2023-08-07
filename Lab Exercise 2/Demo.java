import java.util.Scanner;

class EvenOddNumber {
	public boolean findEvenOrOdd(int i) {
		return (i % 2 == 0);
	}
}

public class Demo {
   
      public static void main(String[] args) {
		
		// Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Create an object of the EvenOddNumber class
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        
        // Read input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Call the findEvenOrOdd method and display the result
        boolean isEven = evenOddNumber.findEvenOrOdd(number);
        System.out.println(number + " is " + (isEven ? "even" : "odd"));
        
        // Close the Scanner
        sc.close();
	}
}
