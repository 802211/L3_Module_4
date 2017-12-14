package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.

	// public static void main(String[] args) {
	// printNumbers(10);
	// }
	//
	// static void printNumbers(int n) {
	// if(n>0) {
	// printNumbers(n-1); (*~*~*~*~*Do this in a new thread*~*~*~*~*)
	// }
	// System.out.println(n);
	// }

	public static void main(String[] args) {

		ThreadRG(1);
	}

	static int ThreadRG(int i) {

		if (i < 50) {

			//System.out.println(i);
			Thread t = new Thread(() -> {
			ThreadRG(i+1);
					
					
			});
			
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
System.out.println("Hello from Thread #" + i);
		return i;
		
	}
}
