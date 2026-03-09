package V37_String_StringBuilder_StringBuffer;

public class StringBuffer_Class {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		StringBuilder sb = new StringBuilder();
		
		
		Task t1 = new Task(sb);
		Task t2 = new Task(sb);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final length of StringBuilder is : "+sb.length());//here will get random number below 2000 as its don't have thread safety.
		
		//Thread safety but performance is slower.
		StringBuffer sbf = new StringBuffer();

		sbfTask t11 = new sbfTask(sbf);
		sbfTask t12 = new sbfTask(sbf);
		
		t11.start();
		t12.start();
		
		t11.join();
		t12.join();
		
		System.out.println("Final length of StringBuffer is : "+sbf.length());//this will provide 2000 as output because its have thread safety.
	}
}

class Task extends Thread{

	private StringBuilder sb;
	
	public Task(StringBuilder sb) {
		this.sb = sb;
	}
	@Override
	public void run() {
		for(int i = 0; i<1000;i++) {
			sb.append("a");
		}
	}
	
}
class sbfTask extends Thread{

	private StringBuffer sbf;
	
	public sbfTask(StringBuffer sbf) {
		this.sbf = sbf;
	}
	@Override
	public void run() {
		for(int i = 0; i<1000;i++) {
			sbf.append("a");
		}
	}
	
}