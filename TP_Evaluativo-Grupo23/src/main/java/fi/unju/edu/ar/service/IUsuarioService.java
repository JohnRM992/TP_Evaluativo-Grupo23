package fi.unju.edu.ar.service;



import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.util.ListaUsuarios;
public interface IUsuarioService {

	public ListaUsuarios getListaUsuarios();
	public Usuario getUsuarios();
	public boolean guardarUsuario(Usuario usuario);
	public Usuario buscarUsuario(String name);
}
