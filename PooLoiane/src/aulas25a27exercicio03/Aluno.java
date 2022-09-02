package aulas25a27exercicio03;

import java.util.Scanner;

public class Aluno {
    Scanner teclado = new Scanner(System.in);

    // ATRIBUTPS
    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    float[] notas;

    // MÉTODOS

    // MÉTODOS COM PARÂMETRO E SEM RETORNO
    void informarNome(String nome) {
        this.nome = nome;
    }

    void numeroMatricula(int numero) {
        this.matricula = numero;
    }

    // MÉTODOS COM RETORNO --> RESOLVI NÃO COLOCAR UM COM RETORNO, POIS AS OPERAÇÕES SÃO MUITO SIMPLES

    // MÉTODOS SEM PARÂMETRO
    void informarCurso() {
        System.out.println("Informe o seu curso: ");
        curso = teclado.nextLine();
    }

    void informarDisciplinasNotas() {
        disciplinas = new String[3];
        notas = new float[3];

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Informe a sua " + (i+1) + " disciplina: ");
            disciplinas[i] = teclado.next();
            for (int j = i ; j <= i ; j++) {
                System.out.println("Diga a nota de " + disciplinas[i] + ": ");
                notas[i] = teclado.nextFloat();
                while (notas[i] < 0) {
                    System.out.println("Digite uma nota valida para " + disciplinas[i] + ": ");
                    notas[i] = teclado.nextFloat();
                }

            }

        }

    }

    void mostrarStatus() {

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
