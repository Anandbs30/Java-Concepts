package V34_Volatile_VS_Atomic.Volatile;
/*
 * Here below two threads are using an a variable and they are working in simultaneously due to this we require answer as 2000 but getting
 * less than the 2000 and some time 2000 so this is actually wrong and if we use here as Volatile keyword that also giving same issue.
 * So in these like conditions we have to use Atomicity keyword
 */
public class VolatileCounter {
	//The below doesn't resolve our issue.
	private volatile int count = 0;
	
	public void increment() {
		count++;
	}
	
	public int getCounter() {
		return count; 
	}
	
	public static void main(String[] args) throws InterruptedException {
		VolatileCounter vc = new VolatileCounter();
		Thread t1 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				vc.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				vc.increment();
			}
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(vc.getCounter());
	}
}
