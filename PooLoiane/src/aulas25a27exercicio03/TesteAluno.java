package aulas25a27exercicio03;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.informarNome("Mateus");
        aluno1.numeroMatricula(0001);
        aluno1.informarCurso();
        aluno1.informarDisciplinasNotas();
        aluno1.mostrarStatus();
    }

}
