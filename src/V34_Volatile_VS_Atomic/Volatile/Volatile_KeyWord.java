package V34_Volatile_VS_Atomic.Volatile;
/*
 Here Volatile keyword
 Basically creating an Shared Resources and there the flag is boolean and its value is false and 
 created 2 threads 1) readThread and 2) writeThread
  writeThread makes flag as true then readThread will read the flag
 
 NOTE : Every thread store the object copy into the local cache for performance reasons
 
 Here below 
 */


class SharedResources{
	//Here we used volatile keyword which denotes that or tell that to thread as don't use the 
	//variable from the cache use directly from RAM or main memory.
	private volatile boolean flag = false;
	
	public void setFlag() {
		System.out.println("Writer thread made the flag as true!!");
		flag = true;
	}
	
	public void printIfFlagIsTrue() {
		while(!flag) {
			
		}
		System.out.println("The flag is true!!");
	}
}
public class Volatile_KeyWord{
	public static void main(String[] args) {
		SharedResources sr = new SharedResources();
		Thread writerThread = new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			sr.setFlag();
		});
		
		Thread readerThread = new Thread(()->sr.printIfFlagIsTrue());
		
		writerThread.start();
		readerThread.start();
	}
}
