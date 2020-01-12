package com.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LOCALIDADES
 * @author Winux
 */
@Entity
@Table(name = "Localidades", schema="PROYECTO", uniqueConstraints={@UniqueConstraint(name = "UK_Localidades", columnNames = {"codigo"})})
public class Localidad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(nullable = false)
	private long Id_localidad;
	
	@Column(nullable = false)
	private int codigo;
	
	@Column(length = 60, nullable = false)
	private String nombre;
	
	@Column(precision = 2, scale = 5, nullable = false)
	private BigDecimal latitud;
	
	@Column(precision = 2, scale = 5, nullable = false)
	private BigDecimal longitud;
	
	@ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	@JoinColumn(name = "Id_departamento")
	private Departamento departamento;
	
	public Localidad() {
		super();
	}
	
	/**
     * GETs and SETs
     */
		
	public long getId_localidad() {
		return Id_localidad;
	}

	public void setId_localidad(long id_localidad) {
		Id_localidad = id_localidad;
	}

	public Number getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	private static final long serialVersionUID = 1L;

   
}
