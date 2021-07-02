package psr;

import java.util.ArrayList;

import javafx.util.Pair;

public class CasoTeste1 {
	private final Horario[][] horario= new Horario[10][6];
	
	public CasoTeste1(){
		for (int i = 0; i<10;i++) {
			for(int j = 0;j<6;j++) {
				this.horario[i][j] = new Horario(1);
			}
		}
		horario[2][1].setMateria(0, "COMP0455");
		horario[3][1].setMateria(0, "COMP0455");
		horario[2][3].setMateria(0, "COMP0455");
		horario[3][3].setMateria(0, "COMP0455");
		
		horario[6][3].setMateria(0, "COMP0481");
		horario[7][3].setMateria(0, "COMP0481");
		
		horario[8][0].setMateria(0, "COMP0408");
		horario[9][0].setMateria(0, "COMP0408");
		horario[8][2].setMateria(0, "COMP0408");
		horario[9][2].setMateria(0, "COMP0408");
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

	    return es;
	}
	
	private ArrayList<ArrayList<Double>> horasVagas() {
		
		ArrayList<ArrayList<Double>> vagas = new ArrayList<ArrayList<Double>>(6);
		
		double vago = 0;
		
		for(int i = 0; i < 6; i++)
        {
			ArrayList<Double> d1 = new ArrayList<Double>();
            for(int j = 0; j < 10; j++)
                {
            		
                    if (horario[j][i].getMateria() == null){
                    	vago ++;
                    }else {
                    	vago += horario[i][j].getHoras();
                    	if(vago > 0)    d1.add(vago);
                    	vago = 0;
                    }
                }
            if(vago > 0)    d1.add(vago);
            vago = 0;
            vagas.add(d1);
        }
		return vagas;
	}
	
	public Pair<ArrayList<Double>, ArrayList<ArrayList<Double>>> horasTotaisSS() {
		ArrayList<Double> total = new ArrayList<Double>(2);
		
		ArrayList<ArrayList<Double>> horasV = this.horasVagas();
		double horas = 0;
		for (int i = 0; i < horasV.size(); i++) {
            for (int j = 0; j < horasV.get(i).size(); j++) {
               horas += horasV.get(i).get(j);
            }
            if (i >= 4){
            	total.add(horas);
            }
            
        }
		
		return new Pair<ArrayList<Double>, ArrayList<ArrayList<Double>>>(total,horasV);
	}
}
