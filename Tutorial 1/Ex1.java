import java.util.Scanner;

public class Ex1 {
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		int fact = 1;
		
		System.out.println("Enter a Number : ");
		number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Please Enter a Positive integer");
		}
		else {
			
			for(int i = 1; i <= number; i++) {
				fact = fact * i;
			}
		}
		
		System.out.println("Factorial of " + number + " is " + fact);
		sc.close();
	}
}
