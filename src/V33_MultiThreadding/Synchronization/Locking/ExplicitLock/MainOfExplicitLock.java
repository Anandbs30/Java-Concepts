package V33_MultiThreadding.Synchronization.Locking.ExplicitLock;

public class MainOfExplicitLock {
	public static void main(String[] args) {
		ExplicitLockBank elb = new ExplicitLockBank();
		Runnable r = new Runnable() {
			@Override
			public void run() {
				elb.withdraw(50);
			}
		};
		
		Thread t = new Thread(r, "Thread1");
		Thread t1 = new Thread(r, "Thread2");
		Thread t2 = new Thread(r, "Minister");
		t.start();
		t1.start();
		
		
	}
}
