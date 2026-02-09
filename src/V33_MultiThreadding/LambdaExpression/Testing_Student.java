package V33_MultiThreadding.LambdaExpression;

public class Testing_Student {
	public static void main(String[] args) {
		
		//The below is directly we are creating the anonymous for the interface to implement its method 
		Student EngStudent = new Student() {

			@Override
			public String getBio(String name) {
				return name + " is an Engineering Student";
			}
			
		};
		
		//Using Lambda expression.
		Student medStud = (String name)->{
			return name+" is an Medical Student";
		};
		
		//Lambda Expression note that is you have only one argument then you don't need to write its data type
		Student mechStud = (name)->{
			return name+" is an Mechanical Student";
		};
		
		//Or we can short this one 
		Student csStud = (name)->name + " is an cs student";
		
		//Also note that if you have only one argument then you don't need to write the return and also don't use the ()
		Student eeeStud = name -> name + " is an EEE student";
		
		//So these above all are the be like tasks we need to perform work 
		System.out.println(eeeStud.getBio("Anand"));
	}
}
