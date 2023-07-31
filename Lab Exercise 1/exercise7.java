package myFirstJavaProgram;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number One Value : ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter Number Two Value : ");
		num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		double average = (double)sum / 2;
		
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + average);
		
		scanner.close();
	}
}