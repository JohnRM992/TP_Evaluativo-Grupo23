package fi.unju.edu.ar.model;

import java.time.LocalDate;

public class Usuario {
	private String name;
	private String email;
	private LocalDate dateOfBirth;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String name, String email, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

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
