package main;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
import psr.CasoTeste1;
import psr.CasoTeste2;
import psr.CasoTeste3;
import psr.Horario;
import psr.Variavel;
import psr.listaVariaveis;

public class main {
	
	public static void main(String[] args) {
		CasoTeste1 teste1 = new CasoTeste1();
		CasoTeste2 teste2 = new CasoTeste2();
		CasoTeste3 teste3 = new CasoTeste3();
		Horario[][] x = teste3.getHorario();
		//x[1][1].setMateria(1, "andre");
		//System.out.println(x[1][1].MateriaToString());
		
		System.out.println(teste2.resultadoString());
		Pair<ArrayList<Double>, ArrayList<ArrayList<Double>>> horasTotais = teste2.horasTotaisSS();
		System.out.println(horasTotais);
		
		listaVariaveis lista = new listaVariaveis();
		
		List<Variavel> list1 = lista.getCaso1();
		List<Variavel> list2 = lista.getCaso2();
		List<Variavel> list3 = lista.getCaso3();
		String es = "";
		for (int i = 0; i < list1.size(); i++) {
			es += '[';
			es += list1.get(i).getNome();
			es += '|';
			es += list1.get(i).getBloco();
			es += ']';
            }
		
		es += '\n';
		
		for (int i = 0; i < list2.size(); i++) {
			es += '[';
			es += list2.get(i).getNome();
			es += '|';
			es += list2.get(i).getBloco();
			es += ']';
		    }
		
		es += '\n';
		
		for (int i = 0; i < list3.size(); i++) {
			es += '[';
			es += list3.get(i).getNome();
			es += '|';
			es += list3.get(i).getBloco();
			es += ']';
		    }
		
		System.out.println(es);
		
		
	}
	
	
	public void listaVar(int casoTeste) {
		
	}
	
	
}
