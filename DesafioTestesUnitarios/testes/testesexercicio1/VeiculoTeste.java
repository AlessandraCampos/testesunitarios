package testesexercicio1;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio1.DesligarCarroEmMovimentoException;
import exercicio1.Veiculo;

class VeiculoTeste {

	private Veiculo veiculo;

	@BeforeEach
	public void setup() {
		veiculo = new Veiculo();
		

	}

	@Test
	void criaClasseVeiculo() {

	}

	@Test
	void deveAcelerarVeiculo() throws Exception {
		veiculo.acelerar();

	}

	@Test
	void deveAcrescentar20AVelocidadeAoAcelerar() throws Exception {
		veiculo.acelerar();
		assertEquals(veiculo.getVelocidade(), 20);

	}

	@Test
	void deveAbastecerVeiculo() throws Exception {
		veiculo.abastecer(10);
		assertEquals(veiculo.getLitrosCombustivel(), 10);

	}

	@Test
	void verificaLimiteDoTanque() throws Exception {
		veiculo.abastecer(70);
		assertEquals(veiculo.getLitrosCombustivel(), 60);

	}

	@Test
	void deveFrearVeiculo() throws Exception {
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.frear();
		assertEquals(veiculo.getVelocidade(), 20);

	}

	@Test
	void devePintarVeiculo() throws Exception {
		veiculo.pintar("vermelho");
		assertEquals(veiculo.getCorVeiculo(), "vermelho");

	}

	@Test
	void verificaSeOCarroEstaLigado() throws Exception {
		veiculo.ligarVeiculo();
		assertEquals(veiculo.isLigado(), true);

	}

	@Test
	void verificaSeOCarroEstaDesligado() throws Exception {
		veiculo.desligarVeiculo();
		assertEquals(veiculo.isLigado(), false);
	}

	@Test
	public void naoPermitirDesligarCarroEmMovimento() throws Exception {
		veiculo.ligarVeiculo();
		veiculo.acelerar();
		assertThrows(DesligarCarroEmMovimentoException.class,()-> veiculo.desligarVeiculo(), "Se tentar desligar Throws Exception");
			
	}


	
	
	
}
	

