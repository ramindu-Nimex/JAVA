public class Main {
   
   public static void main(String[] args) {
      
      Animal cat = new Cat("Micky");
      cat.display();

      Animal dog = new Dog("Rover");
      dog.display();

      ToyCat mytoy = new ToyCat("kittie", "Toysrus");
      mytoy.display();

      ToyCat myToy = new ToyCat();
      myToy.speak();
   }
}