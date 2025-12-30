package V28_InnerClasses.Local_Inner_Class;

public class Hotel {
	private String name;
	private int total_rooms;
	private int reserved_rooms;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_rooms() {
		return total_rooms;
	}
	public void setTotal_rooms(int total_rooms) {
		this.total_rooms = total_rooms;
	}
	public int getReserved_rooms() {
		return reserved_rooms;
	}
	public void setReserved_rooms(int reserved_rooms) {
		this.reserved_rooms = reserved_rooms;
	}
	public Hotel(String name, int total_rooms, int reserved_rooms) {
		super();
		this.name = name;
		this.total_rooms = total_rooms;
		this.reserved_rooms = reserved_rooms;
	}
	public void reserveRoom(String guestName, int numberOfRooms) {
		//The below class is used only here only
		class ReservationValidator{
			boolean validate() {
				if(guestName == null) {
					System.out.println("Guest name can't be Empty!!");
					return false;
				}if(numberOfRooms < 0) {
					System.out.println("Number of rooms should be Possitive!!");
					return false;
				}if(reserved_rooms + numberOfRooms > total_rooms) {
					System.out.println("Not enough rooms are available!!");
					return false;
				}
				return true;
			}
		}
		
		ReservationValidator validator = new ReservationValidator();
		if(validator.validate()) {
			reserved_rooms += numberOfRooms;
			System.out.println("Reservation is confirmed for guest : "+guestName+" for rooms : "+numberOfRooms);
		}else {
			System.out.println("Reservation is failed!!");
		}
	}
}
