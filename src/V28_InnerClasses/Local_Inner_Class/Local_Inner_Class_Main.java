package V28_InnerClasses.Local_Inner_Class;

public class Local_Inner_Class_Main {
	public static void main(String[] args) {
		Hotel hotel = new Hotel("Shri", 20, 5);
		hotel.reserveRoom("AnandBs", 5);
		int available_rooms = hotel.getTotal_rooms() - hotel.getReserved_rooms();
		System.out.println("Hotel total rooms : "+hotel.getTotal_rooms()+" And hotel available rooms : "
							+available_rooms+" Total reserved rooms are : "+hotel.getReserved_rooms());
		hotel.reserveRoom("KavuBS", 16);
		hotel.reserveRoom("MangalBS", -1);
		hotel.reserveRoom("", 3);
	}
}
