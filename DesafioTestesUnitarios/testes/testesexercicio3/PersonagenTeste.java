package testesexercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio3.Guerreiro;
import exercicio3.Mago;
import exercicio3.MenuInicial;


public class PersonagenTeste {
	
	private Mago mago;
	private Guerreiro guerrreiro;
	private MenuInicial menuInicial;
	
	@BeforeEach
	public void setup() {
	 mago = new Mago("Merlim");
	 guerrreiro= new Guerreiro("Maximus");
	 menuInicial = new MenuInicial();
	}
	@Test
	void deveAumentarManaEInteligenciaMagoAoSubirDeNivel() throws Exception {
		mago.lvlUp();
		assertEquals(mago.getInteligencia(),100);
		assertEquals(mago.getMana(),100);
		
	}
	@Test
	void deveAumentarVidaEForcaGuerreiroAoSubirDeNivel() throws Exception {
		guerrreiro.lvlUp();
		assertEquals(guerrreiro.getForca(),110);
		assertEquals(guerrreiro.getVida(),6);
			
	}
	@Test
	void deveVerificarMetodoAttackMago() throws Exception {
		int numAleatorio= (int) (Math.random()*300);
		int retornoAttack= mago.attack(numAleatorio);
		int niveldeAttack = (20* 1) + numAleatorio;
		assertEquals(retornoAttack,niveldeAttack);
		
	}
	
	
	@Test
	void deveVerificarMetodoAttackGuerreiro() throws Exception {
		int numAleatorio= (int) (Math.random()*300);
		int retornoAttack= guerrreiro.attack(numAleatorio);
		int niveldeAttack = (30 * 1) + numAleatorio;
		assertEquals(retornoAttack,niveldeAttack);
		
	}
	
	@Test
	void deveVerificarAQuantidadeDePersonagensCriados() throws Exception {
		 int novalista = menuInicial.listaPersonagens();
		 assertEquals(novalista,2);
	}
	
	

}
