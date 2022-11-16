package entities;

public class Printer<T> {

	private T thingToPrint;
	
	public Printer() { }
	
	public Printer(T thingToPrinter) {
		this.thingToPrint = thingToPrinter;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}

	@Override
	public String toString() {
		return thingToPrint + " - ";
	}
	
}
