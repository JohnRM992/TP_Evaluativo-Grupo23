package fi.unju.edu.ar.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import fi.unju.edu.ar.util.ListaCandidatos;

@Component
public class Candidato {
	
	@Min(value=1,message="El codigo debe ser mayor o igual a 1")
	private int codigo;
	private int codigo2 = 1;


	@Min(value=0, message="La cantidad de votos debe ser un numero no negativo")
	private int votos;
	@NotBlank(message="El nombre de la banda o artista no puede estar en blanco)")
	private String  nombre_ArBand;
	@NotBlank(message="El genero musical no puede estar en blanco")
	private String 	genero_musical;
	@NotBlank(message="La descripcion no puede quedar en blanco")
	private String descripcion;
	private int totalVotos;
	
	
	


	//@Autowired
	//private ListaCandidatos listaCandidatos;
	//Constructores
	


	public Candidato() {
		super();
	}
	
public Candidato(int codigo, int codigo2,int votos, String nombre_ArBand, String genero_musical, String descripcion) {
		super();
		this.codigo = codigo;
		this.codigo2 = codigo2;
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
	
	public int getCodigo2() {
		return codigo2 + 1;
	}

	public void setCodigo2(int codigo2) {
		this.codigo2 = codigo2;
	}
	
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos + getVotos();
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
	
	public int getTotalVotos() {
		
//		int i = 0;
//		
//		for(Candidato candi : listaCandidatos.getCandidatos()) {
//			
//			if(candi.getVotos() >= listaCandidatos.getCandidatos().size() ) {
//				
//				i = i + getVotos();
//				
//				break;
//			}
//			
//		}
		return totalVotos + getVotos();
	}

	public void setTotalVotos(int totalVotos) {
		
		
		this.totalVotos = totalVotos;
	}
	
	@Override
	public String toString() {
		return "Candidato [codigo="+ codigo +", votos="+ votos +",nombre_ArBand="+ nombre_ArBand +",genero_musical="+ genero_musical+",descripcion="+descripcion+"]";
	}
	

}
