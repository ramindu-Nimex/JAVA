public class Student {
   
   // variables declare
   private int studentID;
   private String name;
   private String degree;
   private String mobile;
   private static int max = 100; // initiate value for unique student ID value

   // overloaded constructor
   public Student(String name, String degree, String mobile) {
      this.name = name;
      this.degree = degree;
      this.mobile = mobile;
      this.studentID = max++; // increment student ID
   }

   // setters and getters
   public void setName(String name) {
      this.name = name;
   }

   public void setDegree(String degree) {
      this.degree = degree;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getName() {
      return name;
   }

   public String getDegree() {
      return degree;
   }

   public String getMobile() {
      return mobile;
   }

   // display the student details
   public void print() {
      System.out.println("Student ID : " + studentID);
      System.out.println("Student Name : " + name);
      System.out.println("Student Degree : " + degree);
      System.out.println("Student Mobile : " + mobile);
   }

   // get next Student ID
   public static int getNextStudentID() {
      return max;
   }
}