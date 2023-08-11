import java.util.Scanner;

public class studentApp {
   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student ID : ");
		String id = sc.nextLine();
		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
		
		student s1 = new student(id, name);
		
		System.out.print("Enter Mark 1 : ");
		int mark1 = sc.nextInt();
		System.out.print("Enter Mark 2 : ");
		int mark2 = sc.nextInt();
		System.out.print("Enter Mark 3 : ");
		int mark3 = sc.nextInt();
		
		s1.setSubject1(mark1);
		s1.setSubject2(mark2);
		s1.setSubject3(mark3);
		
		s1.calculateAverage();
		s1.displayInfo();
		
		sc.close();
	}
}
