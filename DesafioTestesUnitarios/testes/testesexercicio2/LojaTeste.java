package testesexercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio2.Game;
import exercicio2.Livro;
import exercicio2.Loja;

public class LojaTeste {
	
	private List<Livro> livros;
	private List<Game>videoGames;
	private Loja loja;
	private Game game;
	private Livro livro;
	
	@BeforeEach
	public void setup() {
	 livros = new ArrayList<>();
	 livro = new Livro("Livro","Comer, Rezar e Amar", 35.99, 60, "Elizabeth Gilbert", "Educativo", 15);
	 game = new Game("Game","Playstation",1500, 5, "Slim", "Sony", false);
	 videoGames = new ArrayList<>();	
	 loja = new Loja("Submarino", "Al1500", livros, videoGames);
	}
	
	@Test
	void deveCalcularImpostoLivroEducativo() throws Exception {
		double valorImpostoLivroEducativo = livro.calculaImposto(livro);
		assertEquals(valorImpostoLivroEducativo, 0, 0.0001);
		
	}
	@Test
	void deveCalcularImpostodeLivroOutrosTemas() throws Exception {
		livro = new Livro("Livro","Comer, Rezar e Amar", 35.99, 60, "Elizabeth Gilbert", "Romance", 15);
		double valorImposto = livro.calculaImposto(livro);	 
		assertEquals(valorImposto, 3.599, 0.0001);
	}
	
	@Test
	void deveCalcularImpostoVideoGameUsado() throws Exception {
		 game = new Game("Game","Playstation",1500, 5, "Slim", "Sony", true);
		double valorImposto = game.calculaImposto(game);
		assertEquals(valorImposto, 375, 0.0001);
		
		
	}
	
	@Test
	void deveCalcularImpostoVideoGameNovo() throws Exception {
		double valorImposto = game.calculaImposto(game);
		assertEquals(valorImposto, 675, 0.0001);	
	}
	
	@Test
	void deveVerificarSeAListaDeLivrosEstaVazia() throws Exception {
		loja.listadeLivros();
		assertEquals(true,true)	;	
		
	}
	
	@Test
	void deveVerificarSeContemLivrosNaLista() throws Exception {
		livros.add(livro);
		loja.listadeLivros();
		assertEquals(true, true);	
		
	}
	
	@Test
	void deveVerificarSeAListaDeVideoGamesEstaVazia() throws Exception {
	    loja.listaVideoGames();
		assertEquals(true, true);	
	}
	
	@Test
	void deveVerificarSeContemGamesNaLista() throws Exception {
		videoGames.add(game);
		loja.listaVideoGames();
		assertEquals(true, true);	
		
	}
	
	@Test
	void deveCalcularPatrimonioDaLojaERetornaValor() throws Exception {
		livros.add(livro);
		videoGames.add(game);
	    Double calc = loja.calculaPatrimonio();
	    assertEquals(calc,9659.4);
		
	}
}
