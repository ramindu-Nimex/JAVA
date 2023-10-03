public class DeadLock {
   
   public static Object lock1 = new Object();
	
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
	}
}
