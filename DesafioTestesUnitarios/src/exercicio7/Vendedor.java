package exercicio7;

public class Vendedor extends Funcionario {
	
	
	@Override
	public double bonificacao() {
		salario = 3500;
		double bonus = 3000.00;
		return salario + bonus;
	}


}
