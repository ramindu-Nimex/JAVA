import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0, count = 0;
		
		System.out.println("Enter a series of numbers : ");
		
//		accept user input untill a negative numbers
		while(true) {
			// accept one number
			int number = sc.nextInt();
			
			// if number is negative exit the while loop
			if(number < 0) {
				break;
			}
			
			// add the number to total
			total += number;
			// increase the count of numbers by one
			count++;
		} // exit the while loop
		
		if(count > 0) {
			// calculate average
			double avg = (double) total / count;
			System.out.println("Average Value is : " + avg);
		}
		else {
			// print message
			System.out.println("No any input given");
		}
		sc.close();
	}
}
