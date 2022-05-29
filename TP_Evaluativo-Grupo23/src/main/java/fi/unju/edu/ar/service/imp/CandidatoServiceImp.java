package fi.unju.edu.ar.service.imp;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.service.ICandidatoService;
import fi.unju.edu.ar.util.ListaCandidatos;

@Service("CandidatoServiceImpList")
public class CandidatoServiceImp implements ICandidatoService{
	
		@Autowired
		private ListaCandidatos listaCandidatos;
		
		@Override
		public Candidato getCandidato() {
			// retornar objeto de clase Candidato
			return new Candidato();
		}
		
		@Override
		public boolean guardarCandidato(Candidato candidato) {
			//guardar un objeto de tipo candidato en la lista de candidatos
			return listaCandidatos.getCandidatos().add(candidato);
		}
		
		@Override
		public void modificarCandidato(Candidato candidato) {
			//Buscar un candidato con codigo y actualizarlo
			for(Candidato candi : listaCandidatos.getCandidatos()) {
					if(candi.getCodigo() == candidato.getCodigo()) {
						candi.setNombre_ArBand(candidato.getNombre_ArBand());
						candi.setGenero_musical(candidato.getGenero_musical());
						candi.setDescripcion(candidato.getDescripcion());
						candi.setVotos(candidato.getVotos());
					}
			}
			
		}
		
		@Override
		public void eliminarCandidato(int codigo) {
			// TODO
			
		}
		
		@Override 
		public ListaCandidatos getListaCandidatos() {
			// retornar el objeto que accede a la lista de candidatos
			return listaCandidatos;
		}
		
		@Override
		public Candidato buscarCandidato(int codigo) {
			//Buscar un candidato por el codigo y devolverlo
			Optional<Candidato> candidato= listaCandidatos.getCandidatos().stream().filter(a -> a.getCodigo() == codigo).findFirst();
			return candidato.get();
		}
}
