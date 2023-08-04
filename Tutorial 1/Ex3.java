import java.util.Scanner;

public class Ex3 {
   
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ask user to enter a number
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// ask user to enter a range
		System.out.println("Enter a Ramnge : ");
		int range = sc.nextInt();
		
		// starting from up to "range" calculate the multiplication table of "number"
		for(int i = 1; i <= range; i++) {
			int result = number * i;
			System.out.println(number + " * " + i + " = " + result);
		}
		sc.close();
	}
}
