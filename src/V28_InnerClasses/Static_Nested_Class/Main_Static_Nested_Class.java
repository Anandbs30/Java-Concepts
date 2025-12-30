package V28_InnerClasses.Static_Nested_Class;

public class Main_Static_Nested_Class {
	public static void main(String[] args) {
		Computer c = new Computer("MacNook", "Air", "M1");
		c.getOs().displayInfo();
		
		//To access static inner class USB is not required above Computer object as well.
		Computer.USB usb = new Computer.USB("TYPE-C");
		usb.DisplayInfor();
	}
}
