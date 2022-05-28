package fi.unju.edu.ar.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Candidato {
	
	@Min(value=1,message="El codigo debe ser mayor o igual a 1")
	private int codigo;
	@Min(value=1,message="El codigo debe ser mayor o igual a 1")
	private int votos;
	@NotBlank(message="El nombre de la banda o artista no puede estar en blanco)")
	private String  nombre_ArBand;
	@NotBlank(message="El genero musical no puede estar en blanco")
	private String 	genero_musical;
	@NotBlank(message="La descripcion no puede quedar en blanco")
	private String descripcion;
	
	
	
	
	
	
	//Constructores
	
	public Candidato() {
		super();
	}
	
public Candidato(int codigo, int votos, String nombre_ArBand, String genero_musical, String descripcion) {
		super();
		this.codigo = codigo;
		this.votos = votos;
		this.nombre_ArBand = nombre_ArBand;
		this.genero_musical = genero_musical;
		this.descripcion = descripcion;
	}

//	Getters y Setters
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public String getNombre_ArBand() {
		return nombre_ArBand;
	}
	public void setNombre_ArBand(String nombre_ArBand) {
		this.nombre_ArBand = nombre_ArBand;
	}
	public String getGenero_musical() {
		return genero_musical;
	}
	public void setGenero_musical(String genero_musical) {
		this.genero_musical = genero_musical;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "Candidato [codigo="+ codigo +", votos="+ votos +",nombre_ArBand="+ nombre_ArBand +",genero_musical="+ genero_musical+",descripcion="+descripcion+"]";
	}
	

}
