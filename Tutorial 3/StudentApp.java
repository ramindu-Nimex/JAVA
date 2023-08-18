public class StudentApp {
   
   public static void main(String[] args) {
      // Create an array of Student objects
      Student student[] = new Student[5];

      // Instantiate 5 Student objects
      student[0] = new Student("Ramindu", "SE", "0112222222");
      student[1] = new Student("Nimesh", "CS", "0113333333");
      student[2] = new Student("Messi", "CSNE", "0114444444");
      student[3] = new Student("Ronaldo", "ISE", "0117777777");
      student[4] = new Student("NeymJR", "DS", "0119999999");

      // Display the details of all the 5 students
      for(int i = 0; i < 5; i++) {
         student[i].print();
         System.out.println();
      }
   }
}
