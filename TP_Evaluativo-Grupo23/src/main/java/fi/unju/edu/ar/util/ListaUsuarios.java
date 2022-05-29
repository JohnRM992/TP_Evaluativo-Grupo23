package fi.unju.edu.ar.util;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import fi.unju.edu.ar.model.Usuario;

@Component
public class ListaUsuarios {
	
private ArrayList<Usuario> usuarios;
	
	public ListaUsuarios() {
		//creacion ArrayList
		usuarios = new ArrayList<Usuario>();
		//
		
		
		
	}
	public ArrayList<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


}
