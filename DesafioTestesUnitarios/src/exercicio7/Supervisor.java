package exercicio7;

public class Supervisor extends Funcionario {
	
	@Override
	public double bonificacao() {
		salario = 5500;
		double bonus = 5000.00;
		return salario + bonus;
	}

}
