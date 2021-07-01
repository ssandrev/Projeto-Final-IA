package psr;

import java.util.ArrayList;

public class CasoTeste2 {

	private final Horario[][] horario= new Horario[10][6];
	
	public CasoTeste2(){
		for (int i = 0; i<10;i++) {
			for(int j = 0;j<6;j++) {
				this.horario[i][j] = new Horario(1);
			}
		}
		horario[0][0].setMateria(0, "COMP0409");
		horario[1][0].setMateria(0, "COMP0409");
		horario[0][2].setMateria(0, "COMP0409");
		horario[1][2].setMateria(0, "COMP0409");
		
		horario[0][4].setMateria(0, "COMP0438");
		horario[1][4].setMateria(0, "COMP0438");
		horario[2][4].setMateria(0, "COMP0438");
		horario[3][4].setMateria(0, "COMP0438");
		
		horario[2][1].setMateria(0, "COMP0412");
		horario[3][1].setMateria(0, "COMP0412");
		horario[2][3].setMateria(0, "COMP0412");
		horario[3][3].setMateria(0, "COMP0412");
		
		horario[4][0].setMateria(0, "COMP0408");
		horario[5][0].setMateria(0, "COMP0408");
		horario[4][2].setMateria(0, "COMP0408");
		horario[5][2].setMateria(0, "COMP0408");
		
		horario[7][0].setMateria(0, "COMP0461");
		horario[8][0].setMateria(0, "COMP0461");
		horario[7][2].setMateria(0, "COMP0461");
		horario[8][2].setMateria(0, "COMP0461");
		
		
	}
	public Horario[][] getHorario() {
		return this.horario;
	}
	
	public String toString()
	{
	    String es = new String();

	    for(int i = 0; i < 10; i++)
	        {
	            for(int j = 0; j < 6; j++)
	                {
	                    es += "[";
	                    es += horario[i][j].getHoras();
	                    es += "]";
	                }
	            es += '\n';
	        }
	    System.out.println();
	    System.out.println("Your matrix: ");
	    return es;
	}
	
	public String resultadoString()
	{
	    String es = new String();
	    ArrayList<String> dia_semana = new ArrayList<String>();
	    es += "     [ Segunda][  Terca ][ Quarta ][ Quinta ][ Sexta  ][ Sabado ]\n";
	    dia_semana.add("13:00");
	    dia_semana.add("14:00");
	    dia_semana.add("15:00");
	    dia_semana.add("16:00");
	    dia_semana.add("17:00");
	    dia_semana.add("18:00");
	    dia_semana.add("19:00");
	    dia_semana.add("20:00");
	    dia_semana.add("21:00");
	    dia_semana.add("22:00");

	    for(int i = 0; i < 10; i++)
	        {
	    		es += dia_semana.get(i);
	            for(int j = 0; j < 6; j++)
	                {
	                    es += "[";
	                    if (horario[i][j].getMateria() == null){
	                    	es +="--------";
	                    }else {
	                    	es += horario[i][j].MateriaToString();
	                    }
	                    es += "]";
	                }
	            es += '\n';
	        }
	    System.out.println();
	    System.out.println("Your matrix: ");
	    return es;
	}
}
