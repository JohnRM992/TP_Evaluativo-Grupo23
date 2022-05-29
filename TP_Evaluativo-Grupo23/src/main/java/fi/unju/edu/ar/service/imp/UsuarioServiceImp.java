package fi.unju.edu.ar.service.imp;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.service.IUsuarioService;
import fi.unju.edu.ar.util.ListaUsuarios;

@Service("UsuarioServiceImp")
public class UsuarioServiceImp implements IUsuarioService{
	
		@Autowired
		private ListaUsuarios listaUsuarios;
		
		@Override
		public Usuario getUsuarios() {
			// retornar objeto de clase Candidato
			return new Usuario();
		}
		
		@Override
		public boolean guardarUsuario(Usuario usuario) {
			//guardar un objeto de tipo candidato en la lista de candidatos
			return listaUsuarios.getUsuarios().add(usuario);
		}
		
	
		@Override 
		public ListaUsuarios getListaUsuarios() {
			// retornar el objeto que accede a la lista de candidatos
			return listaUsuarios;
		}
		
		@Override
		public Usuario buscarUsuario(String name) {
			//Buscar un candidato por el codigo y devolverlo
			Optional<Usuario> usuario= listaUsuarios.getUsuarios().stream().filter(a -> a.getName() == name).findFirst();
			return usuario.get();
		}
}
