public class PartTimeStudent extends Student2 {
   private int noOfWorkingHours;

   PartTimeStudent(String name, String address, String studentid, int noOfWorkingHours) {
      super(name, address, studentid);
      this.noOfWorkingHours = noOfWorkingHours;
   }

   public void showPartTimeStudentDetails() {
      super.showStudentDetails();
      System.out.println("Working Hours : " + noOfWorkingHours);
   }
}
