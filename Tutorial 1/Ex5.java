import java.util.Scanner;

public class Ex5 {
   public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = sc.next().charAt(0);

        // Call the countOccurrences method and store the result in count
        int count = countOccurrences(inputString, targetChar);

        // Display the count of occurrences
        System.out.println("Occurrences of '" + targetChar + "' in the string: " + count);

        // Close the Scanner
        sc.close();
	}
	
	public static int countOccurrences(String input, char target) {
        int count = 0;

        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            // Check if the character matches the target character
            if (input.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
