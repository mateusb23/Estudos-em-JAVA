package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape() { }
		
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();	 /* MÉTODOS ABSTRATOS */      //--> VAI PERMITIR O POLIMORFISMO, NESSE CASO
									 /*
									  * 1) São métodos que não possuem implementação
									  * 2) Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
									  * 3) Se uma classe possuir pelo menos um método abstrato, então esta classe é abstrata. 
									  */
	
}
