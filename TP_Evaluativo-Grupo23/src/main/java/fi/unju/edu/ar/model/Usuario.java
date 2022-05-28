package fi.unju.edu.ar.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class Usuario {
	
	@NotBlank(message="El campo del nombre de usuario no puede quedar en blanco")
	private String nombre;
	@NotEmpty @Email
	private String email;
	private LocalDate fecha_nacimiento;
	
	
	//Constructores
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String email, LocalDate fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	//Getters Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	
	

}
