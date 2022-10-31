package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vechicle;
	private Invoice invoice;
	
	public CarRental() { }

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vechicle) {
		this.start = start;
		this.finish = finish;
		this.vechicle = vechicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVechicle() {
		return vechicle;
	}

	public void setVechicle(Vehicle vechicle) {
		this.vechicle = vechicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	} 
	
}
