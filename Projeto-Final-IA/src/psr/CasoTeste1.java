package psr;

public class CasoTeste1 {
	private final Horario[][] horario= new Horario[10][6];
	
	public CasoTeste1(){
		for (int i = 0; i<10;i++) {
			for(int j = 0;j<6;j++) {
				this.horario[i][j] = new Horario(1, "--");
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

	    for(int i = 0; i < 10; i++)
	        {
	            for(int j = 0; j < 6; j++)
	                {
	                    es += "[";
	                    es += horario[i][j].MateriaToString();
	                    es += "]";
	                }
	            es += '\n';
	        }
	    System.out.println();
	    System.out.println("Your matrix: ");
	    return es;
	}
}
