public class Student {
   private String name;
   private String ditno;
   private String address;

   Student() {
      this.name = null;
      this.ditno = null;
      this.address = null;
   }

   Student(String name, String ditno, String address) {
      this.name = name;
      this.ditno = ditno;
      this.address = address;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setDit(String ditno) {
      this.ditno = ditno;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getName() {
      return name;
   }

   public String getDit() {
      return ditno;
   }

   public String getAddress() {
      return address;
   }

   public String getDetails() {
      return "I am a Student.\nMy name is " + name + "\nI am From " + address + "\nMy dit no is " + ditno;
   }
}