package exercicio1;

public class Veiculo {

	private int velocidade = 0;
	private boolean ligado = false;

	public String getCorVeiculo() {
		return corVeiculo;
	}

	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	private int litrosCombustivel = 0;
	private int limiteTanque=60;
	private String corVeiculo;

	public Veiculo() {
	}

	public Veiculo(int velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar() {
		velocidade += 20;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void abastecer(int quantidadeEmLitros) {
		 int verificaLimite;
		 verificaLimite = (limiteTanque - quantidadeEmLitros); 
		if (!(litrosCombustivel + quantidadeEmLitros > limiteTanque)) {
			litrosCombustivel += quantidadeEmLitros; 
		}else {
			litrosCombustivel=  quantidadeEmLitros + verificaLimite;
		}
		
		
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setListrosCombustivel(int listrosCombustivel) {
		this.litrosCombustivel = listrosCombustivel;
	}

	public void frear() {
		velocidade -= 20;
		
	}

	public String pintar(String cor) {
		corVeiculo = cor;
		return corVeiculo;
		
	}

	public void ligarVeiculo() {
		if (!(ligado)) {
			ligado = true;
		}
		
		
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void desligarVeiculo() {
		if(velocidade != 0) {
			throw new DesligarCarroEmMovimentoException("Não é permitido desligar o veículo em movimento"); 
		}else {
			ligado = false;
		}
		
	}

}
