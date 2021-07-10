package aima.core.search.csp.projeto;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;
import aima.core.search.csp.examples.NotEqualConstraint;

import java.util.ArrayList;
import java.util.List;

public class WeeklyMapCSP extends CSP<Variable, TuplaIntInt>{
	
	
	public WeeklyMapCSP(ArrayList<Tupla> blocos, Horario[][] MatrixHorario) throws OutOfTimeException{
		//For para inclus�o de vari�veis na lista de Var
		int contador = 0;
		for(int i = 0; i < blocos.size(); i++) {
			for(int j=0; j < blocos.get(i).getSecond(); j++)
				addVariable(new Variable(blocos.get(i).getFirst() + (i+1) + j));
			
			//Adicionando Restri��es TableSpace e SameColumn
			for(int c=contador; c<getVariables().size()-1; c++) {
				Variable var1 = getVariables().get(c);
				Variable var2 = getVariables().get(c+1);
				addConstraint(new TableSpaceConstraint(var1, var2));
				addConstraint(new SameColumnConstraint(var1, var2));
				contador++;
			}
			
			contador++;
		}
		
		//Cria��o do dom�nio	
		
		ArrayList<TuplaIntInt> dominio = new ArrayList<TuplaIntInt>();
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				if(MatrixHorario[j][i].getHoras() != 0) {//Verifica se tem horas vagas
					dominio.add(new TuplaIntInt((2*j),i));
					dominio.add(new TuplaIntInt((2*j) + 1,i));
				}
			}
			
			//Restri��o do S�bado
			if(i == 5) {
				if(getVariables().size() <= dominio.size()) {
					break;
				}
				else {
					if(getVariables().size() > (dominio.size() +20)){//Se o tempo pedido � grande demais..
						throw new OutOfTimeException("O tempo pedido � maior do que o dispon�vel");//D� erro com essa mensagem
					}
				}
			}
		}
		
		Domain<TuplaIntInt> horarios = new Domain<>(dominio);
		
		//Setar o dom�nio das vari�veis para ser igual ao definido
		for(Variable var : getVariables())
			setDomain(var, horarios);
		
		//Setar as Restri��es
		
		//Restri��o de N�o deve ser igual
		for (int i = 0; i < getVariables().size(); i++) {
			Variable var1 = getVariables().get(i);
			for (int j = i+1; j < getVariables().size(); j++) {
				Variable var2 = getVariables().get(j);
				addConstraint(new NotEqualConstraint(var1, var2));
			}
		}
	}
}
	

