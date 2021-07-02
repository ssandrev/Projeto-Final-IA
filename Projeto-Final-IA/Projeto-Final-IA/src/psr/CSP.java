package psr;

import java.util.ArrayList;

public class CSP {
	private final ArrayList<Variavel> variaveis;
	private Domain dominio;
	private final ArrayList<Restricao_Possivel> restricoes;
	private final Horario[][] horario= new Horario[10][6];
	
	public CSP(Horario[][] tabela_horario, ArrayList<Variavel> lista_var){
		
		this.variaveis = lista_var;
		
		ArrayList<Horario> tabela_provisoria = new ArrayList<Horario>(); 
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				this.horario[i][j] = tabela_horario[i][j];
				if(tabela_horario[i][j].getMateria1() == "Vazio") {
					tabela_provisoria.add(tabela_horario[i][j]);
				}
			}
		}
		
		this.dominio.setDomain(tabela_provisoria);
		
		
	}
}

