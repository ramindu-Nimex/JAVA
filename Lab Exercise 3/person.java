public class person {
   private String name;
   private String address;

   person(String name, String address) {
      this.name = name;
      this.address = address;
   }

   public void showDetails() {
      System.out.println("Name : " + name);
      System.out.println("Address : " + address);
   }
}
