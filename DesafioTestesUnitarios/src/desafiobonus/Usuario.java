package desafiobonus;

public class Usuario {
	private String username;
	private String senha;
	private String nome;
	private String sobrenome;
	public Usuario(String nome, String sobrenome, String username, String senha) {
		this.nome =nome;
		this.sobrenome = sobrenome;
		this.username = username;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Usuario() {
	}
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
