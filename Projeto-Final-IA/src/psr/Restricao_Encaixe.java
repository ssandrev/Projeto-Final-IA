package psr;

public class Restricao_Encaixe {
	private Domain dominio;
	private Horario horario_encaixe;
	private Variavel para_encaixar;
	
	public Restricao_Encaixe(Domain dominio, Horario horario_escolhido, Variavel variavel_encaixe){
		this.dominio = dominio;
		this.horario_encaixe = horario_escolhido;
		this.para_encaixar = variavel_encaixe;
	}
	
	public boolean Tudo_Certo() {
		double fator_de_possibilidade = this.para_encaixar.Horas_Pedidas();        
		
		
		return false;
	}
}
