public class ThreadTwo extends Thread {

	Object lock1;
	Object lock2;
	
	public ThreadTwo(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
   
   public void run() {
		System.out.println("Started Executing Thread 2");

		Object lock2 = 0;
		synchronized (lock2) {
			System.out.println("Thread 2 holding lock 2....");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("There 2 is waiting for the lock1");

			Object lock1 = 0;
			synchronized (lock1) {
				System.out.println("This 2 is holding lock 1 & lock 2");
			}
		}
	}
}
