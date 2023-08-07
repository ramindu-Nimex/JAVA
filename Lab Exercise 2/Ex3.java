import java.util.Scanner;

public class Ex3 {
   public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		
		// Read input from the user for length, width, and height
		System.out.print("Enter the length of the cube: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the width of the cube: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the cube: ");
        double height = sc.nextDouble();
        
        // Calculate the volume of the cube
        double volume = length * width * height;
        
        // Display the result
        System.out.println("Volume of the cube: " + volume);

        // Close the Scanner
        sc.close();
	}
}
