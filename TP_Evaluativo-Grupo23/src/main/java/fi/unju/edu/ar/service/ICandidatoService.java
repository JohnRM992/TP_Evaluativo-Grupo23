package fi.unju.edu.ar.service;


import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.util.ListaCandidatos;

public interface ICandidatoService {
	public ListaCandidatos getListaCandidatos();
	public Candidato getCandidatos();
	public boolean guardarCandidato(Candidato candidato);
	public int contarVotos();
	public void modificarCandidato(Candidato candidato);
	public void eliminarCandidato(int codigo);

	public Candidato buscarCandidato(int codigo);

}
