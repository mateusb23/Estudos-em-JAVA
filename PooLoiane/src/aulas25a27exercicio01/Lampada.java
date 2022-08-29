package aulas25a27exercicio01;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean ligada;
	
	// CONSTRUTOR
	/*void Lampada() {
		this.ligada = false;
	}*/
	
	// VOU FAZER COM AS DUAS FORMAS(MÉTODOS SEM RETORNO E MÉTODO COM RETORNO, MAS TANTO FAZ, NESSE CASO
	void ligarLampada() {
		this.ligada = true;
	}
	
	boolean desligarLampada() {
		return this.ligada = false;
	}
	
}
