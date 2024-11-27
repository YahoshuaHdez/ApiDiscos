package com.mx.ApiDiscos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "DISCOS")
public class Discos {

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	private Integer idD;
	
	@Column(name = "NOBRE", columnDefinition = "VARCHAR2(70)", nullable = false)
	private String nombre;
	
	@Column(name = "GENERO", columnDefinition = "VARCHAR2(70)", nullable = false)
	private String genero;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private Float precio;

	public Discos() {
		super();
	}

	public Discos(Integer idD, String nombre, String genero, Float precio) {
		super();
		this.idD = idD;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Discos [idD=" + idD + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]\n";
	}

	public Integer getIdD() {
		return idD;
	}

	public void setIdD(Integer idD) {
		this.idD = idD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	
}
