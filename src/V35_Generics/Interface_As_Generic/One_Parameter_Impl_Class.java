package V35_Generics.Interface_As_Generic;

public class One_Parameter_Impl_Class implements One_Parameter_Interface<String>{

	private String item;

	@Override
	public void add(String item) {
		this.item = item;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return item;
	}
}
