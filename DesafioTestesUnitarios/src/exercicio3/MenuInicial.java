package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MenuInicial {
	
	private List<Mago> magos;
	private List<Guerreiro> guerreiros;
	public List<Mago> getMagos() {
		return magos;
	}
	public void setMagos(List<Mago> magos) {
		this.magos = magos;
	}
	public List<Guerreiro> getGuerreiros() {
		return guerreiros;
	}
	public void setGuerreiros(List<Guerreiro> guerreiros) {
		this.guerreiros = guerreiros;
	}
	public int listaPersonagens(){
		List<Personagem> personagens = new ArrayList<>();
		personagens.add((Personagem) magos);
		personagens.add((Personagem) guerreiros);
	
		return personagens.size();
		
	}
	

}
