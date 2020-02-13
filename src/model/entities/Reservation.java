package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
		
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duracaoReserva() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDate(Date newCheckIn, Date newCheckOut) {
		setCheckIn(newCheckIn);
		setCheckOut(newCheckOut);
	}
	
	public String toString() {
		return "Quarto \n"
				+numeroQuarto
				+" CheckIn: "
				+sdf.format(checkIn)
				+" CheckOut: "
				+sdf.format(checkOut)
				+" "
				+duracaoReserva()
				+" noites.";
				
	}
	
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	
	
	
	
	
}
