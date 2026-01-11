package V33_MultiThreadding.ThreadMethods;

public class SettingThreadNameAndPriority extends Thread{
	
	public SettingThreadNameAndPriority(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5;i++) {
			String a = "";
			for(int j = 0; j<=1000;j++) {
				a += a;
			}
			System.out.println("The current thread is : "+Thread.currentThread().getName());
			System.out.println("The current thread priority is : "+Thread.currentThread().getPriority()+" count : "+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		SettingThreadNameAndPriority HIGH = new SettingThreadNameAndPriority("HIGH");
		SettingThreadNameAndPriority MID = new SettingThreadNameAndPriority("MID");
		SettingThreadNameAndPriority LOW = new SettingThreadNameAndPriority("LOW");
		
		System.out.println("The thread name is : "+HIGH.getName());
		System.out.println("The thread name is : "+MID.getName());
		System.out.println("The thread name is : "+LOW.getName());
		/*
		 * The below priority are not work as given they are work randomly
		 * here we are just adding the suggestion to jvm which is on high priority
		 *if you check these with the single core systems then you will get exact which you set.
		 *if you working with the multi core then where the threads are executing parallel
		 */
		HIGH.setPriority(MAX_PRIORITY);
		MID.setPriority(NORM_PRIORITY);
		LOW.setPriority(MIN_PRIORITY);
		
		HIGH.start();
		MID.start();
		LOW.start();
		
	}
}
