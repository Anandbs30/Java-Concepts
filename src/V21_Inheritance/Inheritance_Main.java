package V21_Inheritance;
//here below we are using the hierarchical inheritance like grandParent->parent->children this will support in the java 
public class Inheritance_Main {
	public static void main(String[] args) {
		Animal_Parent ap = new Animal_Parent();
		ap.setAge(3);
		ap.setName("The king");
		ap.sayHello();
		ap.eat();
		ap.sayHello1();
		
		System.out.println(ap.getAge());
		System.out.println(ap.getName());
		System.out.println();
		//Whenever we write the new key word then dynamic memory allocation takes place.
		//Mean the memory allocation done at run time in the heap memory. 
		Dog_Child dog = new Dog_Child();
		
		//The below two properties/fields age and Name we are accessing and setting them for the Dog child class
		//As we extended parent class
		dog.setAge(12);
		dog.setName("Godgy");
		
		//This one is from the Dog_Child class
		dog.setNickName("Dude");
			
		
		//Printing all of them
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		System.out.println(dog.getNickName());
		
		dog.eat();
		dog.sayHello();
		dog.sayHello1();
		
		//Here below we are creating the new dog object by referring the Animal_Parent class.
		//So here we can access or set, get from the Animal_Parent class fields and parameters only.
		//The below one also known as the Uppercasting as here we are creating the dog object by referring the animal
		Animal_Parent d1 = new Dog_Child();
		d1.setAge(21);
		d1.setName("Kutta");
		
		System.out.println();
		System.out.println(d1.getAge());
		System.out.println(d1.getName());
		d1.eat();
		d1.sayHello();
		d1.sayHello1();
		
		
		//Here below we get an error bcz as we created above we are created dog child class using Animal_Parent class
		//But here we are trying to create the Animal_Parent class object using the Dog_Child class that is not possible

		//issue	or Error	Dog_Child d2 = new Animal_Parent();
		
		//To create object we need to add the Type casting to the Dog_Child class 
		//So the below will act like initial Dog object
		//Through the below object we can't access set, get fields/properties name, age and nickname
//		Dog_Child d2 = (Dog_Child) new Animal_Parent();
//		d2.setAge(0);
//		d2.setName("Cruzy");
//		d2.setNickName("Cryu");
		
		//The below are known as the Run time polymorphism or method Overriding
		//While run time here deciding the which methods needs to be use or called
		//This will decide at run time so it is called as dynamic method dispatch 
		ap.sayHello1();
		dog.sayHello1();
		d1.sayHello();
	}
}
