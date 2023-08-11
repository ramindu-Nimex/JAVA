public class student {
   private String studentID;
	private String studentName;
	private int subject1, subject2, subject3;
	double average;
	
	public void setSubject1(int m1) {
		subject1 = m1;
	}
	public void setSubject2(int m1) {
		subject2 = m1;
	}
	public void setSubject3(int m1) {
		subject3 = m1;
	}
	
	// create an default constructor
	public student() {
		this.studentID = null;
		this.studentName = null;
		this.subject1 = 0;
		this.subject2 = 0;
		this.subject3 = 0;
	}
	
	// create an overloaded constructor
	public student(String pstudentID, String pstudentName) {
		this.studentID = pstudentID;
		this.studentName = pstudentName;
		this.subject1 = 0;
		this.subject2 = 0;
		this.subject3 = 0;
	}
	
	// Method to calculate and store the average
	public void calculateAverage() {
		average = (subject1 + subject2 + subject3) / 3.0;
	}
	
	// Method to display student information and average marks
   public void displayInfo() {
      System.out.println("Student ID: " + this.studentID);
      System.out.println("Student Name: " + this.studentName);
      System.out.println("Average Marks: " + this.average);
   }
}
