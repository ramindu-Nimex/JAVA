import java.util.Scanner;

public class Ex4 {
   
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		String output = "";
		
		int len = input.length();
		for(int i = len - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println("Reverse input is : " + output);
		
		sc.close();
	}
}
