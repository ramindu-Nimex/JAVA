public class MainEx2 {
   
   public static void main(String[] args) {
      
      ICompute obj1 = new Person("Danushka", 40000, 1000, 5);
      obj1.calculate();
      obj1.display();

      System.out.println();

      ICompute obj2 = new Box(10, 20, 30);
      obj2.calculate();
      obj2.display();
   }
}
