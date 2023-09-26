package ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student2 {
	
	private int studentID;
	private String Name;
	private double gpa;

	public Student2(int studentID, String name, double gpa) {
		this.studentID = studentID;
		Name = name;
		this.gpa = gpa;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return Name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
        return "Student [studentID=" + studentID + ", name=" + Name + ", GPA=" + gpa + "]";
    }

	public static void main(String[] args) {
		
		Map<Integer, Student2> studentMap = new HashMap<>();
		
		
		studentMap.put(1, new Student2(1, "Ramindu", 3.6));
        studentMap.put(2, new Student2(2, "Messi", 3.5));
        studentMap.put(3, new Student2(3, "Ronaldo", 3.4));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student number: ");
        int studentNumber = scanner.nextInt();

        Student2 student = studentMap.get(studentNumber);
        if (student != null) {
            System.out.println("Student Details:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
	}
}