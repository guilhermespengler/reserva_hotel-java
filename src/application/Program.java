package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.print("Número do quarto: ");
		int num = sc.nextInt();
		System.out.print("Data checkIn: (\"dd/MM/yyyy\")");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data checkOut: (\"dd/MM/yyyy\")");
		Date checkOut = sdf.parse(sc.next());
		
		
		if(checkIn.after(checkOut)) {
			System.out.println("Error Data Inicial menor que data final");
		} else {
			Reservation res = new Reservation(num, checkIn, checkOut);
			System.out.println("Reserva feita! "+res.toString());
			
			System.out.print("Entre com nova data da reserva: ");
			System.out.print("Data checkIn: (\"dd/MM/yyyy\")");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data checkOut: (\"dd/MM/yyyy\")");
			checkOut = sdf.parse(sc.next());
			res.updateDate(checkIn, checkOut);
			System.out.println(res.toString());
			
		}
		
		
		
		
		
		 
		
		
		
		sc.close();
	}
}
