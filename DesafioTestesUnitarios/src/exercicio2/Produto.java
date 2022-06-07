package exercicio2;

public class Produto implements Imposto {
	protected String categoria;
	protected double preco;
	protected int quantidade;

	public Produto() {
	}

	public Produto(String categoria, double preco, int quantidade) {
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public double calculaImposto(Produto produto) {
		// TODO Auto-generated method stub
		return 0;
	}


	

	

}
