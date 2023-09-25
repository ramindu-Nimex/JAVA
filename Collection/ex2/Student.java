package ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int studentID;
	private String Name;
	private double gpa;

	public Student(int studentID, String name, double gpa) {
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

	public static void main(String[] args) {
		
		List<Student> StudentList = new ArrayList<>();
		StudentList.add(new Student(1, "Ramindu", 3.6));
		StudentList.add(new Student(2, "Messi", 3.5));
		StudentList.add(new Student(3, "Ronaldo", 3.4));
		
		for(Student s : StudentList) {
			System.out.println("Student Name : " + s.getName());
			System.out.println("Student ID : " + s.getStudentID());
			System.out.println("Student GPA : " + s.getGpa());
			System.out.println();
		}
	}
}
