package psr;

public class Variavel {
	private final String nome;
	private final int horas;
	
	public Variavel(String nome, int horas) {
        this.nome = nome;
        this.horas = horas;
    }

	public int getHoras() {
		return horas;
	}

	public String getNome() {
		return nome;
	}
}
