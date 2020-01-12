package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ZONAS
 * @author Winux
 */

@Entity
@Table(name = "Zonas", schema="PROYECTO", uniqueConstraints={@UniqueConstraint(name = "UK_Zonas", columnNames = {"codigo"})})
public class Zona implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_zona;
	
	@Column(nullable = false)
	private int codigo;
	
	@Column(length = 70, nullable = false)
	private String nombre;
	
	public Zona() {
		super();
	}
	
	/**
     * GETs and SETs
     */
	
	public long getId_zona() {
		return Id_zona;
	}

	public void setId_zona(long id_zona) {
		Id_zona = id_zona;
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

	private static final long serialVersionUID = 1L;
   
}
