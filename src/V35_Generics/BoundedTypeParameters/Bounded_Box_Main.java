package V35_Generics.BoundedTypeParameters;

public class Bounded_Box_Main {
	public static void main(String[] args) {
		Bounded_Box<Integer> v = new Bounded_Box<>();
		v.setValue(30);
		Integer value = v.getValue();
		System.out.println(value);
	}
}
