package myFirstJavaProgram;

public class Demo {

	public static void main(String[] args) {
		int i,j;
		
		i = 1;
		
		while(i <= 5) {
			j = 1;
			while(j <= 5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}