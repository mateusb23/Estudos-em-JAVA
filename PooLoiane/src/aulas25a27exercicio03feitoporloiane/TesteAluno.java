package aulas25a27exercicio03feitoporloiane;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno ");
        aluno.nome = teclado.next();

        System.out.println("Entre com o nome do curso ");
        aluno.nomeCurso = teclado.next();

        System.out.println("Entre com a matricula ");
        aluno.matricula = teclado.next();

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0 ; i < aluno.nomeDisciplinas.length ; i++) {
            System.out.println("Entre com o nome da disciplina " + (i+1));
            aluno.nomeDisciplinas[i] = teclado.next();
        }

        for (int i = 0 ; i < aluno.notasDisciplinas.length ; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0 ; j < aluno.notasDisciplinas[i].length ; j++) {
                System.out.println("Entre com o nota " + (j+1));
                aluno.notasDisciplinas[i][j] = teclado.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0 ; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i) == true) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }
    }
}
