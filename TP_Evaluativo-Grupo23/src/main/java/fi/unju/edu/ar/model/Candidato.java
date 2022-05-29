package fi.unju.edu.ar.model;

public class Candidato {
	private String codigo;
	private String nombre;
	private String generoMusical;
	private String descripcion;
	private long cantVotos;
	
	public Candidato() {
		// TODO Auto-generated constructor stub
	}

	public Candidato(String codigo, String nombre, String generoMusical, String descripcion, long cantVotos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.generoMusical = generoMusical;
		this.descripcion = descripcion;
		this.cantVotos = cantVotos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getCantVotos() {
		return cantVotos;
	}

	public void setCantVotos(long cantVotos) {
		this.cantVotos = cantVotos;
	}

	@Override
	public String toString() {
		return "Candidato [codigo=" + codigo + ", nombre=" + nombre + ", generoMusical=" + generoMusical
				+ ", descripcion=" + descripcion + ", cantVotos=" + cantVotos + "]";
	}
	
}
