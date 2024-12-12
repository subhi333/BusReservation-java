package marketing.own.dev.service;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		
		ArrayList<Bus> b = new ArrayList<>();
		ArrayList<Booking> b1 = new ArrayList<>();
		
		b.add(new Bus(1,false,2));
		b.add(new Bus(2,true,30));
		b.add(new Bus(3,false,30));
		b.add(new Bus(4,true,100));
		b.add(new Bus(5,true,45));
		
		Scanner s = new Scanner (System.in);
		
		for (Bus x : b) {
			x.businfo();
		}
		int user=1;
		while (user==1) {
			System.out.println("Enter 1 for booking");
			System.out.println("Enter 2 for Exit");
			user = s.nextInt();
			if (user==1) {
				Booking book = new Booking ();
				if (book.isavailable(b1, b) ) {
					b1.add(book);
					System.out.println("Booking Confirmed");
				} else {
					System.out.println("Sorry No Bus Available");
				}
					
				
			}else {
				System.out.println("Thanks For Choosing us");
			}
		}
		
	}
}
