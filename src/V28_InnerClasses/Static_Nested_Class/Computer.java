package V28_InnerClasses.Static_Nested_Class;

public class Computer {
	private String model;
	private String name;
	
	private Operating_System os;
	
	public Operating_System getOs() {
		return os;
	}
	public Computer(String model, String name, String os) {
		this.model = model;
		this.name = name;
		this.os = new Operating_System(os);
	}
	
	static class USB{
		private String USB_TYPE;

		public USB(String uSB_TYPE) {
			this.USB_TYPE = uSB_TYPE;
		}
		
		public void DisplayInfor() {
			System.out.println("USB type is : "+USB_TYPE);
		}
	}

	class Operating_System{
		private String osName;

		public Operating_System(String osName) {
			this.osName = osName;
		}
		
		public void displayInfo() {
			System.out.println("Computer model : "+model+" OS : "+osName);
		}
	}
}
