package psr;

public class Variavel {
	private final String nome;
	private final int bloco;
	
	public Variavel(String nome, int bloco) {
        this.nome = nome;
        this.bloco = bloco;
    }
	
	public String getNome() {
		return nome;
	}

	public int getBloco() {
		return bloco;
	}
}
