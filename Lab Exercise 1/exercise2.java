package myFirstJavaProgram;

public class Demo {

	public static void main(String[] args) {
		
		String name = "ARDP Ranasignhe";
		String regNo = "DIS\\08\\M4\\1234";
		String address = "Malabe";
		
		String line = "=".repeat(30);
		
		System.out.println(line);
		System.out.println("=\tStudent Information\t\t=");
		System.out.println(line);
		System.out.println("=Name\t\t:" + name + "\t=");
		System.out.println("=Reg No\t\t:" + regNo + "\t=");
		System.out.println("=Address\t\t:" + address + "\t=");
		System.out.println(line);
	}
}