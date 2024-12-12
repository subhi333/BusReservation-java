package marketing.own.dev.service;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String Passengername;
	int busno;
	Date date;

	Booking(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Name=");
		Passengername = scan.next();
		System.out.println("Enter your Busno=");
		busno = scan.nextInt();
		System.out.println("Enter your date dd-mm-yyyy =");
		String dateinput = scan.next();
		SimpleDateFormat dd = new SimpleDateFormat ("dd-MM-yyyy");
		try {
			date=dd.parse(dateinput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isavailable(ArrayList<Booking>b1,ArrayList<Bus>b ) {
	int capacity=0;
	for (Bus bus : b) {
		if (bus.getBusno()== busno) 
			capacity = bus.getCapacity();
	}
	int bookcount=0;
	for (Booking book : b1) {
		if (book.busno == busno && book.date.equals(date)) {
			bookcount++;
		}
	}
	return bookcount<capacity?true:false;
	}
}
	