package exercicio2;

public class Game extends Produto {
	
	private String modelo;
	private String nome;
	private double imposto = 0;
	private boolean usado;
	private String marca;
	
	public Game(String categoria,String nome, double preco, int quantidade,String modelo,String marca, boolean usado) {
		this.categoria =categoria;
		this.nome= nome;
		this.modelo = modelo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca= marca;
		this.usado = usado;
	}
	
	public Game() {
	}
	
	@Override
	public double calculaImposto(Produto produto) {
		if (!(isUsado())) {
			imposto = this.preco * 0.45;
			System.out.println("Imposto de " + this.nome + " novo. Valor do Imposto: " + imposto + ", quantidade: " + this.quantidade + " em estoque");		
			
		}else {
			imposto = this.preco * 0.25;
			System.out.println("Imposto de " + this.nome + " usado. Valor do Imposto: " + imposto + ", quantidade: " + this.quantidade + " em estoque");
			
			return imposto;
		}
		
		return imposto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public boolean isUsado() {
		return usado;
	}
	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public void status() {
		System.out.println("Imposto" + modelo + "preço: " + this.preco + ", quantidade: " + this.quantidade + "em estoque");
	}

}
