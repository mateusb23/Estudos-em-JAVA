package aula24exercicio04;

import java.util.Date;

public class TesteLivroDeBiblioteca {

	public static void main(String[] args) {
			
			LivroDeBiblioteca livro1 = new LivroDeBiblioteca();
			livro1.nome = "Matering ExtJS";
			livro1.autor = "Loiane Groner";
			livro1.tipoCapa = "Dura";
			livro1.editora = "Maxtech";
			livro1.genero = "Tecnologia";
			livro1.numeroPaginas = 430;
			livro1.emprestado = true;
			livro1.usuario = "Mateus Bispo";
			livro1.dataEntrega = new Date();
			livro1.valorPagar = 12.35;
			
			System.out.println(livro1.nome);
			System.out.println(livro1.autor);
			System.out.println(livro1.tipoCapa);
			System.out.println(livro1.editora);
			System.out.println(livro1.genero);
			System.out.println(livro1.numeroPaginas);
			System.out.println(livro1.emprestado);
			System.out.println(livro1.usuario);
			System.out.println(livro1.dataEntrega);
			System.out.println(livro1.valorPagar);
		}

	}

