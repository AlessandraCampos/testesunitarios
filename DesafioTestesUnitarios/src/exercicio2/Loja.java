package exercicio2;

import java.util.List;

public class Loja {
	
	private String nome;
	private String numeroDaLoja;
	List<Livro> livros;
	List<Game> videoGames;

	public Loja() {
		
	}
	public Loja(String nome, String numeroDaLoja, List<Livro> livros, List<Game> videoGames) {
		this.nome = nome;
		this.numeroDaLoja = numeroDaLoja;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	public void  listadeLivros() {	
		if(this.livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
			
		}else {
			System.out.println("A loja " +this.getNome()+ " possui este livros para venda: ");
			
			for (int i=0;i < this.livros.size();i++) {
				
				System.out.println("Titulo: " + this.livros.get(i).getAutor()
					+ ", Preço: "+ this.livros.get(i).getPreco() + 	", Quantidade: " + this.livros.get(i).getQuantidade() + " em estoque");
		}
         
	 
		}
	
		
				
	}
	public  void listaVideoGames() {	
		if(this.videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		}else {
			System.out.println("A loja " +this.getNome()+ " possui estes video-games para venda: ");
			for (int i=0;i < this.videoGames.size();i++) {
				
				System.out.println("Video-Game: " + this.videoGames.get(i).getNome()
					+ ", Preço: "+ this.videoGames.get(i).getPreco() + 	", Quantidade: " + this.videoGames.get(i).getQuantidade() + " em estoque"	);
			}
		}
	}
	
	public double calculaPatrimonio() {		
		double patrimonio = 0;
		
		for (int i=0; this.getLivros().size()>i; i++)
		{
			patrimonio += (this.getLivros().get(i).getPreco() * this.getLivros().get(i).getQuantidade());
		}
		
		for (int i=0; this.getVideoGames().size()>i; i++)
		{
			patrimonio += (this.getVideoGames().get(i).getPreco() * this.getVideoGames().get(i).getQuantidade());
		}
			
		System.out.println("O patrimonio da loja :" + this.getNome() + " é de " + patrimonio);
		return patrimonio;

		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroDaLoja() {
		return numeroDaLoja;
	}
	public void setNumeroDaLoja(String numeroDaLoja) {
		this.numeroDaLoja = numeroDaLoja;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Game> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<Game> videoGames) {
		this.videoGames = videoGames;
	}
	
	

}
