package fi.unju.edu.ar.service;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.util.ListaCandidatos;
public class ICandidatoService {
	
	public Candidato getCandidato();
	public boolean guardarCandidato(Candidato candidato);
	public void modificarCandidato(Candidato candidato);
	public eliminarCandidato(int codigo);
	public ListaCandidatos getListaCandidatos();

}
