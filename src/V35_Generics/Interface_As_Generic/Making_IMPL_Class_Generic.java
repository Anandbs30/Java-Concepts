package V35_Generics.Interface_As_Generic;

public class Making_IMPL_Class_Generic<T> implements One_Parameter_Interface<T>{

	private T item;
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		this.item = item;
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return item;
	}

}
