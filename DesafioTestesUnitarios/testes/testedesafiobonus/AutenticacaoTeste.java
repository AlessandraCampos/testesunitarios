package testedesafiobonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafiobonus.Autenticacao;
import desafiobonus.Usuario;

public class AutenticacaoTeste {
	
	private Usuario usuario;
	private Autenticacao autenticacao;
	
	@BeforeEach
	public void setup() {
	usuario	 = new Usuario("Amélia", "Carvalho", "AmeliaC","1234");	
	autenticacao = new Autenticacao(usuario);
	}

	@Test
	void deveVerificarUsuarioJaExistente() throws Exception {
		Usuario novoUsuario = new Usuario("Amelia","Cordeiro","AmeliaC","1234");
		Usuario novaAutenticacao = autenticacao.verificaUsuario(novoUsuario);
		assertSame(usuario.getUsername(), novaAutenticacao.getUsername());	
	}
	
	@Test
	void seNaoTiverUsuarioComMesmoLoginCadastrar() throws Exception {
		Usuario novoUsuario = new Usuario("Eliandra","Monteiro","Eliandra","1234");
		Usuario novaAutenticacao = autenticacao.verificaUsuario(novoUsuario);
		assertNotSame(usuario.getUsername(), novaAutenticacao.getUsername());
		
	}
	

}
