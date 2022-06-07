package exercicio7;

public class Gerente extends Funcionario {
	
	@Override
	public double bonificacao() {
		salario = 4500;
		double bonus = 10000.00;
		return salario + bonus;
	}

}
