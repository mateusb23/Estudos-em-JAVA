package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
// LEITURA DA LINHA 18 -> se Não (checkOut vir após checkIn) {
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!(checkOut.after(checkIn))) {  // O after() É UM MÉTODO QUE VERIFICA SE UMA DATA date É APÓS A OUTRA
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		/* O MÉTODO getTime() MOSTRA A QUANTIDADE DE MILISSEGUNDOS DA DATA ATIBUIDA
		 * A ELE, QUE NESSE CASO É A DATA QUE FOI INSERIDA EM checkout. */
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		/* O TIPO ENUMERADO TimeUnit NESSE CASO DE CIMA CONVERTE MILISSEGUNDOS PARA DIAS 
		   COM O COMANDO TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) */
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}
