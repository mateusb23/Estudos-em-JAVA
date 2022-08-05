package estudopoo03;

public class Livraria {
	String titulo;
	int npaginas;
	int ano;
	float preco;
	boolean limpeza;
	
	public Livraria(String t, int np, int a, float p, boolean vouf) {
		this.setTitulo(t);
		this.setNumeroPaginas(np);
		this.setAno(a);
		this.setPreco(p);
		this.setLimpo(vouf);
		//this.setSujo(f);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	
	public int getNumeroPaginas() {
		return this.npaginas;
	}
	
	public void setNumeroPaginas(int np) {
		this.npaginas = np;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setPreco(float p) {
		this.preco = p;
	}
	
	public boolean getLimpo() {
		return this.limpeza;
	}
	
	public void setLimpo(boolean vouf) {
		this.limpeza = vouf; 
	}
	
	/*public boolean getSujo() {
		return this.limpeza;
	}
	
	public void setSujo(boolean f) {
		this.limpeza = f;
	}*/
	
	public void status() {
		System.out.println("DETALHES DO LIVRO:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Número de Páginas: " + getNumeroPaginas());
		System.out.println("Ano de Publicação: " + getAno());
		System.out.println("Preço: " + getPreco());
		System.out.println("O livro está Limpo? " + getLimpo()); //+ " " + getSujo());
	}
	
}
