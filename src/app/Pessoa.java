package app;

public class Pessoa {
	String nome;
	int idade;
	String profissao;
	
	public Pessoa(String nome, int idade, String profissao) {
		this.nome = nome;
		this.idade= idade;
		this.profissao= profissao;
		
	}
	public void apresentar() {
		System.out.println("Olá, meu nome é: " + nome + "e eu tenho " + idade + " anos, e minha profissão é " + profissao);
	}
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Franciene", 43, "tecnica em informatica");
		pessoa1.apresentar();

	}

}






