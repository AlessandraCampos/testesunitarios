package exercicio3;

public class Personagem {
	
		 public String nome;
		 public int vida=3;
		 public int	mana = 20;
		 public float xp;
		 public int inteligencia = 20;
		 public int forca = 30;
		 public int level = 1;
		 

		public Personagem(String nome ) {
			this.nome = nome;
			
		}
		
		public int attack() {
			return 0;
		}


		public void lvlUp() {
			
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getVida() {
			return vida;
		}


		public void setVida(int vida) {
			this.vida = vida;
		}


		public int getMana() {
			return mana;
		}


		public void setMana(int mana) {
			this.mana = mana;
		}


		public float getXp() {
			return xp;
		}


		public void setXp(float xp) {
			this.xp = xp;
		}


		public int getInteligencia() {
			return inteligencia;
		}


		public void setInteligencia(int inteligencia) {
			this.inteligencia = inteligencia;
		}


		public int getForca() {
			return forca;
		}


		public void setForca(int forca) {
			this.forca = forca;
		}


		public int getLevel() {
			return level;
		}


		public void setLevel(int level) {
			this.level = level;
		}

		public int attack(int numAleatorio) {
			// TODO Auto-generated method stub
			return numAleatorio;
		}

}
