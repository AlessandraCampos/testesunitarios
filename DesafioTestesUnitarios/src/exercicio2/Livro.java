package exercicio2;

public class Livro extends Produto {
	protected String autor;
	protected String genero;
	private String nome;
	protected int estoque;
	public double imposto = 0;
	
	public Livro() {
		
	}

	public Livro(String categoria, String nome,double preco,int quantidade, String autor, String genero, int estoque) {
		this.categoria=categoria;
		this.nome =nome;
		this.preco =preco;
		this.quantidade= quantidade;
		this.autor = autor;
		this.genero = genero;
		this.estoque = estoque;
	}
	
	@Override
	public double calculaImposto(Produto produto) {
		if(!(this.genero.equalsIgnoreCase("Educativo"))) {
			imposto = this.getPreco() * 0.10;
			 System.out.println("R$ " + imposto + " de impostos sobre o livro " + this.getNome() + ".");
		} else {
			 System.out.println("Livro educativo não tem imposto :" + getNome());
			return 0;
		}
		   return imposto;

	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getEstoque() {
		return estoque;
	}



	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	




	

}
