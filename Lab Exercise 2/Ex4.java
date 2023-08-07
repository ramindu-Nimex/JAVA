import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
   public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
            // Read input from the user for length, width, and height
            System.out.print("Enter the length of the cube: ");
            double length = Double.parseDouble(br.readLine());

            System.out.print("Enter the width of the cube: ");
            double width = Double.parseDouble(br.readLine());

            System.out.print("Enter the height of the cube: ");
            double height = Double.parseDouble(br.readLine());

            // Calculate the volume of the cube
            double volume = length * width * height;

            // Display the result
            System.out.println("Volume of the cube: " + volume);

            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading input");
        }
	}
}
