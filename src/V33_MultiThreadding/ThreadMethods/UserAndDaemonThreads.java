package V33_MultiThreadding.ThreadMethods;


/*
Here User thread : The thread which we are creating in the main method using the new keyword, 
					Here JVM is wait for the thread completion.
Daemon Thread : The thread which working in background, Here JVM is not wait for termination or response 
				 We can set the user thread as DAEMON thread.
*/

public class UserAndDaemonThreads extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("Nothing to do");
		}
	}
	
	
	public static void main(String[] args) {
		UserAndDaemonThreads uadt = new UserAndDaemonThreads();
		//Here now the threads works for a while or sometimes not work and directly print the main class SOP method.
		//AS WE KNOW JVM is not wait for the daemon thread.
		uadt.setDaemon(true);
		uadt.start();
		System.out.println("The main is Completed");
	}

}
