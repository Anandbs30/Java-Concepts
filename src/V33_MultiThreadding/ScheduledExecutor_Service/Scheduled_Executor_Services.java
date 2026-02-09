package V33_MultiThreadding.ScheduledExecutor_Service;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * If you want to work after a small delay or periodically then we can use the Scheduled Execute Services.
 * We have to create Scheduled Execute Services using Executors
 * Because : As we know the ScheduledExecutorService which extend the ExecutorService and again ExecutorService
 * is extends the Executor so 
 */
public class Scheduled_Executor_Services {
	public static void main(String[] args) { 
		//Note :  Every Executor have two sub method 1 with Runnable Interface and another one is Callable interface
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		//If we use the Schedule method then the task is goes under the queue and scheduler.shoutdown() method is wait.
//		scheduler.schedule(()->
//		System.out.println("The task has been completed after 5 sec as given !!"), 
//		5, //This is the time, Here which thread is running that needs to be wait until the given time is over.
//		TimeUnit.SECONDS);//This is the time format.
//		
//		//Once all the work is completes then the thread is become will be shout down.
//		scheduler.shutdown();
//		
		
		ScheduledExecutorService scheduler1 = Executors.newScheduledThreadPool(1);
		//inside executor we have 3 threads
		Executors.newFixedThreadPool(2);
		Executors.newSingleThreadExecutor();
		
		//This will run with a regular interval of time and it doesn't matter where how much time is required to 
		//complete the task or not, So here might be overlapping happens
		scheduler1.scheduleAtFixedRate(()->
			System.out.println("The task is execute after every 5 seconds!"),
			5,//Initial time after the thread starts
			5,//Periodic time means after starting 1st one the next will run after the given time either 1st one done or not.
			TimeUnit.SECONDS);	
		//Here this is also run the regular interval of time and also wait for the given time after execution completes of the 1st one
		//Here Overlapping is not happen.
		scheduler1.scheduleWithFixedDelay(()->
		System.out.println("The task is execute after every 5 seconds!"),
		5,//Initial time after the thread starts
		5,//Here this is the delay time means after execution of the 1st thread this will wait given time and then execute next one
		TimeUnit.SECONDS);
		
		/*
		 * The above two methods are not provide any futures to get that we need to use the ScheduleFuture method which provide the Future. 
		 */
		ScheduledFuture<?> scheduledFuture = scheduler1.scheduleWithFixedDelay(()->
		System.out.println("The task is execute after every 5 seconds!"),
		5,//Initial time after the thread starts
		5,//Here this is the delay time means after execution of the 1st thread this will wait given time and then execute next one
		TimeUnit.SECONDS);
		
		System.out.println(scheduledFuture.isDone());
		
		scheduler1.schedule(()->{
			System.out.println("Here Initiating the Shut down!!");
			scheduler1.shutdown();
		}, 21, TimeUnit.SECONDS);
	}	
}
