package main;

import psr.CasoTeste1;
import psr.Horario;

public class main {
	
	public static void main(String[] args) {
		CasoTeste1 c = new CasoTeste1();
		Horario[][] x = c.getHorario();
		System.out.println(c.toString());
		x[1][1].setMateria(0, "andre");
		System.out.println(x[1][1].MateriaToString());
		
		System.out.println(c.resultadoString());

	}
}
