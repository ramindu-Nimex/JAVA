public class Test {
   public static void main(String[] args) {
      Student student = new Student("Ramindu","IT123","Colombo");

      System.out.println("Student one Details : ");
      System.out.println("Name : " + student.getName());
      System.out.println("Dit No : " + student.getDit());
      System.out.println("Address : " + student.getAddress());
      System.out.println();

      student.setName("Nimesh");
      student.setDit("DIT/11/C1/0010\r");
      student.setAddress("Malabe");

      System.out.println("Student Two Details : ");
      System.out.println("Name : " + student.getName());
      System.out.println("Dit No : " + student.getDit());
      System.out.println("Address : " + student.getAddress());
      System.out.println();

      System.out.println(student.getDetails());
   }
}
