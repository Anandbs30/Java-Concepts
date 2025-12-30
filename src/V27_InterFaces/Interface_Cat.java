package V27_InterFaces;

public class Interface_Cat implements Interface_Animal{

	@Override
	public void eat() {
		System.out.println("Cat is eating @@@@@@");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping@*********");
	}

}
