package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DEPARTAMENTO
 * @author Winux
 */
@Entity
@Table(name = "Departamentos", schema="PROYECTO")
public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_Departamento;	
	
	@Column(nullable = false)
	private int codigo;
	
	@Column (length = 60, nullable = false)
	private String nombre;
	
	@ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	@JoinColumn(name = "Id_zona")
	private Zona zona;
	
	public Departamento() {
		super();
	}
	
	/**
     * GETs and SETs
     */
	
	public long getId_Departamento() {
		return Id_Departamento;
	}


	public void setId_Departamento(long id_Departamento) {
		Id_Departamento = id_Departamento;
	}


	public int getCodigo() {
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

}