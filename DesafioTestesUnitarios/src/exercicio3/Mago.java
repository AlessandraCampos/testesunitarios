package exercicio3;

public class Mago extends Personagem {


	public Mago(String nome) {
		super(nome );
	}
	
	@Override
	public  void lvlUp() {
	inteligencia +=80 ;
	mana +=80;	
	}
	
	@Override
	public int attack(int numAleatorio) {
	    int niveldeAttack = (inteligencia * level) + numAleatorio;
		return niveldeAttack;
	}

}
