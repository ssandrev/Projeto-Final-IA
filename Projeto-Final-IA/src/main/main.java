package main;

import psr.CasoTeste1;
import psr.CasoTeste2;
import psr.CasoTeste3;
import psr.Horario;

public class main {
	
	public static void main(String[] args) {
		CasoTeste1 teste1 = new CasoTeste1();
		CasoTeste2 teste2 = new CasoTeste2();
		CasoTeste3 teste3 = new CasoTeste3();
		Horario[][] x = teste3.getHorario();
		//x[1][1].setMateria(1, "andre");
		//System.out.println(x[1][1].MateriaToString());
		
		System.out.println(teste1.resultadoString());

	}
}
