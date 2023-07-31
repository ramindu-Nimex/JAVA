package myFirstJavaProgram;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		age = scanner.nextInt();
		
		if(age > 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Child");
		}
		
		scanner.close();
	}
}