package aula24exercicio01;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		lampada1.modelo = "A60";
		lampada1.tensao = "Bivolt";
		lampada1.potencia = 7;
		lampada1.cor = "amarelo";
		lampada1.tipoLuz = "amarelo";
		lampada1.garantiaMeses = 36; 
		lampada1.tipoAbajur = true;
		
		lampada1.tipos = new String[5];
		lampada1.tipos[0] = "Abajur";
		lampada1.tipos[1] = "Lampeões";
		
		Lampada lampada2 = new Lampada();
		lampada2.modelo = "T80";
		lampada2.tensao = "Bivolt";
		lampada2.potencia = 5;
		lampada2.cor = "branco";
		lampada2.tipoLuz = "branco";
		lampada2.garantiaMeses = 24; 
		lampada2.tipoAbajur = false;
		
		lampada2.tipos = new String[5];
		lampada2.tipos[0] = "Abajur";
		lampada2.tipos[1] = "Lampeões";
		
		System.out.println(lampada1.modelo);
		System.out.println(lampada1.cor);
		System.out.println(lampada1.potencia);
		System.out.println(lampada1.cor);
		System.out.println(lampada1.tipoLuz);
		System.out.println(lampada1.garantiaMeses);
		System.out.println(lampada1.tipos);
		System.out.println(lampada1.tipoAbajur);
		
		System.out.println();
		
		System.out.println(lampada2.modelo);
		System.out.println(lampada2.tensao);
		System.out.println(lampada2.potencia);
		System.out.println(lampada2.cor);
		System.out.println(lampada2.tipoLuz);
		System.out.println(lampada2.garantiaMeses);
		System.out.println(lampada2.tipos);
		System.out.println(lampada2.tipoAbajur);

	}

}
