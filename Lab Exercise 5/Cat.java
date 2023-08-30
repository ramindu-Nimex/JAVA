public class Cat extends Animal{
   
   public Cat() {
      System.out.println("Cat constructor called");
   }

   public Cat(String name) {
      super(name);
   }

   public String speak() {
      return "Meow Meow";
   }
}
