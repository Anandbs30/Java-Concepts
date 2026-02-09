package V33_MultiThreadding.LambdaExpression;

public class lambdaExpression {

	public static void main(String[] args) {
		Runnable runnable = ()->{
			System.out.println("Nothing");
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
		//So above thing we can do in one line using lambda expression
		
		Thread t1 = new Thread(()->System.out.println("Nothing to say"));
		t1.setPriority(1);
		t1.start();
		
		System.out.println(t.getPriority());
		
		
		//If you have multiple line code then use the below where using curly{} braces we are defining an body.
		Thread t2 = new Thread(()->{
			for(int i = 0;i<5;i++) {
				System.out.println(i+" time hello");
			}
		});
		t2.start();
	}
}
