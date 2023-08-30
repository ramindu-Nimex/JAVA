public class Box implements ICompute {
   
   private int length, width, height;
   private int volume;

   public Box(int length, int width, int height) {
      this.length = length;
      this.width = width;
      this.height = height;
   }

   public void calculate() {
      volume = length * width * height;
   }

   public void display() {
      System.out.println("Volume : " + volume);
   }
}
