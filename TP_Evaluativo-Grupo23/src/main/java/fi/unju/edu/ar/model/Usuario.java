package fi.unju.edu.ar.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class Usuario {
	
	@NotBlank(message="El usuario no puede estar vacio")
	private String name;
	@NotEmpty(message="El campo del correo no puede quedar vacio") @Email
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
//	 private Date dateParseado = Date.from(dateOfBirth);
	 
	 
	private int edad;

	
	//Constructores
	public Usuario() {
		super();
	}
	
	public Usuario(String name, String email, LocalDate dateOfBirth, int edad) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.edad = edad;
	}

	//Getters Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getEdad() {
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(dateOfBirth, ahora);
		int edad = periodo.getYears();
		System.out.println("Edad: " + edad);
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
		return "Usuario [name=" + name + ", email=" + email + "]";
	}
	
}

