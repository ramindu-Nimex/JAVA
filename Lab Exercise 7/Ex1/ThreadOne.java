public class ThreadOne extends Thread {
   
   public void run() {
		System.out.println("Started Executing Thread 1");

		Object lock1 = 0;
		synchronized (lock1) {
			System.out.println("Thread 1 holding lock 1....");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("There 1 is waiting for the lock2");

			Object lock2 = 0;
			synchronized (lock2) {
				System.out.println("This 1 is holding lock 1 & lock 2");
			}
		}
	}
}
