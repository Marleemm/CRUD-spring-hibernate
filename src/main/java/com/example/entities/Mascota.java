package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "Nombre")
	private String nombre;

	@Column (name = "Edad")
	private int edad;

	@Column (name = "Descripcion")
	private String descripcion;
	
	
	@Column (name = "Tipo")
	private String tipo;

	
	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", descripcion=" + descripcion
				+ ", tipo=" + tipo + "]";
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo() {
		return tipo;
	}


	
	public Mascota() {
		
	}
	
	
	
	public Mascota(String nombre, int edad, String descripcion, String tipo) {
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
		this.tipo = tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
