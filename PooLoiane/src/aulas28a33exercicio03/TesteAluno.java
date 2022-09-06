package aulas28a33exercicio03;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno ");
        aluno.setNome(teclado.next());

        System.out.println("Entre com o nome do curso ");
        aluno.setNomeCurso(teclado.next());

        System.out.println("Entre com a matricula ");
        aluno.setMatricula(teclado.next());

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0 ; i < aluno.getNomeDisciplinas().length ; i++) {
            System.out.println("Entre com o nome da disciplina " + (i+1));
            aluno.setNomeDisciplinaPos(i, teclado.next());
        }
        
        for (int i = 0 ; i < aluno.getNotasDisciplinas().length ; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0 ; j < aluno.getNotasDisciplinas()[i].length ; j++) {
                System.out.println("Entre com o nota " + (j+1));
                aluno.setNotaDisciplinaPosIJ(i, j, teclado.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0 ; i < aluno.getNomeDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i) == true) {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
            } else {
            	System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
            }
        }
    }
}

