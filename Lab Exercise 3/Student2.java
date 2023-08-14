public class Student2 extends person {
   private String studentid;

   Student2(String name, String address, String studentid) {
      super(name, address);
      this.studentid = studentid;
   }

   public void showStudentDetails() {
      super.showDetails();
      System.out.println("Student ID : " + studentid);
   }
}
