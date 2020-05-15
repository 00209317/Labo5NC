package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {

	@Id
	@Column(name = "c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoEstudiante;

	@Column(name = "nombre")
	@Size(message = "El nombre no debe tener más de 50 caracteres", max=50)
	@NotEmpty(message = "No puede ser vacío")
	private String Nombre;

	@Column(name = "apellido")
	@Size(message = "El apellido no debe tener más de 50 caracteres", max=50)
	@NotEmpty(message = "No puede ser vacío")
	private String Apellido;

	@Column(name = "carne")
	@Size(message = "El carne no debe tener más de 10 caracteres", max=10)
	@NotEmpty(message = "No puede ser vacío")
	private String Carne;

	@Column(name = "carrera")
	@Size(message = "La carrera no debe tener más de 100 caracteres", max=100)
	@NotEmpty(message = "No puede ser vacío")
	private String Carrera;

	public Estudiante() {

	}

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCarne() {
		return Carne;
	}

	public void setCarne(String carne) {
		Carne = carne;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

}
