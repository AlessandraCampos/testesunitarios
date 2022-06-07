package exercicio3;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome) {
		super(nome);
	}
	
	@Override
	public void lvlUp() {
	vida +=3 ;
	forca +=80;	
	}
	
	@Override
	public int attack(int numAleatorio) {
	    int niveldeAttack = (forca * level) + numAleatorio;
		return niveldeAttack;
	}


}
