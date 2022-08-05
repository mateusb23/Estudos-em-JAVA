package estudopoo03;

public class EstudoPoo03 {

	public static void main(String[] args) {
		Livraria livro1 = new Livraria("HP Lovrecraft", 330, 1948, 80.45f, false);
		livro1.status();
		
		Livraria livro2 = new Livraria("IT a coisa", 1108, 1986, 120.99f, true);
		livro2.status();
	}

}
