package V27_InterFaces_MultipleInheritance;

public interface MainClass_Interface {
	static void main(String[] args) {
		/*
		 This will run and allow to write main class in the interface because as we know jvm needs to run the main
		 method as here this main method has static so this will directly runs.
		 
		 Basically static is attached with the class and here it is belongs to the interface and as static we don't
		 need to create the object and here jvm search for the main and here it is present and as well as that is public
		 */
		System.out.println("Hello the king is here!!!!!!");
	}
}
