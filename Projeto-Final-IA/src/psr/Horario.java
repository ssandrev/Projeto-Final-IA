package psr;

public class Horario {
	private final int horas;
	private final String[] materia =  new String[2];
	
	public Horario(int horas) {
        this.horas = horas;
        this.materia[0] = null;
    }
	
	public void setMateria(int i, String materia) {
		this.materia[i] = materia;
	}
	
	public int getHoras() {
		return horas;
	}
	public String getMateria() {
		return materia[0];
		
	}
	public String MateriaToString() {
	    String es = new String();
	    for (int i = 0; i< 2; i++) {
	    	if (materia[i] != null) {
	    		if (i != 0) {
	    			es += "|";
	    		}
	    		es += materia[i];
	    	}
	    }
	    return es;
	}

}
