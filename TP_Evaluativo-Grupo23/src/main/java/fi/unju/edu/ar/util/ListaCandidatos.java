package fi.unju.edu.ar.util;


import java.util.ArrayList;
import org.springframework.stereotype.Component;
import fi.unju.edu.ar.model.Candidato;

@Component
public class ListaCandidatos {
	
	private ArrayList<Candidato> candidatos;
	
	public ListaCandidatos() {
		//creacion ArrayList
		candidatos = new ArrayList<Candidato>();
		//candidato por defecto??
		
		candidatos.add(new Candidato(1,0,"Metallica","Rock/Metal","Metallica es una banda estadounidense de thrash metal​ originaria de Los Ángeles, pero con base en San Francisco desde febrero de 1983"));
		
	}
	public ArrayList<Candidato> getCandidatos(){
		return candidatos;
	}
	
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

}
