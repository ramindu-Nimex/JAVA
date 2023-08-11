import java.util.Scanner;

public class PointApp {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x coordinate of point 1 : ");
		int x1 = sc.nextInt();
		
		System.out.print("Enter y coordinate of point  : ");
		int y1 = sc.nextInt();
		
		System.out.print("Enter z coordinate of point 1 : ");
		int z1 = sc.nextInt();
	
		Point3D point1 = new Point3D(x1, y1 , z1);
		double result = point1.distance();
		System.out.println("Distance : " + result);

      sc.close();
	}
}