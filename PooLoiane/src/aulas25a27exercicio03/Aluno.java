package aulas25a27exercicio03;

import java.util.Scanner;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String[] disciplinas;
	float[] notas;
	boolean aprovacao;
	
	void nomeAluno(String nomeEstudante) {
		this.nome = nomeEstudante;
	}
	
	void numeroMatricula(int numeroDeMatricula) {
		this.matricula = numeroDeMatricula;
	}
	
	void nomeCurso(String nomeDoCurso) {
		this.curso = nomeDoCurso;
	}
	
	Scanner teclado = new Scanner(System.in);
	void nomeDisciplina() {
		disciplinas = new String[3];
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println("informe a disciplina " + i + ": ");
			disciplinas[i] = teclado.next();
		}
	}
	
	void notaDisciplina() {
		notas = new float[3];
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println("Informe a nota " + i + ": ");
			notas[i] = teclado.nextFloat();
		}
	}
	
	void statusAluno() {
		
		System.out.println("As notas e disciplinas do aluno " + nome + " são: ");
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(notas[i]);
			if (notas[i] >= 7) {
				System.out.println("Aprovado na matéria " + disciplinas[i]);
			} else {
				System.out.println("Reprovado na matéria " + disciplinas[i]);
			}
		}
		
	}
}
