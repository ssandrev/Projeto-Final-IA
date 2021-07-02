/*A classe está incompleta*/ 
package psr;

import java.util.ArrayList;

/*Classe para a restição global para saber se necessita do sábado*/
/*e para saber se é possível completar a tarefa*/

public class Restricao_Possivel {
	
	/*Atributo para saber se precisa do sabado*/
	private boolean isneeded;
	
	public Restricao_Possivel(){
		this.isneeded = false;
	}
	
	public boolean getIsneeded(){
		return this.isneeded;
	}
	
	public boolean Check_Sabado(ArrayList<Variavel> variaveis, Domain dominio) {
		double tempo_estudo = 0;
		double tempo_disponivel = 0;
		ArrayList<Horario> temp_Domain = dominio.getDomain();
		
		for(int i=0; i < variaveis.size(); i++){
			tempo_estudo += variaveis.get(i).Horas_Pedidas();
		}
		
		for(int i = 0; i < dominio.Domain_size(); i++) {
			/*falta contar com o sabado*/
			tempo_disponivel += temp_Domain.get(i).getHoras();
		}
		
		if (tempo_estudo > tempo_disponivel) {
			this.isneeded = true;
			tempo_disponivel += 10;
			if (tempo_estudo > tempo_disponivel) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
	}
}
