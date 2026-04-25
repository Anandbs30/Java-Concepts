package V7_Airthmatic_Operators;

public class v7_arirthmaticOperator {
	public static void main(String[] args) {
		System.out.println("Hey Hi, This is may salary and distrubuting with my childrens!!");
		int childrens = 3;
		int mySalary = 30000;
		int deduction = 3000;
		int monthlysSalary = mySalary - deduction;
		int yearlySalary = monthlysSalary * 12;
		int perChildAmt = yearlySalary / childrens;
		System.out.println("My childrens : "+childrens);
		System.out.println("My monthly salary before deduction : "+mySalary);
		System.out.println("My monthly salary after deduction : "+monthlysSalary);
		System.out.println("My yearly salary after deduction : "+yearlySalary);
		System.out.println("Per child get amt from my salary is : "+perChildAmt);
		
		//Reminder which gets remaining number after dividing number by any other number 
		
		int a = 5;
		int b = 2;
		int c = a % b;
		System.out.println("The reminder here is : "+c);//output : 1
		
		//Below we mixing the data types ADDITION
		int d = 100;
		float e = 10.23f;
		float f2 = d + e;//here data loss not happen basically float have the less precision so this will make round so value stored in e is 10.22999;
		System.out.println(f2);//Through this as well data loss happen Output : 110.229996 required is : 110.23
		int f1 = d + (int)e;//Through this we can able to do that but the will loss the decimal values here
		System.out.println(f1);//Output : 110 but required is 110.23
		double x = 10.23;
		double y = d + x;
		System.out.println(y);//No data loss nothing here we get required ans as : 110.23 as its have high precision so this will make exactly.
		
		long g = 41213;
		float h = 77.21f;
		/*
         long i = g + h;   // ❌ Compile-time error
         🔎 What Happens Internally?
         When you do:
         g + h
         Java applies numeric promotion rules.
         Since one operand is float, Java promotes the long to float before performing the operation.
         So this:
         g + h
         Becomes:
         (float)g + h
         Now the result type is:
         float
		 but you are storing that into long.
		*/
//		long i = g + h;//can't do this, Not allowed
		
		//Multiplication
		long i = 2324;
		long j = 1212121212;
		long result = i * j;
		System.out.println(result);
		
		//Division
		//Divider or lower value must be more than 0 
		int k = 10;
		int l = 3;
		int m = k/l;//This will provide answer with data loss
		float n = k / l;//This will provide answer with data loss 
		System.out.println(n);
		double o = k / l;
		System.out.println(o);//This will provide answer with data loss
		
		//Either need to type casting here otherwise need to change int values as float
		float p = (float)k / l;
		System.out.println("Type casting to avoid data loss : "+p);
		float q = 10;
		float r = 3;
		float s = q/r;
		System.out.println("Direct input values into float : "+s);//Here also no data loss
		
		//Do upper value data type as float or double
		float t = 10;
		int u = 3;
		float v = t/u;
		System.out.println("Division without data loss : "+v);
		
	}
}
