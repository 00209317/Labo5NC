package com.uca.capas.domain;

public class Estudiante {

	private Integer codigoEstudiante;
	private String Nombre;
	private String Apellido;
	private Integer Edad;
	private Boolean Estado;
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
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public Boolean getEstado() {
		return Estado;
	}
	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	
	public Estudiante() {
		
	}
	
	public String getEstadoDelegate() {
		if(this.Estado==null)return "";
		else {
			return Estado == true?"Activo":"Inactivo";
		}
	}
	
}
