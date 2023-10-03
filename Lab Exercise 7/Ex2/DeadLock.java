public class DeadLock {
   
   public static Object lock1 = new Object();
	
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne threadOne = new ThreadOne(lock1, lock2);
		ThreadTwo threadTwo = new ThreadTwo(lock1, lock2);
		threadOne.start();
		threadTwo.start();
	}
}
