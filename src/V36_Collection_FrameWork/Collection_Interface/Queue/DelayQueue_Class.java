package V36_Collection_FrameWork.Collection_Interface.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_Class {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread-safe unbounded blocking queue.
		 * Elements can only be taken from the queue when their delay has expired.
		 * Useful for scheduling tasks to be executed after a certain delay.
		 * internally uses priority queue.
		 */
		//Here below get an issue as its says that we have to pass the parameter as class which implements the Delayed interface.
		//as we know String class is not implements the Delayed interface.
//		BlockingQueue<String> bq = new DelayQueue<>();
		
		//Here in below Task 2 is high priority as its delay is less compared to remaining others.
		BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();
		delayQueue.put(new DelayedTask("Task 1", 5, TimeUnit.SECONDS));
		delayQueue.put(new DelayedTask("Task 2", 3, TimeUnit.SECONDS));
		delayQueue.put(new DelayedTask("Task 3", 10, TimeUnit.SECONDS));
		
		while(!delayQueue.isEmpty()) {
			DelayedTask take = delayQueue.take();//Here it blocks until a task's delay has expired.
			System.out.println("Executed : "+take.getTaskName()+" at "+System.currentTimeMillis());
		}
	}
}
class DelayedTask implements Delayed{
	
	private final String taskName;
	private final long startTime;
	
	public DelayedTask(String taskName, long delay, TimeUnit unit) {
		this.taskName = taskName;
		this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
	}

	@Override
	public int compareTo(Delayed o) {
		if(this.startTime < ((DelayedTask) o).startTime) {
			return -1;
		}
		if(this.startTime > ((DelayedTask) o).startTime) {
			return 1;
		}
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long remaining = startTime - System.currentTimeMillis();
		return unit.convert(remaining, TimeUnit.MILLISECONDS);
	}
	
	public String getTaskName() {
		return taskName;
	}
}