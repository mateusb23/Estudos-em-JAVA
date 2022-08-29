package aula24exercicio02;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		livro1.nome = "Mastering ExtJS";
		livro1.tipoCapa = "Comum";
		livro1.autor = "Loiane Groner";
		livro1.anoLancamento = 2015;
		livro1.editora = "Infomagic";
		livro1.genero = "Tecnologia da informação";
		livro1.numeroPaginas = 220;
		livro1.preco = 70.90f;
		livro1.linguagem = new String[3];
		livro1.linguagem[0] = "Português";
		livro1.linguagem[1] = "Inglês";
		livro1.linguagem[2] = "Espanhol";

		System.out.println("Nome = " + livro1.nome);
		System.out.println("Tipo de capa = " + livro1.tipoCapa);
		System.out.println("Autor = " + livro1.autor);
		System.out.println("Ano de lançamento = " + livro1.anoLancamento);
		System.out.println("Editora = " + livro1.editora);
		System.out.println("Gênero = " + livro1.genero);
		System.out.println("Número de páginas = " + livro1.numeroPaginas);
		System.out.println("Preço = " + livro1.preco);
		System.out.println("Linguagem = " + livro1.linguagem[0] + " - " + livro1.linguagem[1]
				+ " - " + livro1.linguagem[2]);
		
	}

}
