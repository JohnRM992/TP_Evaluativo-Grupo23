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
	private String name;
	@NotEmpty @Email
	private String email;
	private LocalDate dateOfBirth;


	//Constructores
	public Usuario() {
		super();
	}
	
	public Usuario(String name, String email, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	//Getters Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	public static int getAge(LocalDate dateOfBirth) {
		return LocalDate.now().getYear() - dateOfBirth.getYear();
	}
	
	
	

}

