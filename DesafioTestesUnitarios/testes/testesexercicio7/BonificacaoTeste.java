package testesexercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio7.Gerente;
import exercicio7.Supervisor;
import exercicio7.Vendedor;

public class BonificacaoTeste {
	
	@Test
	void deveRetornarSalarioMaisBonificacaoGerente() throws Exception {
		Gerente gerente = new Gerente();
		double valorComBonificacao = gerente.bonificacao();
		assertEquals(valorComBonificacao,14500);
		
	}
	
	@Test
	void deveRetornarSalarioMaisBonificacaoSupervisor() throws Exception {
		
		Supervisor supervisor = new Supervisor();
		double valorComBonificacao = supervisor.bonificacao();
		assertEquals(valorComBonificacao,10500);
		
	}
	@Test
	void deveRetornarSalarioMaisBonificacaoVendedor() throws Exception {
		Vendedor vendedor = new Vendedor();
		double valorComBonificacao = vendedor.bonificacao();
		assertEquals(valorComBonificacao,6500);
	}

}
