public class DemoApp {
   
   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 5;

      int addition = Calculation.add(num1, num2);
      System.out.println("addition : " + addition);

      int subtraction = Calculation.subtract(num1, num2);
      System.out.println("subtraction : " + subtraction);
   }
}
