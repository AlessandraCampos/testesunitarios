package exercicio7;

public class Funcionario {
	
	protected double salario;
	protected String nome;
	protected int idade;
	
	public double bonificacao() {
		
		return salario;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}




	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


}
