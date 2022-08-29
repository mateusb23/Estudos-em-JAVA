package com.loiane.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// MÉTODO SEM RETORNO
	void exibirAutonomia() {		// O void significa que eu não estou retornando nada
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	// MÉTODO COM RETORNO
	double obterAutonomia() {		/* Uma vantagem do método com retorno é que podemos atribuir a 
									   alguma varável lá fora, como fizemos na linha 21 do arquivo TesteCarro */
		System.out.println("Método obterAutonomia foi chamado. ");
		
		return capCombustivel * consumoCombustivel;
	}
}