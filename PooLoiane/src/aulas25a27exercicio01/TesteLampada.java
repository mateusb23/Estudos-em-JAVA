package aulas25a27exercicio01;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		lampada1.ligarLampada();
		System.out.println(lampada1.ligada + " -> " + "A lâmpada foi ligada ");
		System.out.println();
		lampada1.desligarLampada();
		System.out.println(lampada1.ligada + " -> " + "A lâmpada foi desligada");
	}

}
