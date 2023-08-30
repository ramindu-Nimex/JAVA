public class Dog extends Animal {
   
   public Dog() {
      System.out.println("Dog constructor called");
   }

   public Dog(String name) {
      super(name);
   }

   public String speak() {
      return "Bow Bow";
   }
}
