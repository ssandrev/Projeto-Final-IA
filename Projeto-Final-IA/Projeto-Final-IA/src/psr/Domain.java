package psr;

/* Class que guarda as posições livres na tabela de horários*/

import java.util.ArrayList;

public class Domain {
	private ArrayList<Horario> domain = new ArrayList<Horario>(60);
	
	public Domain(ArrayList<Horario> dominio){
		this.domain = dominio;
	}

	public ArrayList<Horario> getDomain() {
		return domain;
	}
	
	public void setDomain(ArrayList<Horario> tabela){
		this.domain = tabela;
	}
	
	public int Domain_size() {
		return domain.size();
	}
}

