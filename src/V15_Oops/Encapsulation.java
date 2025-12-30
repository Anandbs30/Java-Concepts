package V15_Oops;

/*
 Bundling of data and methods into a single unit and that unit is an class 
 Using private keyword on the fields we are excluding the our properties exposure
 */
public class Encapsulation {
	private int id;
	private String name;
	private String last_Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	
}
