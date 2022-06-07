package desafiobonus;

import java.util.Random;

public class Autenticacao {
	
	private Usuario usuario;

	public Autenticacao(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario verificaUsuario (Usuario novoUsuario) {
	
		
		if (usuario.getUsername().equals(novoUsuario.getUsername())) {
			System.out.println("Usuario " + novoUsuario.getUsername() +" ja existe");
			System.out.println("Temos algumas sugestões de Usernames disponíveis");
			sortearUsername(novoUsuario);
			sortearUsername(novoUsuario);
			sortearUsername(novoUsuario);
			
		}else {

			usuario = new Usuario(novoUsuario.getNome(),novoUsuario.getSobrenome(),novoUsuario.getUsername(),novoUsuario.getSenha());
			System.out.println("Usuario " + usuario.getUsername() + " cadastrado com sucesso");
		}
			
		return usuario;
		
		
	}


	public void sortearUsername(Usuario novoUsuario) {
		
	
		String nome = novoUsuario.getNome();
		String sobrenome = novoUsuario.getSobrenome();
		String[] symbol = {nome, sobrenome};
		int numAleatorio= (int) (Math.random()*100);
		Random sortear = new Random();
		String usernameSorteado = symbol[sortear.nextInt(symbol.length )] + numAleatorio;
		if (!(usuario.getUsername().equals(usernameSorteado))) {
			System.out.println(usernameSorteado);
		}
		
	}

}
